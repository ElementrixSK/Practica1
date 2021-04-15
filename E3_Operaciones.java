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
public class E3_Operaciones {
    Scanner leer = new Scanner (System.in);
    private List <E3_Hospital> ListaHosp;
    private E3_Hospital hos;
    private E3_Especialidad esp;
    
    public E3_Operaciones(){
        ListaHosp = new ArrayList<>();
    }
    
    public void AñadirHospital(){
        hos=new E3_Hospital();
        System.out.print("Ingrese nombre del Hospital       : ");
        hos.setNombre(leer.nextLine());
        System.out.print("Ingrese direccion del Hospital    : ");
        hos.setDireccion(leer.nextLine());
        System.out.print("Ingrese el Nivel del Hospital     : ");
        hos.setNivel(leer.nextInt());
        ListaHosp.add(hos);
        System.out.println("");
    }
 
    public void AñadirEspecialidad(){
        boolean x=true;
        System.out.print("Ingrese nombre del Hospital : ");
          String hos = leer.nextLine();
          System.out.println("");
          for (E3_Hospital m:ListaHosp){
              if(m.getNombre().equalsIgnoreCase(hos)){
                  x=false;
                  System.out.println("Cantidad de Especialidades que tiene el Hospital : ");
                  int lim = leer.nextInt();
                  for (int i = 1; i <= lim; i++) {
                      esp=new E3_Especialidad();
                      System.out.println("Ingrese nombre de Especialidad : ");
                      esp.setNomesp(leer.nextLine());
                      m.AñadirEsp(esp);
                      System.out.println("");
                  }
         
              } 
          }
          if (x){
              System.out.println("            LA ESPECIALIDAD NO SE ENCUENTRA REGISTRADA!!!           ");
              System.out.println("");
          }
    }
    
    public void MostrarHospital(){
        int sw=0;
        System.out.print("Ingrese nombre del Hospital : ");
        String hospi = leer.nextLine();
        System.out.println("");
        for(E3_Hospital hos: ListaHosp){
            if (hos.getNombre().equalsIgnoreCase(hospi)){
                sw = 1;
                hos.MostrarHospital();
            }
        }
        if (sw == 0){
            System.out.println("            EL HOSPITAL NO SE ENCUENTRA REGISTRADO!!!           ");
        }
    }
    
    public void MostrarPorEsp(){
        int x=0;
        System.out.print("Ingrrese nombre de la Especialidad : ");
        String espe = leer.nextLine();
        System.out.println("");
        for(E3_Especialidad es: hos.getListaEspecialidad()){
            if (es.getNomesp().equalsIgnoreCase(espe)){
                x = 1;
                es.MostrarEsp();
            }
        }
        if (x==0){
            System.out.println("            LA ESPECIALIDAD NO SE ENCUENTRA REGISTRADA!!!           ");
            System.out.println("");
        }
    }
    
    public void CrearArchivo(){
        Path path=Paths.get("C:\\Users\\SmartUrban2025\\Desktop\\Trabajos INCOS\\2021\\Programacion III\\1er BIM\\Hospital.txt");
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
    
    public void AlmacenarDatos(){
        String location="C:\\Users\\SmartUrban2025\\Desktop\\Trabajos INCOS\\2021\\Programacion III\\1er BIM\\Hospital.txt";
        try {
            FileOutputStream archivo=new FileOutputStream(location);
            ObjectOutputStream oos=new ObjectOutputStream(archivo);
            oos.writeObject(ListaHosp);
            oos.close();
            archivo.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(E3_Operaciones.class.getName()).log(Level.SEVERE, null, ex);
        }catch(IOException ex){
            Logger.getLogger(E3_Operaciones.class.getName()).log(Level.SEVERE, null, ex);
            
        }
    }
    
    public void LeerDatos(){
        String location="C:\\Users\\SmartUrban2025\\Desktop\\Trabajos INCOS\\2021\\Programacion III\\1er BIM\\Hospital.txt";
        try {
            FileInputStream archivo=new FileInputStream(location);
            ObjectInputStream ois=new ObjectInputStream(archivo);
            if(ois!=null){
                ListaHosp=(List<E3_Hospital>)ois.readObject();
            }else{
                System.out.println("            EL OBJETO ES NULO           ");
                System.out.println("");
            }
        } catch (FileNotFoundException e) {
            Logger.getLogger(E3_Operaciones.class.getName()).log(Level.SEVERE, null, e);
        }catch(IOException ex){
             Logger.getLogger(E3_Operaciones.class.getName()).log(Level.SEVERE, null, ex);
        }catch(ClassNotFoundException ex){
             Logger.getLogger(E3_Operaciones.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}