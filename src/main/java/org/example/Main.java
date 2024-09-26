package org.example;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Servicio servicio = new Servicio();
        Scanner e = new Scanner(System.in);
        int opcion = 0;
        do {

            System.out.println("1. Mostrar nombre de todos los profesores");
            System.out.println("2. Mostrar nombre y apellido de todos los profesores ordenados por la edad");
            System.out.println("3. Mostrar nombre de profesores con mas de 30 años y mas de 5 de experiencia");
            System.out.println("4. Mostrar nombre profesores con mas de 30 años o mas de 5 años de experiencia");
            System.out.println("5. Profesores con nombre inferior a 6 caracteres");
            System.out.println("6. Profesores que hayan impartido un curso de mas de 500€");
            System.out.println("7. Profesores que hayan impartido un curso de mas de 500 euros y cuanto ha costado ese curso mostrar el precio");
            opcion=e.nextInt();
            switch (opcion){
                case 1:
                    List<String> nombreP = (List<String>) servicio.getNOmbreProfesores();
                    for(String nombre : nombreP){
                        System.out.println("Nombre = " + nombre);
                    }
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
            }
        }while(opcion!=5);



    }
}