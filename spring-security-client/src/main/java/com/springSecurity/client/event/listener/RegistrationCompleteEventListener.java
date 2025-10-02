package com.springSecurity.client.event.listener;

import com.springSecurity.client.entity.User;
import com.springSecurity.client.event.RegistrationCompleteEvent;
import com.springSecurity.client.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;

import java.util.UUID;

public class RegistrationCompleteEventListener implements ApplicationListener<RegistrationCompleteEvent> {

    @Autowired
    private UserService userService;

    @Override
    public void onApplicationEvent(RegistrationCompleteEvent event) {
        // Create the Verification Token for the user with Link

        User user = event.getUser();
        String token = UUID.randomUUID().toString();

        userService.saveVerificationTokenForUser(token, user);
        // Send Mail to user
    }
}
