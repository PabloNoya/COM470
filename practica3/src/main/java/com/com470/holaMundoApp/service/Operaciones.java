package com.com470.holaMundoApp.service;

public class Operaciones {

    int Suma(int a, int b) {
        return a + b;
    }

    int Resta(int a, int b) {
        return a - b;
    }

    int Multiplicacion(int a, int b) {
        return a * b;
    }

    int Division(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("No se puede dividir entre cero");
        }
        return a / b;
    }
}
