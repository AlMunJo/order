package com.joachim.order.api.items.item.dtos;

import javax.validation.constraints.NotNull;

public record CreatedItemDto(
        @NotNull String name,
        String description,
        @NotNull Integer amount,
        @NotNull Double price
        ) { }
