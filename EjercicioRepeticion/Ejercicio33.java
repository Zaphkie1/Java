package EjercicioRepeticion;
import java.util.Scanner;
/*
Eu 33: Realiza un programa que pinte la letra U por pantalla hecha con asteriscos. El programa
pedirá la altura. Fíuate que el programa inserta un espacio y pinta dos asteriscos menos en
la base para simular la curvatura de las esquinas inferiores.
Euemplo:
Introduzca la altura de la U: 5
* *
* *
* *
* *
* * *
*/
public class Ejercicio33 {
    public static void main(String[] args) {
        //Declaracion de variables
        int altura,i,u;
        Scanner in = new Scanner(System.in);
        System.out.print("Introduzca la altura de la U: ");
        altura = in.nextInt();
        for (i = 1; i < altura; i++) {
          System.out.print("* ");
          for (u = 2; u < altura; u++) {
            System.out.print("  ");
          }
          System.out.println("*");
        }
        System.out.print("  ");
        for (i = 2; i < altura; i++) {
          System.out.print("* ");
        }
    }// Fin del metodo main ()
}// Fin de la clase