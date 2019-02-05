package com.redhat.coolstore.productcataloglab1.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductCatalogService {

    @Value("${coolstore.message:Hello World!}")
    private String message;
    
    @GetMapping("/products")
    public String sayHello() {
        return message;
    }	
}
