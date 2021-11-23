package EjercicioRepeticion;

import java.util.Scanner;

/*
Ej 9: Realiza un programa que nos diga cuántos dígitos tiene un número introducido
por teclado
*/
public class Ejercicio9 {
    public static void main(String[] args) {
        // Delcracion de variables
        int numero = 1;
        int numeroingresado,n;
        Scanner in = new Scanner(System.in);
        System.out.println("-------------------------------------");
        System.out.println("\tDigitos de un numero");
        System.out.println("-------------------------------------");
        System.out.print("Introduzca un número: ");
        numeroingresado = in.nextInt();
        n = numeroingresado;
        while (n > 10) {
            n /= 10;
            numero++;
        }
        System.out.println("El numero "+ numeroingresado + " tiene " + numero + " dígitos.");
    }// Fin del metodo main ()
}// Fin de la clase
