package com.rapi.message.parser;

import com.rapi.message.dto.OrderDraft;

public interface MessageParser {

    OrderDraft parse(String message);
}