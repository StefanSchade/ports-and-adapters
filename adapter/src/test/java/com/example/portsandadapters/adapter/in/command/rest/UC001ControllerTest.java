package com.example.portsandadapters.adapter.in.command.rest;

import com.example.portsandadapters.application.services.command.sprint.uc001.UC001Service;
import com.example.portsandadapters.domain.aggregate.one.GenericAggregateRoot001;
import com.example.portsandadapters.ports.outbound.persistence.PersistenceAbstraction;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

@AutoConfigureMockMvc
class UC001ControllerTest {

    @Mock private UC001Service handler;

    @Mock private PersistenceAbstraction<GenericAggregateRoot001, Long> pa;

    private MockMvc mockMvc;

    @BeforeEach
    void setUp() {
        UC001Controller uc001Controller = new UC001Controller(handler, pa);
        mockMvc = MockMvcBuilders.standaloneSetup()
                                 .build();
    }

    @Test
    void unittestEndpoint1() throws Exception {

        mockMvc.perform(post("/endpoint1").contentType(MediaType.APPLICATION_JSON)
                                          .content("{ \"name\": \"Max\"}")
                                          .accept(MediaType.APPLICATION_JSON));
        //todo: further assertions when model offers functionality

    }

}