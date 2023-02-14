package com.example.elkdemo.repository;

import com.example.elkdemo.entity.AbstractIdentifiableObject;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public abstract class AbstractLocalRepository<T extends AbstractIdentifiableObject> {

    protected Map<Long, T> data;
    protected Long idCounter;

    protected AbstractLocalRepository() {
        data = new HashMap<>();
        idCounter = 0L;
    }

    protected Long getNewId() {
        return idCounter;
    }
}
