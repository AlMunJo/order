package com.joachim.order.domain;

import java.util.UUID;

public class Customer {
    private final String Uuid;
    private String firstName;
    private String lastName;
    private String emailAddress;
    private String phoneNumber;
    private Address address;

    public Customer(String firstName, String lastName, String emailAddress, String phoneNumber, Address address) {
        this.Uuid = UUID.randomUUID().toString();
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public String getUuid() {
        return Uuid;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmailAdress() {
        return emailAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Address getAddress() {
        return address;
    }
}
