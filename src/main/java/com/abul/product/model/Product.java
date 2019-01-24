package com.abul.product.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * External product model.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Product {

    private String productId;

    private String title;

    private List<ColorSwatch> colorSwatches;

    private String nowPrice;

    private String priceLabel;
}
