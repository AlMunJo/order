package com.joachim.order.api.users.dtos;

import com.joachim.order.domain.Address;

public record CustomerDto(long id,
                          String firstName,
                          String lastName,
                          String emailAddress,
                          String phoneNumber,
                          Address address) {
}
