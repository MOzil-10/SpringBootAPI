package com.example.springApi.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springApi.Model.Customer;
import com.example.springApi.Repository.CustomerRepository;

@Service
public class CustomerImp implements customerService {

    @Autowired
private CustomerRepository customerRepo;

    @Override
    public List<Customer> getCustomers() {
       
        return customerRepo.findAll();
    }

    @Override
    public Customer saveCustomer(Customer customer) {
    return customerRepo.save(customer);
    }
    
    
}
