package com.mockitoPrestamos.clases;

public class Prestamo {

    private Persona persona;
    private int capital;
    private long id;
    private int cantCuotas;
    private int tasaInteres;

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        if (persona.esMayorDe10() && persona.esSalarioAlto()) {
            this.persona = persona;
        } else {
            throw new IllegalArgumentException("El sueldo y/o la edad son erroneos");
        }
    }

    public int getCapital() {
        return capital;
    }

    public void setCapital(int capital) {
        this.capital = capital;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getCantCuotas() {
        return cantCuotas;
    }

    public void setCantCuotas(int cantCuotas) {
        this.cantCuotas = cantCuotas;
    }

    public int getTasaInteres() {
        return tasaInteres;
    }

    public void setTasaInteres(int tasaInteres) {
        this.tasaInteres = tasaInteres;
    }

    public int getMontoPagar() {
        return (this.capital / this.tasaInteres) * 100 * this.capital;
    }

    public int getMotoCuota() {
        return this.getMontoPagar() / this.cantCuotas;
    }

}
