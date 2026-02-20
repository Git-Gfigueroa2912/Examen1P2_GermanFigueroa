/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ex1p2_germanfigueroa;

/**
 *
 * @author gafm2
 */
public class Pokemon {
    String especie;
    String apodo;
    String estado;

    public Pokemon(String especie, String apodo, String estado) {
        this.especie = especie;
        this.apodo = apodo;
        this.estado = estado;
    }

    public String getEspecie() {
        return especie;
    }

    public String getApodo() {
        return apodo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Pokemon{" + "especie=" + especie + ", apodo=" + apodo + ", estado=" + estado + '}';
    }
    
    
}
