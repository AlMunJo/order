package com.joachim.order.service.items.item;

import com.joachim.order.api.items.item.ItemMapper;
import com.joachim.order.api.items.item.dtos.CreatedItemDto;
import com.joachim.order.api.items.item.dtos.ItemDto;
import com.joachim.order.domain.items.Item;
import com.joachim.order.repository.items.ItemRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemServiceImpl implements ItemService{
    private final ItemRepository itemRepository;

    public ItemServiceImpl(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    public ItemDto addNewItem(CreatedItemDto createdItemDto) {
        if(createdItemDto == null)
            throw new IllegalArgumentException("item cannot be null");
        Item item = ItemMapper.dtoToModel(createdItemDto);
        return ItemMapper.modelToDto(itemRepository.save(item));
    }

    @Override
    public List<Item> getItems(List<Long> itemGroupIds) {
        return itemRepository.findAllById(itemGroupIds);
    }
}
