package com.example.elkdemo.service.impl;

import com.example.elkdemo.entity.Customer;
import com.example.elkdemo.repository.CRUDRepository;
import com.example.elkdemo.service.AbstractCRUDService;
import org.springframework.stereotype.Service;

@Service
public class CustomerService extends AbstractCRUDService<Customer> {

    public CustomerService(CRUDRepository<Customer> repository) {
        super(repository);
    }
}
