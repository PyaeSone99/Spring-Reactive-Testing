package com.example.springreactiveconsumer.proxy;

import com.example.springreactiveconsumer.model.CustomerModel;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;

@Component
public class CustomerProxy {

    private final WebClient webClient;

    public CustomerProxy(WebClient webClient) {
        this.webClient = webClient;
    }

    public Flux<CustomerModel> getAll(){
        return webClient.get().uri("/customers").exchangeToFlux(res -> res.bodyToFlux(CustomerModel.class));
    }
}
