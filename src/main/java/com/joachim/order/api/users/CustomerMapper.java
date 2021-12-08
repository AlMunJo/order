package com.joachim.order.api.users;

import com.joachim.order.api.users.dtos.CreatedCustomeDto;
import com.joachim.order.api.users.dtos.CustomerDto;
import com.joachim.order.domain.users.Customer;

public class CustomerMapper {
    public static CustomerDto modelToDto(Customer customer){
        return new CustomerDto(
                customer.getUuid(),
                customer.getFirstName(),
                customer.getLastName(),
                customer.getEmailAddress(),
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
