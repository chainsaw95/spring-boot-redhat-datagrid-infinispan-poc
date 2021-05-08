package com.codevivek.jdbexample.redhatjdgdemo.controllers;


import com.codevivek.jdbexample.redhatjdgdemo.models.User;
import com.codevivek.jdbexample.redhatjdgdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService service;

    @GetMapping("/user")
    public List<User> getUser(){
        return service.getAllUser();
    }

    @GetMapping("/user/{pan}")
    public User getUserByPan(@PathVariable String pan){
        return  service.getUserDataByPan(pan);
    }

    @PostMapping("/user")
    public void submitUserData(@RequestBody User user){
        service.saveUserData(user);
    }

    @DeleteMapping("/user/{pan}")
    public void deleteUserByPan(@PathVariable String pan){
        service.deleteUserByPan(pan);
    }


}
