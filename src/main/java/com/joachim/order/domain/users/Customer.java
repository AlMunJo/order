package com.joachim.order.domain.users;

import com.joachim.order.domain.Address;

public class Customer extends User {
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private Address address;

    public Customer(String firstName,
                    String lastName,
                    String emailAddress,
                    String phoneNumber,
                    Address address) {
        super(emailAddress, Role.CUSTOMER);
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setAddress(Address address) {
        this.address = address;
    }


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Address getAddress() {
        return address;
    }
}
