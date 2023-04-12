package com.example.mongodbreactive.util;

import com.example.mongodbreactive.model.AddressModel;
import com.example.mongodbreactive.model.CustomerModel;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.stereotype.Component;

@Component
public class TemplateDatabaseLoader {
    @Bean
    CommandLineRunner initialize(MongoOperations mongo){
        return args -> {
            mongo.save(new CustomerModel(null,"Solt","solt@gmail.com","gdoooo",
                    new AddressModel("line1","1111","Yangon")));
            mongo.save(new CustomerModel(null,"psa","psa@gmail.com","booo",
                    new AddressModel("line2","2222","Mandalay")));
            mongo.save(new CustomerModel(null,"bb","bb@gmail.com","wooo",
                    new AddressModel("line3","3333","Chin")));

        };
    }
}
