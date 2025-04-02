package com.customer.customer.registration.controller;

import com.customer.customer.registration.dto.CustomerRequest;
import com.customer.customer.registration.dto.CustomerResponse;
import com.customer.customer.registration.service.CustomerRegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/customer") // root URL
public class CustomerController {

    @Autowired
    private CustomerRegistrationService service;

    @PostMapping("/register")
    public CustomerResponse SaveCustomer(@RequestBody CustomerRequest customer){
        return service.saveCustomer(customer);
    }
    // Test commit
}
