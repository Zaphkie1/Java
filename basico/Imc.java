package basico;

import java.util.Scanner;

/*
 * Ej13: Calcular el indice de masa corporal
 * mediante la formula imc= peso [KG]/ estatura al cuadrado
 * Nota estatura en metros
 */

public class Imc {

	public static void main(String[] args) {
		// Declaracion de variables
		Scanner in = new Scanner(System.in);
		double peso,altura,imc;
		System.out.println("ingresa peso en KG:");
		peso=in.nextDouble();
		System.out.println("ingresa altura en mts:");
		altura=in.nextDouble();
		imc=peso/Math.pow(altura, 2);
		System.out.printf("Imc = %.2f\n",imc);
		
	}

}
