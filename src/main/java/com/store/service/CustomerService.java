package com.store.service;

import java.util.List;

import com.store.entity.Customer;

public interface CustomerService {
    
    /**
     * Method to save a customer in db
     * @param customer
     * @return
     */
    public Customer saveCustomer(Customer customer);

    /**
     * Method to return all the Customers saved in db
     * @return
     */
    public List<Customer> listCustomers();
}
