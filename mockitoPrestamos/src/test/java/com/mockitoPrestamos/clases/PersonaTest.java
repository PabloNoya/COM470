package com.mockitoPrestamos.clases;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;

public class PersonaTest {

    Persona p;

    public PersonaTest() {
    }

    @Before
    public void setUp() {
        p = new Persona();
        p.setDni(123);
        p.setEdad(30);
        p.setNombre("Juan Perez");
        p.setSueldo(7000);
    }

    @Test
    public void testGetDni() {
        int resultado = p.getDni();
        assertEquals(resultado, 123);
    }

    @Test
    public void testSetDni() {
        int dni = 777;
        p.setDni(dni);
        assertEquals(dni, p.getDni());
    }

    @Test
    public void testEsMayorDe10() {
        assertTrue(p.esMayorDe10());
    }
}
