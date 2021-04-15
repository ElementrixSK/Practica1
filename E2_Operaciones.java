/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author SmartUrban2025
 */
public class E2_Operaciones {
    private E2_Cancion cancion;
    private E2_Album album;
    private List<E2_Album> ListaAlbum;
    Scanner leer = new Scanner(System.in);
    
    public E2_Operaciones(){
        ListaAlbum=new ArrayList<>();
    }
    
    public void RegistrarAlbum(){
        album = new E2_Album();
        System.out.print("Ingrese Nombre del Album          : ");
        album.setNombre(leer.nextLine());
        System.out.print("Ingrese Nombre del Artista        : ");
        album.setArtista(leer.nextLine());
        System.out.print("Ingrese Formato de las canciones  : ");
        album.setFormato(leer.nextLine());
        ListaAlbum.add(album);
        System.out.print("Ingrese el numero de canciones que tendra el Album : ");
        int n = leer.nextInt();
        leer.nextLine();
        System.out.println("                REGISTRO DE CANCIONES...           ");
        for (int i = 1; i <= n; i++) {
            cancion = new E2_Cancion();
            System.out.print("Ingrese Nombre Cancion        : ");
            cancion.setNcancion(leer.nextLine());
            System.out.print("Ingrese Duracion Cancion      : ");
            cancion.setDuracion(leer.nextFloat());
            leer.nextLine();
            System.out.print("Ingrese Genero de la Cancion  : ");
            cancion.setGenero(leer.nextLine());
            album.AñadirCancion(cancion);
            System.out.println("");
        }
        
    }
    public void MostrarAlbum(){
        if(ListaAlbum != null){
            for(E2_Album al:ListaAlbum){
                al.MostrarAlbum();
            }
        }else{
                 System.out.println("           LISTA DE ALBUNES...         ");
                 System.out.println("");
        }
    }
    public void Buscar(){
        if(ListaAlbum != null){
            int sw=0;
            System.out.println("Ingrese nombre de la Cancion   : ");
            String nc = leer.nextLine();
            System.out.println("");
            for(E2_Album al:ListaAlbum){
                for(E2_Cancion ca:al.getListaCancion()){
                    if(ca.getNcancion().equalsIgnoreCase(nc)){
                        sw=1;
                        System.out.println("Cancion     : " + ca.getNcancion());
                        System.out.println("Album       : "+ al.getNombre());
                        System.out.println("Artista     : " + al.getArtista());
                    }
                }
            }
              if(sw==0){
                 System.out.println("           CANCION INEXISTENTE!!!         ");
                  System.out.println("");
             }
        }
    }
    public void Mostrar2Album(){
         if(ListaAlbum != null){
             int sw=0;
             System.out.print("Ingrese el nombre del Album   : ");
             String album = leer.nextLine();
             System.out.println("");
             for(E2_Album al:ListaAlbum){
                if(al.getNombre().equalsIgnoreCase(album)){
                    sw=1;
                    al.MostrarAlbum();
                }
            }
             if(sw==0){
                 System.out.println("               ALBUM INEXISTENTE!!!              ");
                 System.out.println("");
             }
        }
    }
    public void ElimAlbum(){
        if(ListaAlbum != null){
            int sw=0;
            System.out.print("Ingrese el nombre del Album   : ");
            String e = leer.nextLine();
            System.out.println("");
            Iterator<E2_Album> ite=ListaAlbum.iterator();
             while(ite.hasNext()){
                E2_Album alb = ite.next();
                if(alb.getNombre().equalsIgnoreCase(e)){
                    sw=1;
                    ite.remove();
                    System.out.println("            ALBUM ELIMINADO CON EXITO...          ");
                    System.out.println("");
                }
            }
             if(sw==0){
                 System.out.println("               ALBUM INEXISTENTE!!!           ");
                 System.out.println("");
             }
        }
    }
    
    public void CrearArchivo(){
        Path path=Paths.get("C:\\Users\\SmartUrban2025\\Desktop\\Trabajos INCOS\\2021\\Programacion III\\1er BIM\\Album.txt");
        try {
            if(!Files.exists(path)){
                Files.createFile(path);
                System.out.println("            ARCHIVO CREADO CON EXITO...         ");
                System.out.println("");
            }else{
                System.out.println("            EL ARCHIVO YA EXISTE!!!         ");
                System.out.println("");
            }
        } catch (Exception e) {
        }
    }
    
    public void AlmacenarDatos(){
        String location="C:\\Users\\SmartUrban2025\\Desktop\\Trabajos INCOS\\2021\\Programacion III\\1er BIM\\Album.txt";
        try {
            FileOutputStream archivo=new FileOutputStream(location);
            ObjectOutputStream oos=new ObjectOutputStream(archivo);
            oos.writeObject(ListaAlbum);
            oos.close();
            archivo.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(E2_Operaciones.class.getName()).log(Level.SEVERE, null, ex);
        }catch(IOException ex){
            Logger.getLogger(E2_Operaciones.class.getName()).log(Level.SEVERE, null, ex);            
        }
    }
    
    public void LeerDatos(){
        String location="C:\\Users\\SmartUrban2025\\Desktop\\Trabajos INCOS\\2021\\Programacion III\\1er BIM\\Album.txt";
        try {
            FileInputStream archivo=new FileInputStream(location);
            ObjectInputStream ois=new ObjectInputStream(archivo);
            if(ois!=null){
                ListaAlbum=(List<E2_Album>)ois.readObject();
            }else{
                System.out.println("                EL OBJETO ES NULO               ");
                System.out.println("");
            }
        } catch (FileNotFoundException e) {
            Logger.getLogger(E2_Operaciones.class.getName()).log(Level.SEVERE, null, e);
        }catch(IOException ex){
             Logger.getLogger(E2_Operaciones.class.getName()).log(Level.SEVERE, null, ex);
        }catch(ClassNotFoundException ex){
             Logger.getLogger(E2_Operaciones.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}