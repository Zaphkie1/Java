package EjercicioRepeticion;

import java.util.Scanner;

/*
Ej 12:  Escribe un programa que muestre los n primeros términos de la serie de Fibonacci. El primer
término de la serie de Fibonacci es 0, el segundo es 1 y el resto se calcula sumando los
dos anteriores, por lo que tendríamos que los términos son 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55,
89, 144… El número n se debe introducir por teclado.
*/
public class Ejercicio12 {
    public static void main(String[] args) {
        // Declaracion de variables
        int n, f1, f2, auxiliar;
        Scanner in = new Scanner(System.in);
        System.out.println("-------------------------------------");
        System.out.println("\tSerie de Fibonacci");
        System.out.println("-------------------------------------");
        System.out.print("Por favor, introduzca n: ");
        n = in.nextInt();
        switch (n) {
        case 1:
            System.out.print("0");
            break;
        case 2:
            System.out.print("0 1");
            break;
        default:
            System.out.print("0 1");
            f1 = 0;
            f2 = 1;
            while (n > 2) {
                auxiliar = f1;
                f1 = f2;
                f2 = auxiliar + f2;
                System.out.print(" " + f2);
                n--;
            }//Fin de While
        }//Fin de Switch
    }// Fin del metodo main ()
}// Fin de la clase