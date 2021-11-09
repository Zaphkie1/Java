package basico;

import java.util.Scanner;

/*
*  Ej.21: Calcular el perimetro de un triangulo
*/

public class PerimetroTriangulo {

	public static void main(String[] args) {
		// Declaracion de variables

		Scanner in = new Scanner (System.in);
		double ladoa,ladob,ladoc,perimetro;
		System.out.println("Ingrese lado a: ");
		ladoa=in.nextDouble();
		System.out.println("Ingrese lado b: ");
		ladob=in.nextDouble();
		System.out.println("Ingrese lado c: ");
		ladoc=in.nextDouble();
		perimetro=ladoa+ladob+ladoc;
		System.out.printf("Perimetro = %.2f",perimetro);

	}

}
