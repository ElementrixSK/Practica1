/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica;

import java.io.Serializable;

/**
 *
 * @author SmartUrban2025
 */
public class E4_Archivo implements Serializable{
    transient static final long serialVersionUID=3L;
    private String nomarchivo;
    private double tamaño;
    
    public void Mostrar(){
        System.out.println("Nombre del archivo       : " + this.nomarchivo);
        System.out.println("Tamaño del archivo MB    : " + this.tamaño);
        System.out.println("");
    }

    public String getNomarchivo() {
        return nomarchivo;
    }

    public void setNomarchivo(String nomarchivo) {
        this.nomarchivo = nomarchivo;
    }

    public double getTamaño() {
        return tamaño;
    }

    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
    }
}  