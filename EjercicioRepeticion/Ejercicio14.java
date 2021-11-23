package EjercicioRepeticion;

import java.util.Scanner;

/*
Ej 14: Escribe un programa que pida una base y un exponente (entero positivo) y que calcule la
potencia.(no utilizar Math.pow)
*/
public class Ejercicio14 {
    public static void main(String[] args) {
        // Declaracion de variables
        int base, exponente;
        double  potencia = 1;
        Scanner in = new Scanner(System.in);
        System.out.println("-------------------------------------");
        System.out.println("\tCalcular potencia");
        System.out.println("-------------------------------------");
        System.out.print("Introduzca la base: ");
        base = in.nextInt();
        System.out.print("Introduzca el exponente: ");
        exponente = in.nextInt();
        if (exponente == 0) {
            potencia = 1;
        }
        if (exponente > 0) {
            for (int i = 0; i < exponente; i++) {
                potencia *= base;
            }
        }
        if (exponente < 0) {
            for (int i = 0; i < -exponente; i++) {
                potencia *= base;
            }
            potencia = 1 / potencia;
        }
        System.out.println(base + "^" + exponente + " = " + potencia);
    }// Fin del metodo main ()
}// Fin de la clase