package com.abul.productapi.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ColorSwatch {

    private String color;

    private String rgbColor;

    private String skuid;

    /**
     *  * color<String>
     *  * rgbColor<String> which is an RGB  representation of the basicColor in a six digit hexadecimal format, e.g. “F0A1C2”.
     *  * skuid<String>
     */
}
