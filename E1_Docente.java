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
public class E1_Docente implements Serializable{
    static final long serialVersionUID=2L;
    transient Scanner leer = new Scanner (System.in);
    private String nom;
    private String pat;
    private String mat;
    private String titulo;
    private int cargahora;
    private int hmax;
    private List<E1_Materia> ListaMateria;
    
    public E1_Docente(){
        ListaMateria = new ArrayList<>();
    }
    
    public void Mostrar(){
        System.out.println("Nombre              : "+this.nom);
        System.out.println("Apeliido Paterno    : "+this.pat);
        System.out.println("Apellido Materno    : "+this.mat);
        System.out.println("Titulo              : "+this.titulo);
        System.out.println("Carga Horaria       : "+this.cargahora);
        System.out.println("");
        if (ListaMateria.size() > 0){
            System.out.println("                MATERIAS ASIGNADAS              ");
            for (E1_Materia ma: ListaMateria){
                ma.Mostrar();
                System.out.println("");
            }
        }
    }
    
    public void Añadir(E1_Materia mat){
        ListaMateria.add(mat);
        System.out.println("                MATERIA ASIGNADA CON EXITO...           ");
        System.out.println("");
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPat() {
        return pat;
    }

    public void setPat(String pat) {
        this.pat = pat;
    }

    public String getMat() {
        return mat;
    }

    public void setMat(String mat) {
        this.mat = mat;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getCargahora() {
        return cargahora;
    }

    public void setCargahora(int cargahora) {
        this.cargahora = cargahora;
    }

    public List<E1_Materia> getListaMateria() {
        return ListaMateria;
    }

    public void setListaMateria(List<E1_Materia> ListaMateria) {
        this.ListaMateria = ListaMateria;
    }

    public int getHmax() {
        return hmax;
    }

    public void setHmax(int hmax) {
        this.hmax = hmax;
    }
}
