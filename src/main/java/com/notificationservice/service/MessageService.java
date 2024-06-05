package com.notificationservice.service;

import com.notificationservice.factory.NotificationSenderFactory;
import com.notificationservice.implementation.NotificationSender;
import com.notificationservice.request.CreateMessageRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageService {

    NotificationSender notificationSender;

    @Autowired
    NotificationSenderFactory notificationSenderFactory;

    public String send(CreateMessageRequest createMessageRequest) {
        notificationSender = notificationSenderFactory.getNotificationInstance(createMessageRequest.getMessageType());
        notificationSender.send(createMessageRequest.getDestinationEmail(), createMessageRequest.getSubject(), createMessageRequest.getMessage());
        return "Successfully sent the Email!";
    }

}
