package com.abul.productapi.service;

import com.abul.productapi.model.Product;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;
import java.util.Optional;

import static org.junit.Assert.assertTrue;

/**
 * Integration tests for {@link ProductService}.
 * Note: comprehensive tests for {@link ProductService} is provided in {@link ProductServiceTest}.
 */
@ExtendWith(SpringExtension.class)
@SpringBootTest
public class ProductServiceIT {

    @Autowired
    private ProductService productService;

    @Test
    public void getProductsShouldReturnProducts() {
        final List<Product> products = productService.getProducts(Optional.empty());
        assertTrue(products.size() > 0);
    }
}