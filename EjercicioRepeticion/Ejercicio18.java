package EjercicioRepeticion;

import java.util.Scanner;

/*
Ej 18: Escribe un programa que obtenga los números enteros comprendidos entre dos números
introducidos por teclado y validados como distintos, el programa debe empezar por el menor
de los enteros introducidos e ir incrementando de 7 en 7.
*/
public class Ejercicio18 {
    public static void main(String[] args) {
        // Declaracion de variables
        int Numero1,Numero2,i,auxiliar;
        Scanner in = new Scanner(System.in);
        System.out.println("-------------------------------------------------------------------");
        System.out.println("\tnumeros enteros comprendidos entre dos números");
        System.out.println("-------------------------------------------------------------------");
        do {
            System.out.print("Introduce un numero: ");
            Numero1 = in.nextInt();
            System.out.print("Introduce otro numero diferente al anterior: ");
            Numero2 = in.nextInt();
            if (Numero1 == Numero2) {
                System.out.println("Los numeros que se han introducido deben ser diferentes.");
            }
        } while (Numero1 == Numero2);
        if (Numero1 > Numero2) {
            auxiliar = Numero1;
            Numero1 = Numero2;
            Numero2 = auxiliar;
        }
        for (i = Numero1; i <= Numero2; i += 7) {
            System.out.print(i + " ");
        }//Fin de for
    }// Fin del metodo main ()
}// Fin de la clase