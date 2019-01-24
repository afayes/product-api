package com.abul.product.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * External color swatch model.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ColorSwatch {

    private String color;

    private String rgbColor;

    private String skuid;
}
