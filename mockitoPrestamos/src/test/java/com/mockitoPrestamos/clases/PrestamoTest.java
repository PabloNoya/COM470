package com.mockitoPrestamos.clases;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class PrestamoTest {

    private Persona personaValida;
    private Persona personaNoValida;
    private Prestamo prestamo;

    @Before
    public void setUp() {
        prestamo = new Prestamo();
        personaValida = mock(Persona.class);
        personaNoValida = mock(Persona.class);

        when(personaValida.esMayorDe10()).thenReturn(true);
        when(personaValida.esSalarioAlto()).thenReturn(true);

        when(personaNoValida.esMayorDe10()).thenReturn(false);
        when(personaNoValida.esSalarioAlto()).thenReturn(false);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetPersonaNoValida() {
        prestamo.setPersona(personaNoValida);
    }

    @Test
    public void testSetPersonaValida() {
        prestamo.setPersona(personaValida);
        verify(personaValida).esMayorDe10();
        verify(personaValida).esSalarioAlto();
    }

}
