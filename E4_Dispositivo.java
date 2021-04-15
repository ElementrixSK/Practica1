/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica;

import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author SmartUrban2025
 */
public class E4_Dispositivo implements Serializable{
    static final long serialVersionUID=2L;
    transient Scanner leer = new Scanner (System.in);
    private String marca;
    private double capacidad;
    private double espacio;
    
    public void Llenar(){
        System.out.print("Ingrese marca del Dispositivo : ");
        this.marca = leer.nextLine();
        System.out.print("Ingrese la capacidad de Almacenamiento MB : ");
        this.capacidad = leer.nextDouble();
        System.out.print("Ingrese Espacio Disponible MB : ");
        this.espacio = leer.nextDouble();
        leer.nextLine();
    }
    public void Mostrar(){
        System.out.println("Marca   : " + this.marca);
        System.out.println("Capacidad : " + this.capacidad);
        System.out.println("Espacio Disponible : " + this.espacio);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(double capacidad) {
        this.capacidad = capacidad;
    }

    public double getEspacio() {
        return espacio;
    }

    public void setEspacio(double espacio) {
        this.espacio = espacio;
    }
}