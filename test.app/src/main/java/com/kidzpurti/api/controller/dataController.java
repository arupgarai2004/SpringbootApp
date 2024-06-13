package com.kidzpurti.api.controller;

import com.kidzpurti.api.dao.entity.ProductEntity;
import com.kidzpurti.api.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/products")

public class dataController {
    @Autowired
    private ProductService productService;


    @GetMapping
    public List<ProductEntity> getall() {

        return productService.getAllProduct();
    }

    @PostMapping
    public ProductEntity createProduct(@RequestBody ProductEntity product) {
        return productService.createProduct(product);
    }

    @GetMapping("/{id}")
    public ProductEntity getProduct(@PathVariable Long id)
    {
        return productService.getProduct(id);
    }

    @DeleteMapping("/{id}")
    public String deleteProduct(@PathVariable Long id) {
        productService.deleteProduct(id);
        return "Product Deleted Successfully";
    }

    @PutMapping("/{id}")
    public ProductEntity updateProduct(@PathVariable Long id, @RequestBody ProductEntity productDetails) {
        productDetails.setId(id); // Set the ID to ensure the correct product is updated
       return productService.createProduct(productDetails);
    }





}
