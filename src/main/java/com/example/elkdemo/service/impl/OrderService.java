package com.example.elkdemo.service.impl;

import com.example.elkdemo.entity.Order;
import com.example.elkdemo.repository.CRUDRepository;
import com.example.elkdemo.service.AbstractCRUDService;
import org.springframework.stereotype.Service;

@Service
public class OrderService extends AbstractCRUDService<Order> {

    public OrderService(CRUDRepository<Order> repository) {
        super(repository);
    }
}
