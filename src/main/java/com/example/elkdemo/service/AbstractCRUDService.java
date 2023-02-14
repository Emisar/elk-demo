package com.example.elkdemo.service;

import com.example.elkdemo.entity.AbstractIdentifiableObject;
import com.example.elkdemo.repository.CRUDRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class AbstractCRUDService<T extends AbstractIdentifiableObject> implements CRUDService<T> {

    protected final CRUDRepository<T> repository;

    @Override
    public T create(T obj) {
        return repository.create(obj);
    }

    @Override
    public T read(Long id) {
        return repository.read(id);
    }

    @Override
    public List<T> readAll() {
        return repository.readAll();
    }

    @Override
    public T update(Long id, T obj) {
        return repository.update(id, obj);
    }

    @Override
    public T delete(Long id) {
        return repository.delete(id);
    }
}
