package com.abul.productapi.service;

import com.abul.productapi.model.Product;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;
import java.util.Optional;

import static org.junit.Assert.assertNotNull;

/**
 * Integration tests for {@link ProductService}.
 * NOTE: Very comprehensive unit tests for {@link ProductService} is provided in {@link ProductServiceTest}.
 */
@ExtendWith(SpringExtension.class)
@SpringBootTest
public class ProductServiceIT {

    @Autowired
    private ProductService productService;

    /**
     * NOTE Since we are not in control of the external API's data, and it could change, I did not write tests that
     * make assumptions against the data. A simple test to verify the integration was written instead.
     * See {@link ProductServiceTest} for very comprehensive unit tests.
     */
    @Test
    public void getProductsShouldReturnProducts() {
        final List<Product> products = productService.getProducts(Optional.empty());
        assertNotNull(products);
    }
}