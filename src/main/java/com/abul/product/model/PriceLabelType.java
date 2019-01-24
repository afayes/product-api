package com.abul.product.model;

import lombok.Getter;

import java.util.Arrays;

public enum PriceLabelType {
    SHOW_WAS_NOW("ShowWasNow"),
    SHOW_WAS_THEN_NOW("ShowWasThenNow"),
    // ShowPercDscount does not seem to be spelled correctly but I kept it consistent with the specification
    SHOW_PERC_DISCOUNT("ShowPercDscount");

    @Getter
    private final String value;

    PriceLabelType(final String value) {
        this.value = value;
    }

    public static PriceLabelType parse(final String value) {
        return Arrays.stream(values())
                .filter(priceLabelType -> priceLabelType.value.equals(value))
                .findFirst()
                .orElseThrow(() -> new PriceLabelTypeNotValidException(value));
    }
}
