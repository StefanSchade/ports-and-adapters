package com.example.ports_and_adapters.adapter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages = {"com.example.ports_and_adapters"})
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}