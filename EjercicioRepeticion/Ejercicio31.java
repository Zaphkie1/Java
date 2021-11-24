package EjercicioRepeticion;

import java.util.Scanner;

/*
Ej 31: Realiza un programa que pinte la letra L por pantalla hecha con asteriscos. El programa
pedirá la altura. El palo horizontal de la L tendrá una longitud de la mitad (división entera
entre 2) de la altura más uno. Ejemplo:
Introduzca la altura de la L: 5
*
*
*
*
* * *
*/
public class Ejercicio31 {
    public static void main(String[] args) {
        //Declaracion de variables
        int altura,i;
        Scanner in = new Scanner(System.in);
        System.out.print("Introduzca la altura de la L: ");
        altura = in.nextInt();
        for (i = 1; i < altura; i++) {
          System.out.println("*");
        }
        for (i = 0; i < altura / 2 + 1; i++) {
          System.out.print("* ");
        }
    }// Fin del metodo main ()
}// Fin de la clase