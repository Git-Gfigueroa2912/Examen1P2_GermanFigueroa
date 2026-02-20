/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ex1p2_germanfigueroa;

/**
 *
 * @author gafm2
 */
public class Entrenador {
    String nombre;
    int edad; 
    int dinero;
    String equipo;

    public Entrenador(String nombre, int edad, int dinero, String equipo) {
        this.nombre = nombre;
        this.edad = edad;
        this.dinero = dinero;
        this.equipo = equipo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getDinero() {
        return dinero;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    @Override
    public String toString() {
        return "Entrenador{" + "nombre=" + nombre + ", edad=" + edad + ", dinero=" + dinero + ", equipo=" + equipo + '}';
    }
    
    
}
