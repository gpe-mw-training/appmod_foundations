package com.redhat.coolstore.productcatalog;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/products")
public class ProductCatalogService {

    @Value("${coolstore.message:Hello World!}")
    private String message;

	@Autowired
	private ProductRepository productRepository;
    
    public String sayHello() {    		
        return message;
    }
    
    @ResponseBody
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)    
    public List<Product> list() {    		
        return productRepository.findAll();
    }
    
}
