package com.customer.customer.registration.service;


import com.customer.customer.registration.dto.CustomerRequest;
import com.customer.customer.registration.dto.CustomerResponse;
import com.customer.customer.registration.entity.CustomerEntity;
import com.customer.customer.registration.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CustomerRegistrationService {
    @Autowired
    private CustomerRepository repository;
    String successResponseType = "SUCCESS";

    public CustomerResponse saveCustomer(CustomerRequest customerRequest) {


        CustomerEntity customerEntity = new CustomerEntity();

        customerEntity.setCustId(customerRequest.getCustId());
        customerEntity.setCustAdd(customerRequest.getCustAdd());
        customerEntity.setContactNo(customerRequest.getContactNo());
        customerEntity.setCustName(customerRequest.getCustName());
        customerEntity.setGender(customerRequest.getGender());
        customerEntity.setEmailId(customerRequest.getEmailid());
        customerEntity.setStatus(customerRequest.getStatus());



        CustomerEntity entity = repository.save(customerEntity);

        // Convert entity to response
        CustomerResponse response = new CustomerResponse();
        response.setCustId(customerEntity.getCustId());
        response.setContactNo(customerEntity.getContactNo());
        response.setGender(customerEntity.getGender());
        response.setEmailId(customerEntity.getEmailId());
        response.setCustAdd(customerEntity.getCustAdd());
        response.getCustName(customerEntity.getCustName());
        response.setStatus(customerEntity.getStatus());

        return response;
    }
}
