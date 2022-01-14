package com.joachim.order.api.items.item;

import com.joachim.order.api.items.item.dtos.CreatedItemDto;
import com.joachim.order.api.items.item.dtos.ItemDto;
import com.joachim.order.service.items.item.ItemService;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping(path = "items")
public class ItemController {

    private ItemService itemService;

    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    @PostMapping(consumes = "application/json",produces = "application/json")
    @ResponseStatus(HttpStatus.OK)
    public ItemDto storeNewItem(@Valid @RequestBody CreatedItemDto createdItemDto, BindingResult bindingResult){
        if(bindingResult.hasErrors())
            throw new RuntimeException(bindingResult.toString());

        return this.itemService.addNewItem(createdItemDto);
    }
}
