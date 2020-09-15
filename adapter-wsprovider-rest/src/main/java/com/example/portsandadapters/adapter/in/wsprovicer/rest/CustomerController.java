package com.example.portsandadapters.adapter.in.wsprovicer.rest;

import com.example.portsandadapters.application.command.customer.create.CreateCustomerHandler;
import com.example.portsandadapters.application.command.customer.create.CreateCustomerRequest;
import com.example.portsandadapters.application.command.customer.create.CreateCustomerResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@Slf4j
@RestController
@RequestMapping("/customer")
public class CustomerController {

    private final CreateCustomerHandler createCustomerHandler;

    @PostMapping("/create")

    public ResponseEntity<String> createEndpoint(@RequestBody CreateCustomerRequest request) {

        log.info("input received ");

        CreateCustomerResponse createCustomerResponse = createCustomerHandler.handle(request);

        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.set("com/example/portsandadapters/domain/model/customer", "examplevalue");

        return ResponseEntity.ok()
                             .headers(responseHeaders)
                             .body(createCustomerResponse.getCustomerId());

    }

}
