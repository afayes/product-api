package com.abul.product.model;

import lombok.Getter;

public enum Currency {
    GBP("£");

    @Getter
    private final String symbol;

    Currency(final String symbol) {
        this.symbol = symbol;
    }
}
