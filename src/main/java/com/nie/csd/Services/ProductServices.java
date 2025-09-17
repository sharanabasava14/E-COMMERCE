package com.nie.csd.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nie.csd.Repositories.ProductRepository;
import com.nie.csd.models.Products;

@Service
public class ProductServices {
    
    @Autowired
    ProductRepository repository;

    public List<Products> getAllProducts() {
        return repository.findAll();
    }

    public Products getByProductsId(String id) {
        return repository.findById(id).get();
    }

    public Products addProducts(Products products) {
        return repository.save(products);
    }

    
}