package com.example.portsAndAdapters.adapter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TestBeanTest {

    @Autowired
    public TestBean testBean;

    @BeforeEach
    void setUp() {
    }

    @Test
    void testcrudservices() {

        testBean.testcrudservices();

    }
}