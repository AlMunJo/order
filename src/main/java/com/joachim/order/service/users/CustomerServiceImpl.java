package com.joachim.order.service.users;

import com.joachim.order.api.users.CustomerMapper;
import com.joachim.order.api.users.dtos.CreatedCustomerDto;
import com.joachim.order.api.users.dtos.CustomerDto;
import com.joachim.order.domain.users.Customer;
import com.joachim.order.repository.users.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CustomerServiceImpl implements CustomerService{

    private final CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }


    @Override
    public Customer addNewCustomer(CreatedCustomerDto customer)  {
        Customer newCustomer = CustomerMapper.dtoToModel(customer);

//        if (this.customerRepository.existsById(newCustomer.getEmailAddress()))
//            throw new EmailAlreadyUsedException(newCustomer.getEmailAddress() + " is already used.");

        return this.customerRepository.save(newCustomer);
    }

    @Override
    public Customer getOneCustomer(Long customer_id) {
        return this.customerRepository.findById(customer_id).orElse(null);
    }

    @Override
    public List<Customer> getAllCustomer() {
        return this.customerRepository.
                findAll();
    }
}

