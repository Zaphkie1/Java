package EjercicioRepeticion;

import java.util.Scanner;

/*
Ej 17: Realiza un programa que sume los 100 números siguientes a un número entero y positivo
introducido por teclado. Se debe comprobar que el dato introducido es correcto (que es un
número positivo).
*/
public class Ejercicio17 {
    public static void main(String[] args) {
        // Declaraion de variables
        int numeroingresado = 0, suma = 0, i;
        Scanner in = new Scanner(System.in);
        System.out.println("-------------------------------------------------------------------");
        System.out.println("\tnúmeros siguientes a un número entero y positivo");
        System.out.println("-------------------------------------------------------------------");
        do {
            System.out.print("Introduzca un número: ");
            numeroingresado = in.nextInt();
            if (numeroingresado < 0) {
                System.out.println("Error, tienes que introducir un número positivo.");
            }
        } while (numeroingresado < 0);
        for (i = numeroingresado; i < numeroingresado + 100; i++) {
            suma += i;
        }
        System.out.println("La suma de los 100 números que siguen de " + numeroingresado + " es " + suma);
    }// Fin del metodo main ()
}// Fin de la clase