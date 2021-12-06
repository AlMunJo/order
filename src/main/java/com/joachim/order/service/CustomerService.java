package com.joachim.order.service;

import com.joachim.order.domain.Customer;
import com.joachim.order.exception.EmailAlreadyUsedException;
import com.joachim.order.repository.CustomerRepository;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    private CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public void addCustormer(Customer customer) throws EmailAlreadyUsedException {
        if (this.customerRepository.getCustomerByEmail(customer.getEmailAdress()) != null)
            throw new EmailAlreadyUsedException(customer.getEmailAdress() + " is already used.");

        this.customerRepository.addCustomer(customer);
    }
}
