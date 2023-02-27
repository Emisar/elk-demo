package com.example.elkdemo.service.impl;

import com.example.elkdemo.entity.*;
import com.example.elkdemo.service.*;
import org.apache.commons.lang3.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.*;

import java.util.*;

@Service
public class ProductService extends AbstractCRUDService<Product> {

    public ProductService(JpaRepository<Product, Long> repository) {
        super(repository);
    }

    @Override
    protected void objectUpdater(Product dataObject, Product updatedObject) {
        if (StringUtils.isNotBlank(dataObject.getName())) {
            updatedObject.setName(dataObject.getName());
        }
        if (Objects.nonNull(dataObject.getPrice())) {
            updatedObject.setPrice(dataObject.getPrice());
        }
    }
}
