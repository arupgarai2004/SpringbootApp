package com.kidzpurti.api.service;

import com.kidzpurti.api.dao.entity.ProductEntity;
import com.kidzpurti.api.dao.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

public List<ProductEntity> getAllProduct(){
    return productRepository.findAll();
}

    public ProductEntity createProduct(ProductEntity product) {
        return productRepository.save(product);
    }

    public ProductEntity getProduct(Long id) {

        return productRepository.findById(id).get();
    }
    public void deleteProduct(Long id){
        productRepository.deleteById(id);
    }


}
