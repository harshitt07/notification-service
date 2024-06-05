package com.notificationservice.implementation;

import org.springframework.stereotype.Component;

@Component
public interface NotificationSender {

    public void send(String to, String subject, String message);

}
