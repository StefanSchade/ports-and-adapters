package com.example.portsandadapters.application.command.customer.create;

import com.example.portsandadapters.domain.model.customer.Customer;
import com.example.portsandadapters.domain.model.customer.CustomerBuilder;
import com.example.portsandadapters.port.inbound.command.CommandHandler;
import com.example.portsandadapters.port.repository.Repository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
public class CreateCustomerHandler extends CommandHandler<CreateCustomerRequest, CreateCustomerResponse> {

    public final Repository<Customer, Long> customerRepository;

    @Override
    public CreateCustomerResponse handle(CreateCustomerRequest request) {

        Customer customerTemplate = new CustomerBuilder().firstName(request.getFirstName())
                                                         .lastName(request.getLastName())
                                                         .build();

        Customer customer = customerRepository.save(customerTemplate);

        log.info("persisted entity with database id " + customer.getDatabaseId() + " and customer id " +
                customer.getCustomerId());

        CreateCustomerResponse createCustomerResponse = new CreateCustomerResponse();

        createCustomerResponse.setCustomerId(customer.getCustomerId());

        return createCustomerResponse;
    }

}
