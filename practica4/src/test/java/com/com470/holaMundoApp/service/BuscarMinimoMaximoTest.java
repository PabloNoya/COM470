package com.com470.holaMundoApp.service;

import com.com470.holaMundoApp.model.MinimoMaximo;
import java.util.Arrays;
import java.util.List;
import org.hamcrest.Matchers;
import org.junit.Test;
import static org.junit.Assert.*;

public class BuscarMinimoMaximoTest {

    private BuscarMinimoMaximo utils = new BuscarMinimoMaximo();

    @Test
    public void testBuscaMinimoMaximoUno() {
        List<Integer> lista = Arrays.asList(64, 92, 0, 7, 8, 42, 6, 21, 43);
        MinimoMaximo esperado = new MinimoMaximo(0, 92);

        test(esperado, lista);
    }

    @Test
    public void testBuscaMinimoMaximoDos() {
        List<Integer> lista = Arrays.asList(-44, 30, -77, 27, 24, 19, -76, -58, -34, 47);
        MinimoMaximo esperado = new MinimoMaximo(-77, 47);

        test(esperado, lista);
    }

    private void test(MinimoMaximo esperado, List<Integer> lista) {
        assertEquals(esperado, utils.buscaMinimoMaximo(lista));
        // usando assertThat
        assertThat(utils.buscaMinimoMaximo(lista), Matchers.notNullValue());
        assertThat(utils.buscaMinimoMaximo(lista), Matchers.isA(MinimoMaximo.class));
        assertThat(utils.buscaMinimoMaximo(lista), Matchers.equalTo(esperado));
        assertThat(utils.buscaMinimoMaximo(lista), Matchers.is(esperado));
    }
}
