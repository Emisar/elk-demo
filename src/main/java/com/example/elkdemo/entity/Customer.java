package com.example.elkdemo.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
public class Customer extends AbstractIdentifiable {

    private String name;
    private String address;
}