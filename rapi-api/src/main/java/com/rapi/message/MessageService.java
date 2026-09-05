package com.rapi.message;

import org.springframework.stereotype.Service;

public class MessageService {

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
}
