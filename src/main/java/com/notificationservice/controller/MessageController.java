package com.notificationservice.controller;

import com.notificationservice.request.CreateMessageRequest;
import com.notificationservice.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/message")
public class MessageController {

    @Autowired
    MessageService messageService;

    @PostMapping
    public ResponseEntity<String> sendMessage(@RequestBody CreateMessageRequest createMessageRequest) {
        return ResponseEntity.ok().body(messageService.send(createMessageRequest));
    }

}
