package com.example.elkdemo.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@MappedSuperclass
@NoArgsConstructor
public abstract class AbstractIdentifiable extends AbstractAuditable {

    @Id
    @GeneratedValue
    protected Long id;
}
