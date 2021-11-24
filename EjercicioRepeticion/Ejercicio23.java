package EjercicioRepeticion;

import java.util.Scanner;

/*
Ej 23: Escribe un programa que permita ir introduciendo una serie indeterminada de números
mientras su sumanumeros no supere el valor 10000. Cuando esto último ocurra, se debe mostrar el
total acumulado, el contador de los números introducidos y la media.
*/
public class Ejercicio23 {
  public static void main(String[] args) {
    // Declaracion de variables
    int numerointroducido;
    int sumanumeros = 0;
    int numeros = 0;
    Scanner in = new Scanner(System.in);
    System.out.println("----------------------------------------------------------------------------------------");
    System.out.println("\t\t\t\t\tSuma numeros");
    System.out.println("----------------------------------------------------------------------------------------");
    do {
      System.out.print("Ingresa un numero: ");
      numerointroducido = in.nextInt();
      sumanumeros += numerointroducido;
      numeros++;
    } while (sumanumeros <= 10000);
    System.out.println("Ha introducido un total de " + numeros + " números.");
    System.out.println("La sumanumeros total es " + sumanumeros + ".");
    System.out.println("La media es " + sumanumeros / numeros + ".");
    }// Fin del metodo main ()
}// Fin de la clase