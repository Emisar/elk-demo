package com.example.elkdemo.service;

import com.example.elkdemo.entity.AbstractIdentifiableObject;

import java.util.List;

public interface CRUDService<T extends AbstractIdentifiableObject> {

    T create(T obj);

    T read(Long id);

    List<T> readAll();

    T update(Long id, T obj);

    T delete(Long id);
}
