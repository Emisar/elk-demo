package com.example.elkdemo.repository;

import java.util.List;

public interface CRUDRepository<T> {

    T create(T obj);

    T read(Long id);

    List<T> readAll();

    T update(Long id, T obj);

    T delete(Long id);
}
