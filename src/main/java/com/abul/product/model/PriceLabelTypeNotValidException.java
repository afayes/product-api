package com.abul.product.model;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class PriceLabelTypeNotValidException extends RuntimeException {

    public PriceLabelTypeNotValidException(final String priceLabelType) {
        super("Price label type " + priceLabelType + "is not valid");
    }
}
