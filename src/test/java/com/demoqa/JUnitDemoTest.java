package com.demoqa;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class JUnitDemoTest {

    @BeforeAll
    static void setUp() {
        System.out.println("### @BeforeAll !");
    }

    @BeforeEach
    void beforeEachTest() {
        System.out.println("### @BeforeEach !");
    }

    @Test
    void simpleTestFirst() {
        System.out.println("### @Test simpleTestFirst() !");
        Assertions.assertTrue(3 > 2);
    }

    @Test
    void simpleTestSecond() {
        System.out.println("### @Test simpleTestSecond() !");
        Assertions.assertTrue(3 > 2);
    }

    @AfterEach
    void AfterEachTest() {
        System.out.println("### @AfterEach !");
    }
    @AfterAll
    static void tearDown() {
        System.out.println("### @AfterAll !");
    }

}
