package com.example.elkdemo.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
public class Product extends AbstractIdentifiable {

    private String name;
    private Double price;
}