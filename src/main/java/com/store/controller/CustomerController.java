package com.store.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.store.entity.Customer;
import com.store.service.CustomerService;

@RestController
@RequestMapping("api/customer")
public class CustomerController {
    
    @Autowired
    private CustomerService customerService;

    /**
     * Method to save a customer in db
     * @param customer
     * @return
     */
    @PostMapping("/save")
    public ResponseEntity<Customer> saveCustomer(@RequestBody Customer customer){
        Customer customerSaved = customerService.saveCustomer(customer);
        return new ResponseEntity<Customer>(customerSaved, HttpStatus.CREATED);
    }

    /**
     * Method to list all the customers in the db
     * @return
     */
    @GetMapping("/getAll")
    public ResponseEntity<List<Customer>> getAllCustomers(){
        List<Customer> customerList = customerService.listCustomers();
        return new ResponseEntity<List<Customer>>(customerList, HttpStatus.OK);
    }

    /**
     * Method to get one customer by the Id
     */
    public void getCustomerById(){

    }
}
