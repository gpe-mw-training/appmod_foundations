package com.redhat.coolstore.productcataloglab1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import com.redhat.coolstore.productcataloglab1.service.ProductCatalogService;

@ActiveProfiles("dev")
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCatalogLab1ApplicationTests {

    @Autowired
    private ProductCatalogService productCatalogService;
    
	@Test
	public void contextLoads() {
	}

    @Test
    public void testDefaultProductList() {
        String message = productCatalogService.sayHello();
        assertTrue(message!=null);
        assertEquals(message,"Hey Developer!");
    }	
}
