package com.rapi.message.dto;

public record MessageRequest(
        String customerPhone,
        String message
) {
}
