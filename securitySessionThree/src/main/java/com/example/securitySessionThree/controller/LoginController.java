package com.example.securitySessionThree.controller;

import com.example.securitySessionThree.model.Customer;
import com.example.securitySessionThree.payload.CustomerRequest;
import com.example.securitySessionThree.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class LoginController {
    @Autowired
    private CustomerRepository customerRepository;

    @PostMapping("/register")
    public ResponseEntity<String> registerUser(@RequestBody CustomerRequest customer) {
        Customer savedCustomer = null;
        ResponseEntity response = null;
        Customer newCustomer = Customer.builder()
                .email(customer.getEmail())
                .pwd(customer.getPwd())
                .role(customer.getRole())
                .build();
        try {
            savedCustomer = customerRepository.save(newCustomer);
            if (savedCustomer.getId() > 0) {
                response = ResponseEntity
                        .status(HttpStatus.CREATED)
                        .body("Given user details are successfully registered");
            }
        } catch (Exception ex) {
            response = ResponseEntity
                    .status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("An exception occured due to " + ex.getMessage());
        }
        return response;
    }

}
