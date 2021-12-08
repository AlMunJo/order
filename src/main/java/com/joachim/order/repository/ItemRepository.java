package com.joachim.order.repository;

import com.joachim.order.domain.items.Item;
import org.springframework.stereotype.Repository;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Repository
public class ItemRepository {
    private final Map<String, Item> items;

    public ItemRepository() {
        this.items = new ConcurrentHashMap<>();
    }

    public void addItem(Item item) {
        this.items.put(item.getUuid(), item);
    }
}
