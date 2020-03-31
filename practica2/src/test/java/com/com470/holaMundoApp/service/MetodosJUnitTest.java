package com.com470.holaMundoApp.service;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MetodosJUnitTest {

    public MetodosJUnitTest() {
    }

    @BeforeAll
    public static void setUpClass() {
        System.out.println("antes de todos los Test");
    }

    @AfterAll
    public static void tearDownClass() {
        System.out.println("después de todos los Test");
        fail("The test case is a prototype");
    }

    @BeforeEach
    public void setUp() {
        System.out.println("antes de cada Test");
    }

    @AfterEach
    public void tearDown() {
        System.out.println("después de cada Test \n");
    }

    @Test
    public void primerTest() {
        System.out.println("primer Test");
        fail("The test case is a prototype.");
    }

    @Test
    public void segundoTest() {
        System.out.println("segundo Test");
        fail("The test case is a prototype.");
    }

}
