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
public class E1_Operaciones {
    private E1_Docente docente;
    private List<E1_Materia> ListaMat;
    Scanner leer = new Scanner (System.in);
    
    public E1_Operaciones(){
        ListaMat = new ArrayList<>();
    }
    
    public void AñadirDocente(){
        docente = new E1_Docente();
        System.out.print("Ingrese Nombre           : ");
        docente.setNom(leer.nextLine());
        System.out.print("Ingrese Apellido Paterno : ");
        docente.setPat(leer.nextLine());
        System.out.print("Ingrese Apellido Materno : ");
        docente.setMat(leer.nextLine());
        System.out.print("Ingrese su Titulo        : ");
        docente.setTitulo(leer.nextLine());
        System.out.print("Ingrese carga Horaria    : ");
        docente.setCargahora(leer.nextInt());
        docente.setHmax(0);
        System.out.println("");
    }
    
      public void MostrarDocente(){
          if(docente != null){
              docente.Mostrar();
          }
      }
      
      public void AñadirMateria(){
          E1_Materia m = new E1_Materia();
          m.CrearMateria();
          ListaMat.add(m);
      }
      
      public void AsignarMateria(){
          boolean x=true;
          System.out.print("Ingrese nombre de la Materia: ");
          String nombre = leer.nextLine();
          System.out.println("");
          for (E1_Materia m:ListaMat){
              if(m.getMateria().equalsIgnoreCase(nombre)){
                  x=false;
                  if(docente.getCargahora() == docente.getHmax()){
                      System.out.println("      Carga Horaria Completada - No se pueden asignar mas Materias!!!!! ");
                      System.out.println("");
                  }else{
                  if(docente.getCargahora()>docente.getHmax()){
                      docente.Añadir(m);
                      int a = m.getHoramat() + docente.getHmax();
                      docente.setHmax(a);
                  }else{
                      int b = docente.getCargahora() - docente.getHmax();
                      System.out.println("Carga Horaria disponible del Docente : "+b);
                      System.out.println("");
                  }
                  }
              } 
          }
          if(x){
              System.out.println("          MATERIA INEXISTENTE!!!            ");
                  System.out.println("");
          }
      }
      
    public void CrearArchivo(){
        Path path=Paths.get("C:\\Users\\SmartUrban2025\\Desktop\\Trabajos INCOS\\2021\\Programacion III\\1er BIM\\Docente.txt");
        try {
            if(!Files.exists(path)){
                Files.createFile(path);
                System.out.println("            ARCHIVO CREADO CON EXITO...         ");
                System.out.println("");
            }else{
                System.out.println("            EL ARCHIVO YA EXITE!!!          ");
                System.out.println("");
            }
        } catch (Exception e) {
        }
    }
    
    public void AlmacenarDatos(){
        String location="C:\\Users\\SmartUrban2025\\Desktop\\Trabajos INCOS\\2021\\Programacion III\\1er BIM\\Docente.txt";
        try {
            FileOutputStream archivo=new FileOutputStream(location);
            ObjectOutputStream oos=new ObjectOutputStream(archivo);
            oos.writeObject(ListaMat);
            oos.close();
            archivo.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(E1_Operaciones.class.getName()).log(Level.SEVERE, null, ex);
        }catch(IOException ex){
            Logger.getLogger(E1_Operaciones.class.getName()).log(Level.SEVERE, null, ex);
            
        }
    }
    
    public void LeerDatos(){
        String location="C:\\Users\\SmartUrban2025\\Desktop\\Trabajos INCOS\\2021\\Programacion III\\1er BIM\\Docente.txt";
        try {
            FileInputStream archivo=new FileInputStream(location);
            ObjectInputStream ois=new ObjectInputStream(archivo);
            if(ois!=null){
                ListaMat=(List<E1_Materia>)ois.readObject();
            }else{
                System.out.println("            EL OBJETO ES NULO           ");
                System.out.println("");
            }
        } catch (FileNotFoundException e) {
            Logger.getLogger(E1_Operaciones.class.getName()).log(Level.SEVERE, null, e);
        }catch(IOException ex){
             Logger.getLogger(E1_Operaciones.class.getName()).log(Level.SEVERE, null, ex);
        }catch(ClassNotFoundException ex){
             Logger.getLogger(E1_Operaciones.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
