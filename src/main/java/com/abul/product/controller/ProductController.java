package com.abul.product.controller;

import com.abul.product.model.PriceLabelType;
import com.abul.product.model.Product;
import com.abul.product.service.ProductService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController()
public class ProductController {

    static final String URL_PRODUCTS = "/products";

    static final String QUERY_PARAM_LABEL_TYPE = "labelType";

    private final ProductService productService;

    public ProductController(final ProductService productService) {
        this.productService = productService;
    }

    @RequestMapping(method = RequestMethod.GET, path = URL_PRODUCTS)
    public List<Product> getProducts(@RequestParam(name = QUERY_PARAM_LABEL_TYPE, required = false) final Optional<String> priceLabelTypeOp) {
        if (!priceLabelTypeOp.isPresent()) {
            return productService.getProducts(Optional.empty());
        }

        final PriceLabelType priceLabelType = PriceLabelType.parse(priceLabelTypeOp.get());
        return productService.getProducts(Optional.of(priceLabelType));
    }
}
