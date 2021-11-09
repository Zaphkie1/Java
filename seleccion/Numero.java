package seleccion;

import java.util.Scanner;

public class Numero {

	public static void main(String[] args) {
		// Declaracion de variables
		double Numero;
		Scanner in = new Scanner(System.in);
		System.out.println("_______________________________");
		System.out.println("Numero positivo o negativo");
		System.out.println("-------------------------------");
		System.out.print("ingresa el numero: ");
		Numero=in.nextDouble();
		if(Numero >= 1)
		{
			System.out.print("El numero " +Numero+ " es positivo");
		}
		else if(Numero == 0)
		{
			System.out.print("El numero " +Numero+ " es neutro");
		}
		else
		{
			System.out.print("El numero " +Numero+ " es negativo");
		}
	}
}