package com.codevivek.jdbexample.redhatjdgdemo.repository;


import com.codevivek.jdbexample.redhatjdgdemo.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<User,String> {
    public User getUserByPan(String pan);
}
