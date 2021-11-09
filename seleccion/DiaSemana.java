package seleccion;
/*
* Ej8: Determina que dia de la semana corresponde
* segun el valor indicado. Por ejemplo lines = 1
* hasta dominago =7
*/

import java.util.Scanner;

public class DiaSemana {

	public static void main(String[] args) {
		// Declaracion de variables
		double Dia;
		Scanner in = new Scanner(System.in);
		System.out.println("_______________________________");
		System.out.println("Dia de la semana");
		System.out.println("-------------------------------");
		System.out.print("ingresa el numero del dia de la semana: ");
		Dia=in.nextDouble();
		if(Dia == 1)
		{
			System.out.print("El dia " +Dia+ " Es lunes");
		}
		else if(Dia == 2)
		{
			System.out.print("El dia " +Dia+ " Es Martes");
		}
		else if(Dia == 3)
		{
			System.out.print("El dia " +Dia+ " Es Miercoles");
		}
		else if(Dia == 4)
		{
			System.out.print("El dia " +Dia+ " Es Jueves");
		}
		else if(Dia == 5)
		{
			System.out.print("El dia " +Dia+ " Es Viernes");
		}
		else if(Dia == 6)
		{
			System.out.print("El dia " +Dia+ " Es Sabado");
		}
		else if(Dia == 7)
		{
			System.out.print("El dia " +Dia+ " Es Domingo");
		}
		else
		{
			System.out.print("Error ingrese un valor valido");
		}

	}

}
