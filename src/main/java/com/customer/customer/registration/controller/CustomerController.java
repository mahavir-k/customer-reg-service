package com.customer.customer.registration.controller;

import com.customer.customer.registration.dto.CustomerRequest;
import com.customer.customer.registration.dto.CustomerResponse;
import com.customer.customer.registration.service.CustomerRegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/customer") // root URL
public class CustomerController {

    @Autowired
    private CustomerRegistrationService service;

    @PostMapping("/register")
    public CustomerResponse SaveCustomer(@RequestBody CustomerRequest customer){
        return service.saveCustomer(customer);
    }
    @GetMapping("/detail/{id}")
    public boolean isCustomer(@PathVariable("id") int id) {
        return service.isCustomer(id);
    }
}
