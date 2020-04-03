/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.com470.holaMundoApp.model;

/**
 *
 * @author pablo
 */
public class MinimoMaximo {

    Integer minimo;
    Integer maximo;

    public MinimoMaximo(Integer minimo, Integer maximo) {
        this.minimo = minimo;
        this.maximo = maximo;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final MinimoMaximo other = (MinimoMaximo) obj;
        if (this.minimo != other.minimo) {
            return false;
        }
        if (this.maximo != other.maximo) {
            return false;
        }
        return true;
    }

}
