package com.example.portsandadapters.adapter;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.concurrent.TimeoutException;

@SpringBootTest
class TestBeanTest {

    @Autowired
    public TestBean testBean;

    @BeforeAll
    static void setUp() {

    }

    @Test
    void test() throws TimeoutException {

     //   testBean.test();

    }
}