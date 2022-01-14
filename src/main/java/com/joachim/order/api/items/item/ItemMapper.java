package com.joachim.order.api.items.item;

import com.joachim.order.api.items.item.dtos.CreatedItemDto;
import com.joachim.order.api.items.item.dtos.ItemDto;
import com.joachim.order.domain.items.Item;

public class ItemMapper {
    public static ItemDto modelToDto(Item item){
        return new ItemDto(item.getId(),
                item.getName(),
                item.getDescription(),
                item.getAmount(),
                item.getPrice());
    }

    public static Item dtoToModel(CreatedItemDto createdItemDto){
        return new Item(createdItemDto.name(),
                createdItemDto.description(),
                createdItemDto.amount(),
                createdItemDto.price());
    }
}
