package seleccion;

import java.util.Scanner;

/*
 *  Ej1: Determina si una persona es
 *  mayor de edad (edad > 18)
 */
public class MayorEdad {

	public static void main(String[] args) {
		// definicion de variables
		String nombre;
		int edad;
		Scanner in = new Scanner(System.in);
		//ingresa los datos
		System.out.println("\tMayor de Edad");
		System.out.println("----------------------------");
		System.out.print("Ingresa Nombre:");
		nombre=in.nextLine();
		System.out.print("Ingresa Edad: ");
		edad=in.nextInt();
		//determina si es mayor de edad
		if(edad >= 18)
		{
		System.out.print(nombre +" tienes " +edad+
				" y aï¿½os eres mayor de edad");	
		}
		else //false o 0
		{
			System.out.println(nombre+"tienes"+edad+
			"años, eres menor de edad");
		}
	}

}
