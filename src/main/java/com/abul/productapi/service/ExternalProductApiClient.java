package com.abul.productapi.service;

import com.abul.productapi.model.external.ExternalProducts;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "external-product-api-client", url = "${externalProductApiUrl}")
public interface ExternalProductApiClient {

    @RequestMapping(method = RequestMethod.GET)
    ExternalProducts getProducts();
}
