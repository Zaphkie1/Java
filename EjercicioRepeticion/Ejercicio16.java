package EjercicioRepeticion;

import java.util.Scanner;

/*
Ej 16: Escribe un programa que diga si un número introducido por teclado es o no primo. Un
número primo es aquel que sólo es divisible entre él mismo y la unidad
*/
public class Ejercicio16 {
    public static void main(String[] args) {
        // Declaracion variables
        int numeroingresado, i;
        boolean nprimo = true;
        Scanner in = new Scanner(System.in);
        System.out.println("--------------------------------------------");
        System.out.println("\tNumero primo o no primo");
        System.out.println("--------------------------------------------");
        System.out.print("Ingresa un número: ");
        numeroingresado = in.nextInt();
        for (i = 2; i < numeroingresado; i++) {
            if ((numeroingresado % i) == 0) {
                nprimo = false;
            }
        }//Fin del For
        if (nprimo) {
            System.out.println("El número introducido es primo.");
        } else {
            System.out.println("El número introducido no es primo.");
        }
    }// Fin del metodo main ()
}// Fin de la clase