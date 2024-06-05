package com.notificationservice.request;

import com.notificationservice.enums.MessageType;
import lombok.Data;

@Data
public class CreateMessageRequest {
    String message;
    String subject;
    MessageType messageType;
    String destinationEmail;
}
