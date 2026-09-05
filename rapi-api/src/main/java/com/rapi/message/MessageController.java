package com.rapi.message;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class MessageController {

    private final MessageService messageService;

    public MessageController(MessageService messageService) {
        this.messageService = messageService;
    }

    @PostMapping
    public ResponseEntity<Void> receiveMessage(
            @RequestBody MessageRequest request
    ) {
        messageService.processMessage(request);

        return ResponseEntity.ok().build();
    }
}
