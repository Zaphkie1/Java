package EjercicioRepeticion;

import java.util.Scanner;

/*
Ej 28: Escribe un programa que calcule el factorial de un número entero leído por teclado.
*/
public class Ejercicio28 {
  public static void main(String[] args) {
    // Declaracion de variables
    int numero;
    int factorial, i;
    Scanner in = new Scanner(System.in);
    do {
      System.out.print("Por favor, introduzca un número entero: ");
      numero = in.nextInt();
      if (numero < 0) {
        System.out.println("El número introducido no es correcto.");
      }
    } while (numero < 0);
    factorial = numero;
    if (numero == 0) {
      System.out.println("El factorial del " + numero + " es 1.");
    } else {
      for (i = 1; i < numero; i++) {
        factorial *= i;
      }
      System.out.println(numero + "! = " + factorial);
    }
  }// Fin del metodo main ()
}// Fin de la clase