package com.example.elkdemo.repository;

import com.example.elkdemo.entity.AbstractIdentifiableObject;
import com.example.elkdemo.entity.Customer;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractLocalCRUDRepository<T extends AbstractIdentifiableObject>
        extends AbstractLocalRepository<T> implements CRUDRepository<T> {

    @Override
    public T create(T obj) {
        obj.setId(getNewId());
        data.put(obj.getId(), obj);
        return obj;
    }

    @Override
    public T read(Long id) {
        return data.get(id);
    }

    @Override
    public List<T> readAll() {
        return new ArrayList<>(data.values());
    }

    @Override
    public T update(Long id, T obj) {
        if (!data.containsKey(id)) return null;
        data.put(id, obj);
        return obj;
    }

    @Override
    public T delete(Long id) {
        return data.remove(id);
    }
}
