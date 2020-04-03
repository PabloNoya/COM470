
package com.com470.holaMundoApp.controller;

import org.junit.Test;
import static org.junit.Assert.*;


public class HolaMundoControllerTest {
    
    @Test
    public void testHola() {
        System.out.println("hola");
        HolaMundoController instance = new HolaMundoController();
        String expResult = "Hola Mundo";
        String result = instance.hola();
        assertEquals(expResult, result);        
    }
    
}
