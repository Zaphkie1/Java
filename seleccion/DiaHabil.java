package seleccion;
/*
* Ej11: Determina si un dia de la semana es habil  inhabil
* del 1 al 5 habil 6 y 7 dia inhabil
*/

import java.util.Scanner;

public class DiaHabil {

	public static void main(String[] args) {
		// Declaracion de variables
		double Dia;
		Scanner in = new Scanner(System.in);
		System.out.println("_______________________________");
		System.out.println("Dia Habil o inhabil");
		System.out.println("-------------------------------");
		System.out.print("ingresa el numero del dia de la semana: ");
		Dia=in.nextDouble();
		if(Dia >= 1 && Dia <= 5)
		{
			System.out.print("El dia " +Dia+ " Es Habil");
		}
		else if(Dia >= 6 && Dia <= 7)
		{
			System.out.print("El dia " +Dia+ " Es Inhabil");
		}
		else
		{
			System.out.print("Error: ingrese un Dia valido");
		}

	}

}