/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ex1p2_germanfigueroa;

/**
 *
 * @author gafm2
 */
public class Movimiento extends Pokemon{
    String nombre;
    String descripcion;
    String tipo_movimiento;

    public Movimiento(String nombre, String descripcion, String tipo_movimiento, String especie, String apodo, String estado) {
        super(especie, apodo, estado);
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.tipo_movimiento = tipo_movimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getTipo_movimiento() {
        return tipo_movimiento;
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

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setTipo_movimiento(String tipo_movimiento) {
        this.tipo_movimiento = tipo_movimiento;
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
        return "Movimiento{" + "nombre=" + nombre + ", descripcion=" + descripcion + ", tipo_movimiento=" + tipo_movimiento + '}';
    }
    
    
    
}
