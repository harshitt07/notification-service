package com.notificationservice.factory;

import com.notificationservice.enums.MessageType;
import com.notificationservice.implementation.EmailNotificationSender;
import com.notificationservice.implementation.NotificationSender;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class NotificationSenderFactory {

    private final EmailNotificationSender emailNotificationSender;

    public NotificationSender getNotificationInstance(MessageType messageType) {
        NotificationSender notificationSender;
        switch (messageType) {
            case EMAIL:
                notificationSender = emailNotificationSender;
                break;
            default:
                notificationSender = null;
        }
        return notificationSender;
    }

}
