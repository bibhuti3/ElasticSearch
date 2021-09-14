package com.stackroute.elasticservice.controller;


import com.stackroute.elasticservice.model.Product;
import com.stackroute.elasticservice.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1")
public class ElasticSearchController {

    @Autowired
    private ProductRepository repository;

    @PostMapping("/saveProduct")
    public int saveCustomer(@RequestBody List<Product> products) {
        repository.saveAll(products);
        return products.size();
    }

    @GetMapping("/findAll")
    public Iterable<Product> findAllProducts() {
        return repository.findAll();
    }

    @GetMapping("/findByProductName/{productName}")
    public List<Product> findByFirstName(@PathVariable String productName) {
        return repository.findByProductName(productName);
    }

}
