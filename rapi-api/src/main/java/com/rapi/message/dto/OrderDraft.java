package com.rapi.message.dto;

import java.util.List;

public record OrderDraft(
        List<OrderDraftItem> items
) {
}
