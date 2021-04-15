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
public class E1_Materia implements Serializable{
    static final long serialVersionUID=1L;
    transient Scanner leer = new Scanner (System.in);
    private int id = 11321321;
    private String materia;
    private int añomat;
    private int horamat;
    
    public void CrearMateria(){
        System.out.print("Ingrese nombre de la Materia      : ");
         this.materia = leer.nextLine();
         System.out.print("Ingrese año de la Materia        : ");
         this.añomat = leer.nextInt();
         System.out.print("Ingrese las Horas de la Materia  : ");
         this.horamat = leer.nextInt();
         System.out.println("");
         leer.nextLine();
    }
    public void Mostrar(){
        System.out.println("Materia            : "+this.materia);
        System.out.println("Año de la Materia  : "+this.añomat);
        System.out.println("Hora de la Materia : "+this.horamat);
        System.out.println("");
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public int getAñomat() {
        return añomat;
    }

    public void setAñomat(int añomat) {
        this.añomat = añomat;
    }

    public int getHoramat() {
        return horamat;
    }

    public void setHoramat(int horamat) {
        this.horamat = horamat;
    }
}
