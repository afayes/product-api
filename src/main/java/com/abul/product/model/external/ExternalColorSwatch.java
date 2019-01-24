package com.abul.product.model.external;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ExternalColorSwatch {

    private String color;

    private String basicColor;

    private String skuId;

}


