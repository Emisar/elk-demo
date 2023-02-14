package com.example.elkdemo.service.impl;

import com.example.elkdemo.entity.Product;
import com.example.elkdemo.repository.CRUDRepository;
import com.example.elkdemo.service.AbstractCRUDService;
import org.springframework.stereotype.Service;

@Service
public class ProductService extends AbstractCRUDService<Product> {

    public ProductService(CRUDRepository<Product> repository) {
        super(repository);
    }
}
