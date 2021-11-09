package basico;

import java.util.Scanner;

/*
*  Ej.20: Calcular el perimetro de un circulo
*/

public class PerimeroCirculo {

	public static void main(String[] args) {
		// Declaracion de variables

		Scanner in = new Scanner (System.in);
		double radio,perimetro;
		System.out.println("Ingresa radio: ");
		radio=in.nextDouble();
		perimetro=2*Math.PI*radio; //Pi*diametro
		System.out.printf("Perimetro = %.2f",perimetro);

	}

}
