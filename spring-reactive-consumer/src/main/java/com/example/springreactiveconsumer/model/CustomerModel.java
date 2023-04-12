package com.example.springreactiveconsumer.model;
import lombok.Data;



@Data
public class CustomerModel {
    String customerId;
    String companyName;
    String companyEmail;
    String taxId;

    AddressModel billingAddress;

    public CustomerModel() {
    }

    public CustomerModel(String customerId, String companyName, String companyEmail, String taxId, AddressModel billingAddress) {
        this.customerId = customerId;
        this.companyName = companyName;
        this.companyEmail = companyEmail;
        this.taxId = taxId;
        this.billingAddress = billingAddress;
    }
}
