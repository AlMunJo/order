package com.joachim.order.api.customer.dtos;

import com.joachim.order.domain.Address;

public record CustomerDto(String uuid,
                          String firstName,
                          String lastName,
                          String emailAddress,
                          String phoneNumber,
                          Address address) {
}
