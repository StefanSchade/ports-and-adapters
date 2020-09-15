package com.example.portsandadapters.configuration;

import com.example.portsandadapters.application.command.customer.create.CreateCustomerHandler;
import com.example.portsandadapters.domain.model.customer.Customer;
import com.example.portsandadapters.port.repository.Repository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:wsprovider.properties")
@RequiredArgsConstructor
public class CommandConfig {

    @Bean
    public CreateCustomerHandler createCustomerHandler(Repository<Customer, Long> cusrepo) {
        return new CreateCustomerHandler(cusrepo);
    }

}
