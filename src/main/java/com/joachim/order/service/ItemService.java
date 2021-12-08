package com.joachim.order.service;

import com.joachim.order.domain.items.Item;
import com.joachim.order.repository.ItemRepository;
import org.springframework.stereotype.Service;

@Service
public class ItemService {
    private final ItemRepository itemRepository;

    public ItemService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    public void addItem(Item item) {
        itemRepository.addItem(item);
    }
}
