package seleccion;

import java.util.Scanner;

/*
 * Ej3: Determina si persona es mayor de edad
 * si edad = 18 años
 */
public class Edad {

	public static void main(String[] args) {
		// declaracion de variables
		String nombre;
		int edad;
		Scanner in = new Scanner(System.in);
		// Ingresa datos
		System.out.println("\tDetermina Edad");
		System.out.println("---------------------");
		System.out.print("Ingresa nombre:");
		nombre=in.nextLine();
		System.out.print("Ingresa edad:");
		edad=in.nextInt();
		if(edad >= 18) //true o 1
		{
			System.out.print(nombre+" tienes " +edad+
					" años, eres mayor de edad");	
		}
		else // false o 0
		{
			System.out.print(nombre+" tienes " +edad+
					" años, eres menor de edad");
		}

	}

}
