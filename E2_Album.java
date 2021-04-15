/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SmartUrban2025
 */
public class E2_Album implements Serializable{
    static final long serialVersionUID=2L;
    private String nombre;
    private String artista;
    private String formato;
    private List<E2_Cancion> ListaCancion;
    
    public E2_Album(){
        ListaCancion = new ArrayList<>();
    }
    
    public void MostrarAlbum(){
        System.out.println("            ALBUM           ");
        System.out.println("Nombre      : "+this.nombre);
        System.out.println("Artista     : "+this.artista);
        System.out.println("Formato     : "+this.formato);
        System.out.println("");
        System.out.println("            CANCIONES           ");
        System.out.println("Nombre   \t Duracion(min)   \t   Genero ");
        if(ListaCancion != null){
            for (E2_Cancion cc:ListaCancion){
                cc.MostrarCancion();
            }
            System.out.println("");
        }
    }
    public void AñadirCancion(E2_Cancion c){
        this.ListaCancion.add(c);
        System.out.println("            CANCION REGISTRADA CON EXITO...         ");
        System.out.println("");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public List<E2_Cancion> getListaCancion() {
        return ListaCancion;
    }

    public void setListaCancion(List<E2_Cancion> ListaCancion) {
        this.ListaCancion = ListaCancion;
    } 
}
