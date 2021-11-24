package EjercicioRepeticion;

import java.util.Scanner;

/*
Ej 29: Escribe un programa que muestre por pantalla todos los números enteros positivos
menores a uno leído por teclado que no sean divisibles entre otro también leído de igual
forma
*/
public class Ejercicio29 {
  public static void main(String[] args) {
    int numeroGrande, numeroPequeno, cuenta = 0, suma = 0, i;
    Scanner in = new Scanner(System.in);
    System.out.print("Introduzca un número entero positivo (relativamente grande): ");
    numeroGrande = in.nextInt();
    System.out.print("Introduzca otro número (relativamente pequeño): ");
    numeroPequeno = in.nextInt();
    System.out.print("Los números enteros positivos menores que " + numeroGrande);
    System.out.println(" que no son divisibles entre " + numeroPequeno + " son los siguientes:");
    for (i = 1; i < numeroGrande; i++) {
      if ((i % numeroPequeno) != 0) {
        System.out.print(i + " ");
      }
    } // Din de for
  }// Fin del metodo main ()
}// Fin de la clase