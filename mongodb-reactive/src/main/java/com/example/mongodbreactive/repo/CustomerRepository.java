package com.example.mongodbreactive.repo;

import com.example.mongodbreactive.model.CustomerModel;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface CustomerRepository extends ReactiveMongoRepository<CustomerModel,Integer> {
}
