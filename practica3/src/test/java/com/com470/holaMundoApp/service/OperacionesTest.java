package com.com470.holaMundoApp.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class OperacionesTest {

    public OperacionesTest() {
    }

    @Test
    public void testSuma() {
        System.out.println("Suma");
        int a = 4;
        int b = 7;
        Operaciones instance = new Operaciones();
        int expResult = 11;
        int wrongResult = 47;
        int result = instance.Suma(a, b);
        
        assertEquals(expResult, result);
        assertNotEquals(wrongResult, result);
    }

    @Test
    public void testResta() {
        System.out.println("Resta");
        int a = 8;
        int b = 10;
        Operaciones instance = new Operaciones();
        int expResult = -2;
        int result = instance.Resta(a, b);
        
        assertEquals(expResult, result);
        assertNotNull(result);
    }

    @Test
    public void testMultiplicación() {
        System.out.println("Multiplicación");
        int a = 6;
        int b = 7;
        Operaciones instance = new Operaciones();
        int expResult = 42;
        int result = instance.Multiplicacion(a, b);
        
        assertEquals(expResult, result);
        assertDoesNotThrow(() -> {
            instance.Multiplicacion(a, b);
        });
    }

    @Test
    public void testDivision() {
        System.out.println("División");
        int a = 50;
        int b = 5;
        Operaciones instance = new Operaciones();
        int expResult = 10;
        int result = instance.Division(a, b);
        assertEquals(expResult, result);
    }

    @Test
    public void testDivisionEntreCero() {
        System.out.println("División entre cero");
        int a = 34;
        int b = 0;
        Operaciones instance = new Operaciones();

        assertThrows(IllegalArgumentException.class, () -> {
            instance.Division(a, b);
        });
    }

}
