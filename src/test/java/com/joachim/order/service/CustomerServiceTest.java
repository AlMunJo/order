package com.joachim.order.service;

import com.joachim.order.domain.users.Customer;
import com.joachim.order.exception.EmailAlreadyUsedException;
import com.joachim.order.repository.CustomerRepository;
import com.joachim.order.service.users.CustomerService;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class CustomerServiceTest {

    @Test
    void addCustomer_whenTwoCustomerWithSameEmailIsAdded_thenThrowingEmailAlreadyUsedException() {
        CustomerService customerService = new CustomerService(new CustomerRepository());

        Customer customer1 = new Customer(null, "benoit", "ben@benoit.com", "07262739238", null);
        Customer customer2 = new Customer("Marco", "boulon", "ben@benoit.com", "04679289238", null);

        Assertions.assertThatExceptionOfType(EmailAlreadyUsedException.class).isThrownBy(
                ()->{
                    customerService.addCustomer(customer1);
                    customerService.addCustomer(customer2);
                }
        );
    }
}