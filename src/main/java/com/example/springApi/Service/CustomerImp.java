package com.example.springApi.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springApi.Model.Customer;
import com.example.springApi.Repository.CustomerRepository;

@Service
public class CustomerImp implements customerService {

private final CustomerRepository customerRepository;

@Autowired
public CustomerImp(CustomerRepository customerRepository) {
    this.customerRepository = customerRepository;
}

    @Override
    public List<Customer> getCustomers() {
       
        return customerRepository.findAll();
    }

    @Override
    public Customer saveCustomer(Customer customer) {
    return customerRepository.save(customer);
    }
    
    
}
