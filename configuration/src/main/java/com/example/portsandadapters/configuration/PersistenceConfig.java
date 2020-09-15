package com.example.portsandadapters.configuration;

import com.example.portsandadapters.adapter.out.persistence.jpa.customer.CustomerAdapter;
import com.example.portsandadapters.adapter.out.persistence.jpa.customer.CustomerMapper;
import com.example.portsandadapters.adapter.out.persistence.jpa.customer.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:persistence.properties")
@RequiredArgsConstructor
public class PersistenceConfig {

    @Bean
    @ConditionalOnProperty(value = "adaptertype", havingValue = "jpa")
    CustomerMapper customerMapper() {

        return new CustomerMapper();
    }

    @Bean
    @ConditionalOnProperty(value = "adaptertype", havingValue = "jpa")
    CustomerAdapter customerAdapter(CustomerMapper customerMapper, CustomerRepository customerRepository) {

        return new CustomerAdapter(customerMapper, customerRepository);
    }

//    @Bean
//    @ConditionalOnProperty(value = "adaptertype", havingValue = "jpa")
//    public SprintJPAAdapter JPAServiceSprintAggregate() {
//        return new SprintJPAAdapter();
//    }

    @Bean
    @ConditionalOnProperty(value = "adaptertype", havingValue = "map")
    public MapAdapterFactory GenericMapServiceFactory() {

        return new MapAdapterFactory();
    }

//    @Bean
//    @ConditionalOnProperty(value = "adaptertype", havingValue = "map")
//    public Repository<GenericAggregateRoot001, Long> mapRepoAg001(MapAdapterFactory factory) {
//        return factory.createMapRepo();
//    }
//
//    @Bean
//    @ConditionalOnProperty(value = "adaptertype", havingValue = "map")
//    public Repository<GenericAggregateRoot002, Long> mapRepoAg002(MapAdapterFactory factory) {
//        return factory.createMapRepo();
//    }

}