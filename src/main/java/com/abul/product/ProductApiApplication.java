package com.abul.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Application entry point.
 */
@SpringBootApplication
@EnableFeignClients(basePackages = {"com.abul.product.service"})
public class ProductApiApplication {

    public static void main(final String[] args) {
        SpringApplication.run(ProductApiApplication.class, args);
    }
}

