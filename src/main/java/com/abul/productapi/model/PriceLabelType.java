package com.abul.productapi.model;

import java.util.Arrays;

public enum PriceLabelType {
    SHOW_WAS_NOW("ShowWasNow"),
    SHOW_WAS_THEN_NOW("ShowWasThenNow"),
    SHOW_PERC_DISCOUNT("ShowPercDscount");

    private final String value;

    PriceLabelType(final String value) {
        this.value = value;
    }

    public PriceLabelType parse(final String value) {
        return Arrays.stream(values())
                .filter(priceLabelType -> priceLabelType.value.equals(value))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Value " + value + " is not valid"));
    }
}
