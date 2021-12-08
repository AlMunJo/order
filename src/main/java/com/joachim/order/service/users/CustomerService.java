package com.joachim.order.service.users;

import com.joachim.order.domain.users.Customer;
import com.joachim.order.exception.EmailAlreadyUsedException;
import com.joachim.order.repository.CustomerRepository;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    private final CustomerRepository userRepository;

    public CustomerService(CustomerRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void addCustomer(Customer customer) throws EmailAlreadyUsedException {
        if (this.userRepository.getCustomerByEmail(customer.getEmailAddress()) != null)
            throw new EmailAlreadyUsedException(customer.getEmailAddress() + " is already used.");

        this.userRepository.addCustomer(customer);
    }
}

