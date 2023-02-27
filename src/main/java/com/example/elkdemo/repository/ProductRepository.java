package com.example.elkdemo.repository;

import com.example.elkdemo.entity.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.*;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
