package com.example.springApi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.springApi.Model.Customer;
import com.example.springApi.Service.customerService;


@RestController //this is the combination of @Controller and @ResponseBody
@RequestMapping(value = "/api/v1/customers")
public class cusomerController {
    
    @Autowired
    private customerService cService;

    //handler to fetch the customer list
    @GetMapping
public List<Customer> getCustomers(){
    return cService.getCustomers();
}


//this handler fetch one customer using path (id)
@GetMapping("/{id}") 
public String getCustomer(@PathVariable Long id){

    return "Fetching customer with id " + id ;
}

@PostMapping
public Customer saveCustomer(@RequestBody Customer customer ){

    return cService.saveCustomer(customer);
    
}

@DeleteMapping("/{id}")
public String deleteCustomer(@RequestParam Long id){

    return "Deleting customer with id " + id;
}

}
