package com.joachim.order.api.users;


import com.joachim.order.api.users.dtos.CreatedCustomerDto;
import com.joachim.order.api.users.dtos.CustomerDto;
import com.joachim.order.service.users.CustomerServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(path = "customers")
public class CustomerController {
    private CustomerServiceImpl customerService;

    public CustomerController(CustomerServiceImpl customerService) {
        this.customerService = customerService;
    }

    @PostMapping(consumes = "application/json", produces = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public CustomerDto createCustomerAccount(@Valid @RequestBody CreatedCustomerDto createdCustomeDto, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            throw new RuntimeException(bindingResult.toString());
        }
        return CustomerMapper.modelToDto(this.customerService.addNewCustomer(createdCustomeDto));
    }

    @GetMapping(params="id",produces= "application/json")
    @ResponseStatus(HttpStatus.OK)
    public CustomerDto getOneCustomer(@RequestParam Long id){
        return CustomerMapper.modelToDto(this.customerService.getOneCustomer(id));
    }

    @GetMapping(produces= "application/json")
    @ResponseStatus(HttpStatus.OK)
    public List<CustomerDto> getOneCustomer(){
        return this.customerService.getAllCustomer().stream().map(e->CustomerMapper.modelToDto(e)).collect(Collectors.toList());
    }

}
