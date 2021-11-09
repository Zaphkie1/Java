package basico;

import java.util.Scanner;

/*
*  Ej.18: Calcular el perimetro de un cuadrado.
*/

public class PerimetroCuadrado {

	public static void main(String[] args) {
		// Declaracion de variables
		
		Scanner sc=new Scanner(System.in);
	    double lado1,lado2,lado3,lado4,perimetro;
	    System.out.println("Ingresa el lado 1 del cuadrado:");
	    lado1=sc.nextDouble();
	    System.out.println("Ingresa el lado 2 del cuadrado:");
	    lado2=sc.nextDouble();
	    System.out.println("Ingresa el lado 3 del cuadrado:");
	    lado3=sc.nextDouble();
	    System.out.println("Ingresa el lado 4 del cuadrado:");
	    lado4=sc.nextDouble();
	    perimetro=lado1+lado2+lado3+lado4;
	    System.out.println(perimetro);

	}

}
