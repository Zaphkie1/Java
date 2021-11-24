package EjercicioRepeticion;

import java.util.Scanner;

/*
Ej 25: Realiza un programa que pida un número por teclado y que luego muestre ese número al
revés.
*/
public class Ejercicio25 {
    public static void main(String[] args) {
        // Declaracion de variables
        int numeroin, numero, numerovolteado;
        Scanner in = new Scanner(System.in);
        System.out.println("-------------------------------------");
        System.out.println("\tNumero volteado");
        System.out.println("-------------------------------------");
        System.out.print("Introduce un número : ");
        numeroin = in.nextInt();
        numero = numeroin;
        numerovolteado = 0;
        while (numero > 0) {
            numerovolteado = (numerovolteado * 10) + (numero % 10);
            numero /= 10;
        } // while
        System.out.println("El numero " + numeroin + " si lo volteamos seria: " + numerovolteado);
    }// Fin del metodo main ()
}// Fin de la clase