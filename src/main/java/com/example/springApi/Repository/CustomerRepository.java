package com.example.springApi.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.springApi.Model.Customer;
import org.springframework.stereotype.Repository;



@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    
}
