package com.example.springreactiver2dbc.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Getter
@Setter
public class Product {
    @Id
    private int Id;
    private String name;
}
