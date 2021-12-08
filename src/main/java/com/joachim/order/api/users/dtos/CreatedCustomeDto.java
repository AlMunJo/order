package com.joachim.order.api.users.dtos;

import com.joachim.order.domain.Address;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public record CreatedCustomeDto(@NotNull @Size(min = 2, max = 30) String firstName,
                                @NotNull @Size(min = 2, max = 30) String lastName,
                                @NotNull @Email String emailAddress, String phoneNumber,
                                Address address) {
}