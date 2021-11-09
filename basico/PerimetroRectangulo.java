package basico;

import java.util.Scanner;

/*
*  Ej.19: Calcular el perimetro de un rectangulo
*/

public class PerimetroRectangulo {

	public static void main(String[] args) {
		// Declaracion de variables
	      
		Scanner sc=new Scanner(System.in);
	    double largo,ancho,perimetro;
	    System.out.println("Ingresa el largo del rectangulo:");
	    largo=sc.nextDouble();
	    System.out.println("Ingresa el ancho del rectangulo:");
	    ancho=sc.nextDouble();
	    perimetro=2*(ancho+largo);
	    System.out.println(perimetro);
	     }
	}