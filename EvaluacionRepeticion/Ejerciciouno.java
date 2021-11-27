package EvaluacionRepeticion;

import java.util.Scanner;

/*
Ej1: Leer un número y mostrar su valor elevado a la dos , cuatro, seis, ocho en
formato de tabla, repetir el proceso hasta que se introduzca un número
negativo utilizar sentencia while. (10 pts)
*/
public class Ejerciciouno {
    public static void main(String[] args) {
        // Declaracion de Variables
        double num, elevado2, elevado4, elevado6, elevado8;
        Scanner in = new Scanner(System.in);
        for (int i = 1; i <= 2; i++) {
            System.out.println("Ingresa un numero: ");
            num = in.nextInt();
            elevado2 = (int) Math.pow(num, 2);
            elevado4 = (int) Math.pow(num, 4);
            elevado6 = (int) Math.pow(num, 6);
            elevado8 = (int) Math.pow(num, 8);
            System.out.println("numero |elevado 2|elevado 4|elevado 6 | elevado 8");
            System.out.println(num + " | " + elevado2 + " | " + elevado4 + " | " + elevado6 + " | " + elevado8);
        } // Fin for
    }// Fin main
}// Fin class