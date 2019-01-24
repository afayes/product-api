package com.abul.productapi.service;

public class ProductServiceException extends RuntimeException {

    public ProductServiceException(final String message, final Throwable cause) {
        super(message, cause);
    }
}
