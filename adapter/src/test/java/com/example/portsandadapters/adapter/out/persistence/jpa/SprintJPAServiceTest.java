package com.example.portsandadapters.adapter.out.persistence.jpa;

import com.example.portsandadapters.adapter.out.persistence.jpa.model.SprintJpa;
import com.example.portsandadapters.adapter.out.persistence.jpa.model.SprintJpaMapper;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.data.repository.CrudRepository;

import static org.junit.jupiter.api.Assertions.*;



class SprintJPAServiceTest {

    @Mock CrudRepository<SprintJpa, Long> sprintRepo;

    @Mock SprintJpaMapper sprintJpaMapper;

    @BeforeAll
    static void setUp() {

    }

    @Test
    void findAll() {
        // todo test einfügen
    }

    @Test
    void findByID() {
    }

    @Test
    void save() {
    }

    @Test
    void testSave() {
    }

    @Test
    void delete() {
    }

    @Test
    void deleteByID() {
    }
}