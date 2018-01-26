package com.redhat.coolstore.productcatalog;

import org.springframework.beans.factory.annotation.Autowired;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import com.redhat.coolstore.productcatalog.ProductCatalogService;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("dev")
public class ProductCatalogApplicationTests {

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
