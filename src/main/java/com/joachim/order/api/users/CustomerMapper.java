package com.joachim.order.api.users;

import com.joachim.order.api.users.dtos.CreatedCustomerDto;
import com.joachim.order.api.users.dtos.CustomerDto;
import com.joachim.order.domain.users.Customer;

public class CustomerMapper {
    public static CustomerDto modelToDto(Customer customer){
        return new CustomerDto(
                customer.getId(),
                customer.getFirstName(),
                customer.getLastName(),
                customer.getEmailAddress(),
                customer.getPhoneNumber(),
                customer.getAddress());
    }

    public static Customer dtoToModel(CreatedCustomerDto createdCustomeDto){
        return new Customer(
                createdCustomeDto.firstName(),
                createdCustomeDto.lastName(),
                createdCustomeDto.emailAddress(),
                createdCustomeDto.password(),
                createdCustomeDto.phoneNumber(),
                createdCustomeDto.address());
    }
}
