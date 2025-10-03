package com.springSecurity.client.event.listener;

import com.springSecurity.client.event.ResendVerificationTokenEvent;
import com.springSecurity.client.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class ResendTokenEventListener implements ApplicationListener<ResendVerificationTokenEvent> {

    @Autowired
    private UserService userService;

    @Override
    public void onApplicationEvent(ResendVerificationTokenEvent event) {
        String url = event.getApplicationUrl() + "/verifyRegistration?token=" + event.getVerificationToken().getToken();

        // sendVerificationEmail()
        log.info("Click the link to verify your account: {}", url);
    }
}
