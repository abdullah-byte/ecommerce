package com.ecommerce.ecom.service;

import com.ecommerce.ecom.dto.ProductDto;
import com.ecommerce.ecom.model.Product;
import com.ecommerce.ecom.repo.ProductRepo;
import org.springframework.stereotype.Service;

@Service
public class ProductServices {
    private final ProductRepo productRepo;

    public ProductServices(ProductRepo productRepo){
        this.productRepo = productRepo;
    }

    public Object addProduct(ProductDto productDto){
        Product product = new Product();
        product.setName(productDto.getName());
        product.setDescription(productDto.getDescription());
        product.setPrice(productDto.getPrice());
        product.setStockQuantity(productDto.getStockQuantity());
        return productRepo.save(product);
    }

    public Object fetchProduct(){
        return productRepo.findAll();
    }
}
