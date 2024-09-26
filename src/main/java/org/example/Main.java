package org.example;

import com.mysql.cj.protocol.x.Notice;

import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Servicio servicio = new Servicio();
        Scanner e = new Scanner(System.in);
        Profesor profesor = new Profesor();
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
                    List<Profesor> result = servicio.mostrarNombreYapellido();
                    for(Profesor r : result){
                        System.out.println("NOMBRE: "+r.getNombre()+" Apellido: "+r.getApellido());
                    }
                    break;
                case 3:
                    List<Profesor> resultado = servicio.Ejercicio3();
                    for(Profesor r : resultado){
                        System.out.println("NOMBRE: "+r.getNombre()+" Apellido: "+r.getEdad()+"Años experiencia: "+r.getA_Experiencia());
                    }
                    break;
                case 4:
                    List<Profesor> R2 = servicio.Ejercicio4();
                    for(Profesor r : R2){
                        System.out.println("NOMBRE: "+r.getNombre()+" Apellido: "+r.getEdad()+"Años experiencia: "+r.getA_Experiencia());
                    }
                    break;
                case 5:
                    List<Profesor> R3 = servicio.Ejercicio5();
                    for(Profesor r : R3){
                        System.out.println("nombre: "+r.getNombre()+"  letras:"+r.getNombre().length());
                    }
                    break;
                case 6:

                    break;
                case 7:

                    break;
            }
        }while(opcion!=0);



    }
}