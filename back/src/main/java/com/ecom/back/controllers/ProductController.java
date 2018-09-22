package com.ecom.back.controllers;


import com.ecom.back.model.Product;
import com.ecom.back.repositories.ProductRepo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {


    private final ProductRepo productRepo;

    public ProductController(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }

    @GetMapping("/products")
    private List<Product> getProducts(){
        return  productRepo.findAll();
    }

    @GetMapping("/product/{code}")
    private Product getProductByCode(@PathVariable("code") String code){
        return productRepo.getProductByCode(code);
    }
}
