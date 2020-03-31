package com.com470.holaMundoApp.service;

import com.com470.holaMundoApp.service.Utilidades;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UtilidadesTest {
    @Test
    public void testConcatenar() {
        System.out.println("concatenar");
        String uno = "Hola";
        String dos = "Mundo";
        // instanciar la clase a probar
        Utilidades instance = new Utilidades();
        String expResult = "Hola Mundo";
        String result = instance.concatenar(uno, dos);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }
    
    // En la implementación
    @Test
    public void testConcatenarFallo() {
        System.out.println("concatenar");
        String uno = "Hola";
        String dos = "Mundo";
        // instanciar la clase a probar
        Utilidades instance = new Utilidades();
        String expResult = "Hola Mundo";
        String result = instance.concatenar(uno, dos);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }
    
    // En la codificación
    @Test
    public void testConcatenarError() {
        System.out.println("concatenar");
        String uno = null;
        String dos = "Mundo";
        // instanciar la clase a probar
        Utilidades instance = new Utilidades();
        String expResult = null;
        String result = instance.concatenar(uno, dos);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }
}
