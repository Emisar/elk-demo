package com.example.elkdemo.service.impl;

import com.example.elkdemo.entity.*;
import com.example.elkdemo.service.*;
import org.apache.commons.lang3.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.*;

@Service
public class CustomerService extends AbstractCRUDService<Customer> {

    public CustomerService(JpaRepository<Customer, Long> repository) {
        super(repository);
    }

    @Override
    protected void objectUpdater(Customer dataObject, Customer updatedObject) {
        if (StringUtils.isNotBlank(dataObject.getName())) {
            updatedObject.setName(dataObject.getName());
        }
        if (StringUtils.isNotBlank(dataObject.getAddress())) {
            updatedObject.setAddress(dataObject.getAddress());
        }
    }
}
