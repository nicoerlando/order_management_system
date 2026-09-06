package com.rapi.message.parser;

import com.rapi.message.dto.OrderDraft;

public class RuleBasedMessageParser implements MessageParser{

    @Override
    public OrderDraft parse(String message) {
        // use regex here or some spltting
        return null;
    }
}
