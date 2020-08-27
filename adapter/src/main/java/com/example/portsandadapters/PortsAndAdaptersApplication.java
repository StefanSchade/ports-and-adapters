package com.example.portsandadapters;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.portsandadapters"})
public class PortsAndAdaptersApplication {

    public static void main(String[] args) {
        SpringApplication.run(PortsAndAdaptersApplication.class, args);

    }
}