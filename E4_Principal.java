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
public class E4_Principal {
    public static void main(String[] args) {
        Scanner leer =new Scanner (System.in);
        boolean seguir = true;
        int x;
        E4_Operaciones od = new E4_Operaciones();
        do{
            System.out.println("            MENU DE OPCIONES            ");
            System.out.println("    1. Crear archivo                    ");
            System.out.println("    2. Registrar Disco Duro             ");
            System.out.println("    3. Añadir Archivos                  ");
            System.out.println("    4. Guardar registros                ");
            System.out.println("    5. Mostrar Disco Duro               ");
            System.out.println("    6. Eliminar Archivo                 ");
            System.out.println("    7. Cerrar el Programa               ");
            System.out.print("      Elija una opcion        : ");
            x = leer.nextInt();
            System.out.println("");
            switch(x){
                case 1:
                    od.CrearArchivo();
                    break;
                case 2:
                    od.LeerDatos();
                    od.RegistrarDisco();
                    od.AlamacenarDatos();
                    break;
                case 3:
                    od.LeerDatos();
                    od.AgregarArchivos();
                    od.AlamacenarDatos();
                    break;
                case 4:
                    System.out.println("        DATOS REGISTRADOS CON EXITO...      ");
                    System.out.println("");
                    od.AlamacenarDatos();
                    break;
                case 5:
                    od.LeerDatos();
                    od.MostrarDisco();
                    break;
                case 6:
                    od.LeerDatos();
                    od.EliminarAr();
                    od.AlamacenarDatos();
                    break;
                case 7:
                    System.out.println("            CERRANDO PROGRAMA...            ");
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