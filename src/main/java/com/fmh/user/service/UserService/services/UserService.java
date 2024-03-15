package com.fmh.user.service.UserService.services;

import com.fmh.user.service.UserService.entities.User;

import java.util.List;

public interface UserService {

    //Create User
    User saveUser(User user);

    //Get All Users
    List<User> getAllUser();

    //Get Single User by ID
    User getUser(String userId);

    //TODO: delete
    //TODO: update
}
