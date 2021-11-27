package Metodos;

import java.util.Scanner;

/**
Ej5: Determinar si un estudiante aprobo el semestre
ingresando un determinado numero de calificaciones
utiliza definicion de metodos y paso de parametros
 */
public class PromedioEstudiante {
    public static void main(String[] args) {
        ingresaDatos();
    }

    private static void ingresaDatos() {
        //Declaracion de variables
        int ncalif;
        String nombre;
        double calif,scalif=0;
        Scanner in = new Scanner(System.in);
        System.out.println("-------------------------------------");
        System.out.println("\tPromedio Estudiante");
        System.out.println("-------------------------------------");
        System.out.print("Ingresa nombre del estudiante: ");
        nombre=in.next();
        System.out.print("Ingresa el numero de calificaciones: ");
        ncalif=in.nextInt();
        for(int i=1;i<=ncalif;i++){
            System.out.println("Ingresa calificacion "+i+" : ");
            calif=in.nextDouble();
            scalif+=calif;
        }
        obtenerPromedio(nombre,scalif,ncalif);
    }

    private static void obtenerPromedio(String nombre, double scalif, int ncalif) {
        double promedio;
        String status;
        promedio=scalif/ncalif;
        status=determinaStatus(promedio);
        System.out.println("-------------------------------------");
        System.out.println("Estudiante: "+nombre);
        System.out.println("Promedio: "+promedio);
        System.out.println("Status: "+status);
        System.out.println("-------------------------------------");
    }

    private static String determinaStatus(double promedio) {
        if(promedio >= 70 && promedio <=100){
            return "Aprobado";
        }
        else{
            return "Reprovado";
        }
    }
}
