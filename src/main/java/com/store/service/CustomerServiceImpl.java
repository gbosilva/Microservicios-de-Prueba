package com.store.service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.store.entity.Customer;
import com.store.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService{


    @Autowired
    private CustomerRepository customerRepository;

    /**
     * Method to save a customer in db
     * @param customer
     * @return
     */
    @Override
    public Customer saveCustomer(Customer customer) {

        LocalDate today = LocalDate.now();
        LocalTime now = LocalTime.now();

        LocalDateTime date = LocalDateTime.of(today, now);

        // LocalDateTime currentDateTime = LocalDateTime.now();
        customer.setCreateDate(date);
        Customer customerSaved = customerRepository.save(customer);
        return customerSaved;
    }

    /**
     * Method to return all the Customers saved in db
     * @return
     */
    @Override
    public List<Customer> listCustomers() {
        List<Customer> customerList = customerRepository.findAll();

        return customerList;
    }
    
}
