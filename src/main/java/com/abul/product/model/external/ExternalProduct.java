package com.abul.product.model.external;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ExternalProduct {

    private String productId;

    private String title;

    private ExternalPrice price;

    private List<ExternalColorSwatch> colorSwatches;
}

