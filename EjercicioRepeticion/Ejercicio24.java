package EjercicioRepeticion;

import java.util.Scanner;

/*
Ej 24: Escribe un programa que lea un número n e imprima una pirámide de números con n filas
como en la siguiente figura:
1
121
12321
1234321
*/
public class Ejercicio24 {
    public static void main(String[] args) {
        int altura2;
        int altura = 1;
        int i = 0;
        int espacio;
        Scanner in = new Scanner(System.in);
        System.out.println("-------------------------------------");
        System.out.println("\tAltura de una piramide");
        System.out.println("-------------------------------------");
        System.out.print("Introduce la altura de la pirámide:");
        altura2 = in.nextInt();
        espacio = altura2 - 1;
        while (altura <= altura2) {
            for (i = 1; i <= espacio; i++) {
                System.out.print(" ");
            }
            for (i = 1; i < altura; i++) {
                System.out.print(i);
            }
            for (i = altura; i > 0; i--) {
                System.out.print(i);
            }
            System.out.println();
            altura++;
            espacio--;
        } //Fin del while
    }// Fin del metodo main ()
}// Fin de la clase