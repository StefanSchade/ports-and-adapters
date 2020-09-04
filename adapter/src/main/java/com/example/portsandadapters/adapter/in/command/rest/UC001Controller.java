package com.example.portsandadapters.adapter.in.command.rest;

import com.example.portsandadapters.application.port.out.persistence.PersistenceAbstraction;
import com.example.portsandadapters.application.services.command.sprint.uc001.UC001Input;
import com.example.portsandadapters.application.services.command.sprint.uc001.UC001Output;
import com.example.portsandadapters.application.services.command.sprint.uc001.UC001Service;
import com.example.portsandadapters.domain.model.aggregate.one.GenericAggregateRoot001;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@Slf4j
@RestController
public class UC001Controller {

    private final UC001Service handler;

    private final PersistenceAbstraction<GenericAggregateRoot001, Long> pa;

    @PostMapping("/endpoint1")

    public ResponseEntity<GenericAggregateRoot001> endpoint1(@RequestBody UC001Input input) {

        log.info("input received " + input.getName());

        UC001Output output = handler.process(input);

        GenericAggregateRoot001 genericAggregateRoot001 = output.getResponseObject();

        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.set("examplekey", "examplevalue");

        if (output.getFailed()) {

            return ResponseEntity.status(500)
                                 .headers(responseHeaders)
                                 .build();

        } else {

            return ResponseEntity.ok()
                                 .headers(responseHeaders)
                                 .body(genericAggregateRoot001);
        }
    }

}
