package com.joachim.order.repository;

import com.joachim.order.domain.Customer;
import org.springframework.stereotype.Repository;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Repository
public class CustomerRepository {
    private final Map<String, Customer> customers;

    public CustomerRepository() {
        this.customers = new ConcurrentHashMap<>();
    }

    public void addCustomer(Customer customer){
        this.customers.put(customer.getUuid(),customer);
    }

    public Customer getCustomerByEmail(String emailAddress){
        return customers.values()
                .stream()
                .filter(customer -> customer.getEmailAdress().equals(emailAddress))
                .findFirst()
                .orElse(null);
    }
}
