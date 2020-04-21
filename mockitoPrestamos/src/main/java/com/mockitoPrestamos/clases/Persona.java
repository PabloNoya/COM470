package com.mockitoPrestamos.clases;

public class Persona {

    private int dni;
    private String nombre;
    private int edad;
    private int sueldo;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public boolean esMayorDe10() {
        return (this.edad >= 10) ? true : false;
    }

    public boolean esSalarioAlto() {
        return (this.sueldo >= 5000) ? true : false;
    }
}
