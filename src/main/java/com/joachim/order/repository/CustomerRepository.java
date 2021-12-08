package com.joachim.order.repository;

import com.joachim.order.domain.users.Admin;
import com.joachim.order.domain.users.Customer;
import org.springframework.stereotype.Repository;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Repository
public class CustomerRepository {
    private final Map<String, Customer> customers;
    private final Map<String, Admin> admins;

    public CustomerRepository() {
        this.customers = new ConcurrentHashMap<>();
        this.admins = new ConcurrentHashMap<>();
    }

    public void addCustomer(Customer customer){
        this.customers.put(customer.getUuid(),customer);
    }

    public Customer getCustomerByEmail(String emailAddress){
        return customers.values()
                .stream()
                .filter(customer -> customer.getEmailAddress().equals(emailAddress))
                .findFirst()
                .orElse(null);
    }
}
