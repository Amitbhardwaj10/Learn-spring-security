package com.springSecurity.client.service;

import com.springSecurity.client.entity.User;
import com.springSecurity.client.model.UserModel;

public interface UserService {
    public User registerUser(UserModel userModel);

    public void saveVerificationTokenForUser(String token, User user);
}
