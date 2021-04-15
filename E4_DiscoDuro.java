/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author SmartUrban2025
 */
public class E4_DiscoDuro extends E4_Dispositivo{
    private String tipointer;
    static final long serialVersionUID = 3L;
    transient Scanner sd = new Scanner(System.in);
    private List<E4_Archivo> ListaArchivo;
     
    public E4_DiscoDuro() {
        ListaArchivo = new ArrayList<>();
    }
    
    @Override
    public void Llenar() {
        super.Llenar();
        System.out.print("Ingrese tipo de interfaz : ");
        this.tipointer = sd.nextLine();
    }

    @Override
    public void Mostrar() {
        super.Mostrar();
        System.out.println("Tipo de Interfaz : " + this.tipointer);
        if (ListaArchivo.size() > 0) {
            System.out.println(" ------ ARCHIVOS DEL DISCO DURO ------ ");
            for (E4_Archivo ar : ListaArchivo) {
                System.out.print(" - ");
                ar.Mostrar();
            }
        }
    }

    public void AñadirAr(E4_Archivo a) {
        ListaArchivo.add(a);
        System.out.println("");
        System.out.println("¡¡¡¡.....Archivo Agregada.....!!!!");
        System.out.println("");
    }

    public void ElimAr(String nom) {
        Iterator<E4_Archivo> ite = this.ListaArchivo.iterator();
        while (ite.hasNext()) {
            E4_Archivo a = ite.next();
            if (a.getNomarchivo().equalsIgnoreCase(nom)) {
                ite.remove();
                System.out.println("\n    --------- ARCHIVO ELIMINADO  --------- \n");
            }
        }
    }

    public String getTipointer() {
        return tipointer;
    }

    public void setTipointer(String tipointer) {
        this.tipointer = tipointer;
    }

    public List<E4_Archivo> getListaArchivo() {
        return ListaArchivo;
    }

    public void setListaArchivo(List<E4_Archivo> ListaArchivo) {
        this.ListaArchivo = ListaArchivo;
    }
}