package com.example.elkdemo.service;

import com.example.elkdemo.entity.*;

import java.util.List;

public interface CRUDService<T extends AbstractIdentifiable> {

    T create(T obj);

    T read(Long id);

    List<T> readAll();

    T update(Long id, T obj);

    boolean delete(Long id);
}
