package EjercicioRepeticion;

import java.util.Scanner;

/*
Ej 8:Muestra la tabla de multiplicar de un número introducido por teclado.
*/
public class Ejercicio8 {
    public static void main(String[] args) {
        // Declaracion de variables
        int numero;
        Scanner in = new Scanner(System.in);
        System.out.println("-------------------------------------");
        System.out.println("\tTabla de multiplicar");
        System.out.println("-------------------------------------");
        System.out.print("Introduce el numero que deseas multiplicar: ");
        numero = in.nextInt();
        for (int i = 0; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + numero * i);
        }//Fin del for
    }//Fin del metodo main ()
}//Fin de la clase
