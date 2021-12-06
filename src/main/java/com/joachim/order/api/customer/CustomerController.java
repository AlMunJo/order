package com.joachim.order.api.customer;


import com.joachim.order.api.customer.dtos.CreatedCustomeDto;
import com.joachim.order.api.customer.dtos.CustomerDto;
import com.joachim.order.domain.Customer;
import com.joachim.order.service.CustomerService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "customers")
public class CustomerController {
    private CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping(consumes = "application/json", produces = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public CustomerDto createCustomerAccount(@RequestBody CreatedCustomeDto createdCustomeDto) {
        Customer customer = CustomerMapper.dtoToModel(createdCustomeDto);
        customerService.addCustormer(customer);
        return CustomerMapper.modelToDto(customer);
    }
}
