package Guia;
/*
* Ej7:
* Realiza un programa que calcule la media de tres notas.
*/

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        //Declaracion de variables
        Double nota1,nota2,nota3,media;
        Scanner in = new Scanner(System.in);
        System.out.println("_______________________________");
		System.out.println("\tMedia de tres notas");
		System.out.println("-------------------------------");
        System.out.print("Introduzca la primera nota: ");
        nota1 = in.nextDouble();
        System.out.print("Introduzca la segunda nota: ");
        nota2 = in.nextDouble();        
        System.out.print("Introduzca la tercera nota: ");
        nota3 = in.nextDouble();        
        media = (nota1 + nota2 + nota3) / 3;
        System.out.printf("La media es "+media+"\n");
    }//Fin del metodo main ()
}//Fin de la clase
