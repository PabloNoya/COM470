package com.com470.holaMundoApp.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ValidarEmailTest {
    ValidarEmail validar = ValidarEmail.getInstance();

    public ValidarEmailTest() {
    }

    @Test
    public void testGetInstance() {
        ValidarEmail expResult = validar;
        ValidarEmail result = ValidarEmail.getInstance();
        
        assertEquals(expResult, result);
    }
    
    @Test
    public void testReset() {
        System.out.println("reset");
        ValidarEmail instance = ValidarEmail.getInstance();
        instance.reset();
        assertThrows(IllegalStateException.class,()-> {
            instance.reset();
        });
    }
    
    @Test
    public void testValidaEmail() {
        ValidarEmail instance = ValidarEmail.getInstance();
        String email = "pablonoya18@gmail.com";
        boolean expResult = true;
        boolean result = instance.validaEmail(email);
        
        assertEquals(expResult, result);
    }
    
    @Test
    public void testValidaEmailIncorrecto() {
        ValidarEmail instance = ValidarEmail.getInstance();
        String email = "pablonoya18 gmail.com";
        boolean expResult = false;
        boolean result = instance.validaEmail(email);
        
        assertEquals(expResult, result);
    }
}
