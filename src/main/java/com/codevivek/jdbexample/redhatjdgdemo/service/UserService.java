package com.codevivek.jdbexample.redhatjdgdemo.service;


import com.codevivek.jdbexample.redhatjdgdemo.caching.DataGridCacheHelper;
import com.codevivek.jdbexample.redhatjdgdemo.models.User;
import com.codevivek.jdbexample.redhatjdgdemo.repository.UserRepository;
import org.infinispan.client.hotrod.RemoteCache;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

@Service
public class UserService {

    private static final Logger LOGGER = Logger.getLogger( UserService.class.getName() );

    @Autowired
    private UserRepository repository;

    DataGridCacheHelper cacheUtil = new DataGridCacheHelper();
    RemoteCache<String,User> remoteCache = cacheUtil.getRemoteCache("user-by-pan", DataGridCacheHelper.getRemoteCacheManagerInstance());

    public User getUserDataByPan(String pan)
    {
        User userdata;

        if (cacheUtil.checkKeyInCache(remoteCache,pan) ){
            userdata = (User) cacheUtil.getValueFromCache(remoteCache,pan);
            LOGGER.log(Level.INFO,"Getting data from the cache");
        }
        else{
            LOGGER.log(Level.INFO,"Getting data from db");
            userdata = repository.getUserByPan(pan);
            if (userdata != null){
                cacheUtil.putValueinCacheAsync(remoteCache,pan,userdata);
            }
            return userdata;
        }

        return userdata;
    }

    public List<User> getAllUser() {
        List<User> users = new ArrayList<>();
        repository.findAll().forEach(users::add);
        return users;
    }

    public void saveUserData(User user) {
        LOGGER.log(Level.INFO,"Inserting data");
        repository.save(user);
    }

    public void deleteUserByPan(String pan) {

        if (cacheUtil.checkKeyInCache(remoteCache,pan)){
            LOGGER.log(Level.INFO,"Deleting data from cache and DB");
            cacheUtil.deleteValueFromCache(remoteCache,pan);
        }
        else{
            LOGGER.log(Level.INFO,"Deleting data from DB");
        }
        repository.deleteById(pan);
    }
}
