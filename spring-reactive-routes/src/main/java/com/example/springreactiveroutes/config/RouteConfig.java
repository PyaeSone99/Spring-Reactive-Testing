package com.example.springreactiveroutes.config;

import com.example.springreactiveroutes.handler.ProductHandler;
import com.example.springreactiveroutes.model.Product;
import com.example.springreactiveroutes.service.ProductService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RouterFunctions.route;
import static org.springframework.web.reactive.function.server.ServerResponse.ok;

@Configuration
public class RouteConfig {


    @Bean
    public RouterFunction<ServerResponse> router(ProductHandler handler){
        return route().GET("/products", handler::getAll).build();
    }
}
