package com.springSecurity.client.service;

import com.springSecurity.client.entity.User;
import com.springSecurity.client.entity.VerificationToken;
import com.springSecurity.client.model.UserModel;

import java.util.Optional;

public interface UserService {
    public User registerUser(UserModel userModel);

    public void saveVerificationTokenForUser(String token, User user);

    public String validateVerificationToken(String token);

    public VerificationToken generateNewVerificationToken(String oldToken);

    public User findByEmail(String email);

    public void createPasswordResetTokenForUser(User user, String token);

   public String validatePasswordResetToken(String token);

   public Optional<User> getUserByPasswordResetToken(String token);

    public void changePassword(User user, String newPassword);

    public boolean checkIfOldPasswordValid(User user, String oldPassword);
}
