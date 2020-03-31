package com.com470.holaMundoApp.service;

public class Utilidades {
    String concatenar(String uno, String dos) {
        if (uno != null && dos != null) {
            return uno.concat(" ").concat(dos);
        }
        return null;
    }
}
