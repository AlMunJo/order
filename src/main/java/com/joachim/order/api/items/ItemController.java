package com.joachim.order.api.items;

import com.joachim.order.api.items.dtos.CreatedItemDto;
import com.joachim.order.api.items.dtos.ItemDto;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "item")
public class ItemController {

    @PostMapping(consumes = "application/json",produces = "application/json")
    @ResponseStatus(HttpStatus.OK)
    public ItemDto createAndStoreItem(@RequestBody CreatedItemDto createdItemDto){
        return null;
    }
}
