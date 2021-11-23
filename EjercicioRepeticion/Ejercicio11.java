package EjercicioRepeticion;

import java.util.Scanner;

/*
Ej 11: Escribe un programa que muestre en tres columnas, el cuadrado y el cubo de los 5 primeros
números enteros a partir de uno que se introduce por teclado
*/
public class Ejercicio11 {
    public static void main(String[] args) {
        // Delcracion de variables
        int numeroingresado,i;
        Scanner in = new Scanner(System.in);
        System.out.println("------------------------------------------------");
        System.out.println("\tCuadrado y el cubo de 5 numeros");
        System.out.println("------------------------------------------------");
        System.out.print("Introduzca un número: ");
        numeroingresado = in.nextInt();
        for (i = numeroingresado; i < numeroingresado + 5; i++) {
            System.out.printf("%4d %6d %8d\n", i, i * i, i * i * i);
        }
    }// Fin del metodo main ()
}// Fin de la clase