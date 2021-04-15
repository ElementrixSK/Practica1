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
public class E2_Cancion implements Serializable{
    static final long serialVersionUID=1L;
    private String ncancion;
    private float duracion;
    private String genero;
    
    public void MostrarCancion(){
        System.out.println(this.ncancion+"  \t "+this.duracion+"  \t  "+this.genero);
    }

    public String getNcancion() {
        return ncancion;
    }

    public void setNcancion(String ncancion) {
        this.ncancion = ncancion;
    }

    public float getDuracion() {
        return duracion;
    }

    public void setDuracion(float duracion) {
        this.duracion = duracion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}