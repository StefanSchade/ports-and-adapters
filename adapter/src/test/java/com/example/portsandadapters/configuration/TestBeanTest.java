package com.example.portsandadapters.configuration;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;
import java.util.List;

@Slf4j
@SpringBootTest
class TestBeanTest {

    @Autowired public TestBean testBean;

    @Autowired ApplicationContext context;

    @BeforeAll
    static void setUp() {

    }

    @Test
    void test() {

        String[] beannamearray = context.getBeanDefinitionNames();
        List<String> list = Arrays.asList(beannamearray);

        list.forEach(str -> log.info("ABC " + str));

        if (testBean==null) {
            log.info("ABC Testbean not found");
        }

        if (testBean!=null) {
            log.info("Testbean found");
            testBean.test();
        }
    }
}