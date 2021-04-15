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
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author SmartUrban2025
 */
public class E4_Operaciones {
    Scanner leer = new Scanner (System.in);
    private List <E4_DiscoDuro> ListaDisco;
    private E4_DiscoDuro discoduro;
    private E4_Archivo archivo;
    
    public E4_Operaciones(){
        ListaDisco = new ArrayList<>();
    }
    
    public void RegistrarDisco(){
        discoduro = new E4_DiscoDuro();
        discoduro.Llenar();
        ListaDisco.add(discoduro);
    }
 
    public void AgregarArchivos(){
        boolean x=true;
        System.out.print("Ingrese marca del Disco Duro          : ");
          String nom = leer.nextLine();         
          for (E4_DiscoDuro m:ListaDisco){
              if(m.getMarca().equalsIgnoreCase(nom)){
                  x=false;
                  System.out.print("Cantiodad de Archivos que desea agregar : ");
                  int lim = leer.nextInt();
                  archivo =new E4_Archivo();
                  for (int i = 1; i <= lim; i++) {
                      leer.nextLine();
                      System.out.print("Ingrese nombre del Archivo          : ");
                      archivo.setNomarchivo(leer.nextLine());
                      System.out.print("Ingrese el Tamaño del Archivo       : ");
                      double tam = leer.nextDouble();
                      System.out.println("");
                      if(m.getEspacio() > tam){
                        archivo.setTamaño(tam);
                        double esp = m.getEspacio() - tam;
                        m.setEspacio(esp);
                        m.AñadirAr(archivo);
                      }else{
                          System.out.println("          ESPACIO INSUFICIENTE!!!           ");
                          System.out.println("");
                      }
                  }
              } 
          }
          if (x){
              System.out.println("            EL DISCO DURO NO SE ENCUENTRA REGISTRADO!!!         ");
              System.out.println("");
          }
    }
    
    public void MostrarDisco(){
        int x=0;
        System.out.print("Ingrese marca del Disco Duro  : ");
        String disco = leer.nextLine();   
        System.out.println("");
        for(E4_DiscoDuro dis: ListaDisco){
            if (dis.getMarca().equalsIgnoreCase(disco)){
                x = 1;
                dis.Mostrar();
            }
        }
        if (x == 0){
            System.out.println("            EL DISCO DURO NO SE ENCUENTRA REGISTRADO!!!         ");
            System.out.println("");
        }
    }
    
    public void EliminarAr(){
        int x=0;
        System.out.print("Ingrese marca del Disco Duro   : ");
        String disco = leer.nextLine();
        System.out.println("");
        for(E4_DiscoDuro dis: ListaDisco){
            if (dis.getMarca().equalsIgnoreCase(disco)){
                x = 1;
                System.out.println("Ingrese nombre del Archivo   : ");
                String nom = leer.nextLine();
                System.out.println("");
                dis.ElimAr(nom);
            }
        }
        if (x == 0){
            System.out.println("            EL DISCO DURO NO SE ENCUENTRA REGISTRADO!!!         ");
            System.out.println("");
        }
    }
    
    public void CrearArchivo(){
        Path path=Paths.get("C:\\Users\\SmartUrban2025\\Desktop\\Trabajos INCOS\\2021\\Programacion III\\1er BIM\\Disco.txt");
        try {
            if(!Files.exists(path)){
                Files.createFile(path);
                System.out.println("            ARCHIVO CREADO EXITOSAMENTE...          ");
                System.out.println("");
            }else{
                System.out.println("            EL ARCHIVO YA EXISTE!!!         ");
                System.out.println("");
            }
        } catch (Exception e) {
        }
    }
    
    public void AlamacenarDatos(){
        String location="C:\\Users\\SmartUrban2025\\Desktop\\Trabajos INCOS\\2021\\Programacion III\\1er BIM\\Disco.txt";
        try {
            FileOutputStream archivo=new FileOutputStream(location);
            ObjectOutputStream oos=new ObjectOutputStream(archivo);
            oos.writeObject(ListaDisco);
            oos.close();
            archivo.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(E4_Operaciones.class.getName()).log(Level.SEVERE, null, ex);
        }catch(IOException ex){
            Logger.getLogger(E4_Operaciones.class.getName()).log(Level.SEVERE, null, ex);
            
        }
    }
    
    public void LeerDatos(){
        String location="C:\\Users\\SmartUrban2025\\Desktop\\Trabajos INCOS\\2021\\Programacion III\\1er BIM\\Disco.txt";
        try {
            FileInputStream archivo=new FileInputStream(location);
            ObjectInputStream ois=new ObjectInputStream(archivo);
            if(ois!=null){
                ListaDisco=(List<E4_DiscoDuro>)ois.readObject();
            }else{
                System.out.println("            EL OBJETO ES NULO           ");
                System.out.println("");
            }
        } catch (FileNotFoundException e) {
            Logger.getLogger(E4_Operaciones.class.getName()).log(Level.SEVERE, null, e);
        }catch(IOException ex){
             Logger.getLogger(E4_Operaciones.class.getName()).log(Level.SEVERE, null, ex);
        }catch(ClassNotFoundException ex){
             Logger.getLogger(E4_Operaciones.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}