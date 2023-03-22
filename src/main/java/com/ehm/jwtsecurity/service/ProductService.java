package com.ehm.jwtsecurity.service;

import com.ehm.jwtsecurity.entity.Product;
import com.ehm.jwtsecurity.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    public List<Product> findAll(){
        return productRepository.findAll();
    }

}
