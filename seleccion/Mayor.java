package seleccion;
/*
 *  Ej.12: Determina cual es el mayor de dos numeros
 */
import java.util.Scanner;

public class Mayor {

	public static void main(String[] args) {
		// Declaracion de variables
		double Numero1;
		double Numero2;
		Scanner in = new Scanner(System.in);
		System.out.println("_______________________________________");
		System.out.println("\tNumero mayor de 2 numeros");
		System.out.println("---------------------------------------");
		System.out.print("ingresa el numero 1: ");
		Numero1=in.nextDouble();
		System.out.print("ingresa el numero 2: ");
		Numero2=in.nextDouble();
		if (Numero1>Numero2)
		{
		     System.out.println(Numero1 + " es mayor que " + Numero2);
		}
		else if (Numero1 == Numero2)
		{
			System.out.println("Estos numeros son iguales");
		}
		else
		{
			System.out.println(Numero2 + " es mayor que " + Numero1);
		}

	}

}
