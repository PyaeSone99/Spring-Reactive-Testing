package com.example.mongodbreactive.service;

import com.example.mongodbreactive.model.CustomerModel;
import com.example.mongodbreactive.repo.CustomerRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import java.time.Duration;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }


    public Flux<CustomerModel> findAllCustomers(){
        return customerRepository.findAll().delayElements(Duration.ofSeconds(3));
    }

}
