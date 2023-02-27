package com.example.elkdemo.service.impl;

import com.example.elkdemo.entity.*;
import com.example.elkdemo.service.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.*;

import java.util.*;

@Service
public class OrderService extends AbstractCRUDService<Order> {

    public OrderService(JpaRepository<Order, Long> repository) {
        super(repository);
    }



    @Override
    protected void objectUpdater(Order dataObject, Order updatedObject) {
        if (Objects.nonNull(dataObject.getCustomer())) {
            updatedObject.setCustomer(dataObject.getCustomer());
        }
        if (Objects.nonNull(dataObject.getProduct())) {
            updatedObject.setProduct(dataObject.getProduct());
        }
    }
}
