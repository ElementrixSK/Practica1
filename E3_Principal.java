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
public class E3_Principal {
    public static void main(String[] args) {
        Scanner leer =new Scanner (System.in);
        boolean seguir = true;
        int x;
        E3_Operaciones oh = new E3_Operaciones();
        do{
            System.out.println("                MENU DE OPCIONES                ");
            System.out.println("    1. Crear Registro                           ");
            System.out.println("    2. Registrar Hospital                       ");
            System.out.println("    3. AñadirEspecialidad                       ");
            System.out.println("    4. Guardar Registros                        ");
            System.out.println("    5. Mostrar Especialidades de un Hospital    ");
            System.out.println("    6. Listar Hospitales de una Especialidad    ");
            System.out.println("    7. Cerrar el Programa                       ");
            System.out.print("      Elija una opcion    : ");
            x = leer.nextInt();
            System.out.println("");
            switch(x){
                case 1:
                    oh.CrearArchivo();
                    break;
                case 2:
                    oh.AñadirHospital();
                    oh.AlmacenarDatos();
                    break;
                case 3:
                    oh.AñadirEspecialidad();
                    oh.AlmacenarDatos();
                    break;
                case 4:
                    oh.AlmacenarDatos();
                    break;
                case 5:
                    oh.LeerDatos();
                    oh.MostrarHospital();
                    break;
                case 6:
                    oh.LeerDatos();
                    oh.MostrarPorEsp();
                    break;
                case 7:
                    System.out.println("                CERRANDO PROGRAMA...            ");
                    System.out.println("------------------------------------------------");
                    seguir = false;
                    break;
                default:
                    System.out.println("                OPCION INVALIDA!!!          ");
                    System.out.println("");
                    break;
            }
        }while (seguir);
    }
}