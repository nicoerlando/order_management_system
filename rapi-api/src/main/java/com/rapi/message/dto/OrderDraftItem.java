package com.rapi.message.dto;

public record OrderDraftItem(
        String productName,
        int quantity
) {
}
