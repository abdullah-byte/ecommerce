package com.ecommerce.ecom.controller;

import com.ecommerce.ecom.dto.ProductDto;
import com.ecommerce.ecom.service.ProductServices;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/product")
public class ProductController {

    private final ProductServices productServices;

    public ProductController(ProductServices productServices){
        this.productServices = productServices;
    }

    @PostMapping(value = "/add")
    public Object addProduct(@RequestBody ProductDto productDto){
        return productServices.addProduct(productDto);
    }

    @GetMapping("/api/product")
    public Object fetchProduct(){
        return productServices.fetchProduct();
    }



}
