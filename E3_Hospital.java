/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author SmartUrban2025
 */
public class E3_Hospital implements Serializable{
    static final long serialVersionUID=1L;
    transient Scanner sd = new Scanner (System.in);
    private String nombre;
    private String direccion;
    private int nivel;
    private List <E3_Especialidad> ListaEspecialidad;
    
    public E3_Hospital(){
        ListaEspecialidad = new ArrayList<>();
    }
    
    public void MostrarHospital(){
        System.out.println("            HOSPITAL            ");
        System.out.println("Nombre      : "     +this.nombre);
        System.out.println("Direccion   : "     +this.direccion);
        System.out.println("Nivel       : "     +this.nivel);
        System.out.println("");
        if (ListaEspecialidad.size() > 0){
            System.out.println("        ESPECIALIDADES DEL HOSPITAL     ");
            for (E3_Especialidad ee: ListaEspecialidad){
                System.out.print(" * ");
                ee.MostrarEsp();
            }
            System.out.println("");
        }
    }
    public void MostrarHosp(){
        System.out.println("Nombre      : "     +this.nombre);
        System.out.println("Direccion   : "     +this.direccion);
        System.out.println("Nivel       : "     +this.nivel);
        System.out.println("");
    }
    public void AñadirEsp(E3_Especialidad e){
        ListaEspecialidad.add(e);
        System.out.println("            ESPECIALIDAD AÑADIDA CON EXITO...           ");
        System.out.println("");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public List<E3_Especialidad> getListaEspecialidad() {
        return ListaEspecialidad;
    }

    public void setListaEspecialidad(List<E3_Especialidad> ListaEspecialidad) {
        this.ListaEspecialidad = ListaEspecialidad;
    }
}