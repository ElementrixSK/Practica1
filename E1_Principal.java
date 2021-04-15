/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica;

import java.util.Scanner;

/**
 *
 * @author SmartUrban2025
 */
public class E1_Principal {
    public static void main(String[] args) {
        Scanner leer =new Scanner (System.in);
        boolean seguir = true;
        int opc;
        E1_Operaciones od = new E1_Operaciones();
        do{
            System.out.println("            MENU DE OPCIONES            ");
            System.out.println("        1. Crear Archivo                ");
            System.out.println("        2. Añadir Docente               ");
            System.out.println("        3. Añadir Materias              ");
            System.out.println("        4. Guardar Registros            ");
            System.out.println("        5. Asignar Materias al Docente  ");
            System.out.println("        6. Mostrar Docente              ");
            System.out.println("        7. Cerrar el Programa           ");
            System.out.print("          Elija una opcion       : ");
            opc = leer.nextInt();
            System.out.println("");
            switch(opc){
                case 1:
                    od.CrearArchivo();
                    break;
                case 2:
                    od.AñadirDocente();
                    break;
                case 3:
                    od.AñadirMateria();
                    break;
                case 4:
                    od.AlmacenarDatos();
                    break;
                case 5:
                    od.LeerDatos();
                    od.AsignarMateria();
                    break;
                case 6:
                    od.LeerDatos();
                    od.MostrarDocente();
                    break;
                case 7:
                    System.out.println("            CERRANDO PROGRAMA!!!            ");
                    System.out.println("--------------------------------------------");
                    seguir = false;
                    break;
                default:
                    System.out.println("            OPCION INVALIDA!!!          ");
                    System.out.println("");
                    break;
            }
        }while (seguir);
    }
}