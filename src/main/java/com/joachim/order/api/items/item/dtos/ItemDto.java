package com.joachim.order.api.items.item.dtos;

public record ItemDto(
        Long id,
        String name,
        String description,
        Integer amount,
        Double price
) {
}
