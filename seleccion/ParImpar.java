package seleccion;
/*
* Ej10: Determina su un numero es par o impar
*/

import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
		// Declaracion de variables
		double Numero;
		Scanner in = new Scanner(System.in);
		System.out.println("_______________________________");
		System.out.println("\tNumero par o Impar");
		System.out.println("-------------------------------");
		System.out.print("ingresa el numero: ");
		Numero=in.nextDouble();
		if (Numero %2 == 0)
		{
		    System.out.println("El número " +Numero+ " es par");
		}
		else if(Numero == 0)
		{
			System.out.print("El numero " +Numero+ " es neutro");
		}
		else
		{    
			System.out.println("El número " +Numero+ " es impar");
		}

	}

}
