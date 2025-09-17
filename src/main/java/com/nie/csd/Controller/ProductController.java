package com.nie.csd.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nie.csd.Services.ProductServices;
import com.nie.csd.models.Products;

@RestController
public class ProductController {

  @Autowired
    private ProductServices service;

    // Return a list of products
    @GetMapping("/products")
    public List<Products> getAllProducts() {
        return service.getAllProducts();
    }


    // public String getProducts() {
    //     return "List of products";
    // }
    @GetMapping("/products/{id}")
    public Products getProductsById(@PathVariable("id") String id)  {
        return service.getByProductsId(id);
    }
    
    @PostMapping("/products")
    public Products addProducts(@RequestBody Products product) {
        return service.addProducts(product);
      }
}

   
