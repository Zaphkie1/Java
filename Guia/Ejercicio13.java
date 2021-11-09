package Guia;

import java.util.Scanner;

/*
* Ej13:
* Escribe un programa que ordene tres números
* enteros introducidos por teclado.
*/
public class Ejercicio13 {
    public static void main(String[] args) {
        //Declaracion de variables
        int[] n = new int[10];
        int i;
        
        System.out.println("Por favor, introduzca 10 números enteros.");
        System.out.println("Pulse la tecla INTRO después de introducir cada número.");
    
        for (i = 0; i < 10; i++) {
          n[i] = Integer.parseInt(System.console().readLine());
        }
        
        System.out.println("\nLos números introducidos, al revés, son los siguientes:");
        for (i = 9; i >= 0; i--) {
          System.out.println(n[i]);
        }
    }//Fin del metodo main ()
}//Fin de la clase