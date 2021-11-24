package EjercicioRepeticion;

import java.util.Scanner;

/*
Ej 27: Escribe un programa que muestre, cuente y sume los múltiplos de 3 que hay entre 1 y un
número leído por teclado
*/
public class Ejercicio27 {
    public static void main(String[] args) {
        // Declaracion de variables
        int numero1;
        int totaln = 0;
        int sumanum = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("-------------------------------------");
        System.out.println("\tNumero mayor que 1");
        System.out.println("-------------------------------------");
        System.out.print("Introduce un número entero mayor que 1: ");
        numero1 = in.nextInt();
        for (int i = 1; i < numero1; i++) {
            if ((i % 3) == 0) {
                System.out.print(i + " ");
                totaln++;
                sumanum += i;
            }
        }
        System.out.print("\nDesde 1 hasta " + numero1 + " hay " + totaln);
        System.out.println(" múltiplos de 3 y suman " + sumanum);
    }// Fin del metodo main ()
}// Fin de la clase