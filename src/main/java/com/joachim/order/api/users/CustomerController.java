package com.joachim.order.api.users;


import com.joachim.order.api.users.dtos.CreatedCustomeDto;
import com.joachim.order.api.users.dtos.CustomerDto;
import com.joachim.order.domain.users.Customer;
import com.joachim.order.service.users.CustomerService;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping(path = "customers")
public class CustomerController {
    private CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping(consumes = "application/json", produces = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public CustomerDto createCustomerAccount(@Valid @RequestBody CreatedCustomeDto createdCustomeDto, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            throw new RuntimeException(bindingResult.toString());
        }

        Customer customer = CustomerMapper.dtoToModel(createdCustomeDto);
        customerService.addCustomer(customer);
        return CustomerMapper.modelToDto(customer);
    }
}
