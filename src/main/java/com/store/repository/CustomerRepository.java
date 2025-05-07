package com.store.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.store.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>{
    
}
