package com.example.elkdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.*;

@SpringBootApplication
@EnableJpaAuditing
public class ElkDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ElkDemoApplication.class, args);
    }

}
