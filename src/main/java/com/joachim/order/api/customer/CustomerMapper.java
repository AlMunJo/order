package com.joachim.order.api.customer;

import com.joachim.order.api.customer.dtos.CreatedCustomeDto;
import com.joachim.order.api.customer.dtos.CustomerDto;
import com.joachim.order.domain.Customer;

public class CustomerMapper {
    public static CustomerDto modelToDto(Customer customer){
        return new CustomerDto(
                customer.getUuid(),
                customer.getFirstName(),
                customer.getLastName(),
                customer.getEmailAdress(),
                customer.getPhoneNumber(),
                customer.getAddress());
    }

    public static Customer dtoToModel(CreatedCustomeDto createdCustomeDto){
        return new Customer(
                createdCustomeDto.firstName(),
                createdCustomeDto.lastName(),
                createdCustomeDto.emailAddress(),
                createdCustomeDto.phoneNumber(),
                createdCustomeDto.address());
    }
}
