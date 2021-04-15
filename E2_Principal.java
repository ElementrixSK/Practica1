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
public class E2_Principal {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        E2_Operaciones oa = new E2_Operaciones();
        boolean seguir = true;
        int x;
        do {
            System.out.println("            MENU DE OPCIONES            ");
            System.out.println("        1. Crear Archivo                ");
            System.out.println("        2. Registrar Album              ");
            System.out.println("        3. Guardar Registros            ");
            System.out.println("        4. Mostrar Albunes              ");
            System.out.println("        5. Buscar Cancion               ");
            System.out.println("        6. Mostrar Album                ");
            System.out.println("        7. Eliminar Album               ");
            System.out.println("        8. Cerrar el Programa           ");
            System.out.print("          Elija una opcion :      ");
            x = leer.nextInt();
            System.out.println("");
            switch (x) {
                case 1:
                    oa.CrearArchivo();
                    break;
                case 2:
                    oa.LeerDatos();
                    oa.RegistrarAlbum();
                    oa.AlmacenarDatos();
                    break;
                case 3:
                    oa.AlmacenarDatos();
                    break;
                case 4:
                    oa.LeerDatos();
                    oa.MostrarAlbum();
                    break;
                case 5:
                    oa.LeerDatos();
                    oa.Buscar();
                    break;
                case 6:
                    oa.LeerDatos();
                    oa.Mostrar2Album();
                    break;
                case 7:
                    oa.LeerDatos();
                    oa.ElimAlbum();
                    oa.AlmacenarDatos();
                    break;
                case 8:
                    System.out.println("            CERRANDO PROGRAMA...            ");
                    System.out.println("--------------------------------------------");
                    seguir = false;
                    break;
                default:
                    System.out.println("                OPCION INVALIDA!!!          ");
                    System.out.println("");
                    break;
            }
        } while (seguir);
    }
}