package com.stackroute.elasticservice.repository;

import com.stackroute.elasticservice.model.Product;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface ProductRepository extends ElasticsearchRepository<Product, UUID> {
    List<Product> findByProductName(String productName);
}
