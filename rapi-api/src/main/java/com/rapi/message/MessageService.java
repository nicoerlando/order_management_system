package com.rapi.message;

import com.rapi.message.dto.MessageRequest;
import com.rapi.message.parser.MessageParser;
import org.springframework.stereotype.Service;

@Service
public class MessageService {

    private final MessageParser messageParser;

    public MessageService(MessageParser messageParser) {
        this.messageParser = messageParser;
    }

    public void processMessage(MessageRequest request) {

        var orderDraft = messageParser.parse(request.message());

        // Later:
        // 1. Find customer
        // 2. Validate products
        // 3. Create order
        // 4. Save order
    }
}
