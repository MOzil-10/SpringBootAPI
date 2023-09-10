package com.example.springApi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.springApi.Model.Customer;
import com.example.springApi.Service.customerService;


@RestController //this is the combination of @Controller and @ResponseBody
public class cusomerController {
    
    @Autowired
    private customerService cService;

    //handler to fetch the customer list
    @GetMapping( "/customers")
public List<Customer> getCustomers(){
    return cService.getCustomers();
}


//this handler fetch one customer using path (id)
@GetMapping("/customers/{id}") 
public String getCustomer(@PathVariable Long id){

    return "Fetching customer with id " + id ;
}

@PostMapping("/customers")
public String saveCustomer(@RequestBody Customer customer ){

    return "Saving customer " + customer;
}

@DeleteMapping("/customers")
public String deleteCustomer(@RequestParam Long id){

    return "Deleting customer with id " + id;
}

}
