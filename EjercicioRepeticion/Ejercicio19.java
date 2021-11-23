package EjercicioRepeticion;

import java.util.Scanner;

/*
Ej 19: Realiza un programa que pinte una pirámide por pantalla. La altura se debe pedir por
teclado. El carácter con el que se pinta la pirámide también se debe pedir por teclado
*/
public class Ejercicio19 {
    public static void main(String[] args) {
        // Declaracion de variables
        int base = 1,longitud = 1,altura,espacio,i;
        String relleno;
        Scanner in = new Scanner(System.in);
        System.out.println("-------------------------------------------");
        System.out.println("\t\tPiramide");
        System.out.println("-------------------------------------------");
        System.out.print("Introduce la altura de la pirámide: ");
        altura = in.nextInt();
        System.out.print("Introduce el carácter de relleno: ");
        relleno = in.next();
        espacio = altura - 1;
        while (base <= altura) {
            for (i = 1; i <= espacio; i++) {
                System.out.print(" ");
            }
            for (i = 1; i <= longitud; i++) {
                System.out.print(relleno);
            }
            System.out.println();
            base++;
            espacio--;
            longitud += 2;
        }//Fin de While
    }// Fin del metodo main ()
}// Fin de la clase