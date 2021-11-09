package Guia;
/*
* Ej5:
* Realiza un programa que resuelva una ecuación de 
* primer grado (del tipo axb = 0)
*/

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        //Declaracion de variables
        Double a,b;
		Scanner in = new Scanner(System.in);
        System.out.println("_______________________________");
		System.out.println("Operacion del tipo axb = 0");
		System.out.println("-------------------------------");
        System.out.print("Por favor, introduzca el valor de a: ");
        a = in.nextDouble();
        System.out.print("Ahora introduzca el valor de b: ");
        b = in.nextDouble();
        if (a == 0) 
        {
          System.out.println("Esa ecuación no tiene solución real.");
        } 
        else
        {
          System.out.println("x = " + (-b/a));
        }
    }//Fin del metodo main ()
}//Fin de la clase