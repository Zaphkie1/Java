package basico;

import java.util.Scanner;
/*
 * Ej9: Muestra el uso de la entrada de datos
 * mediante la clase Scanner
 */
public class EntradaDatos {

	public static void main(String[] args) {
		// declaracion de variables
		Scanner in = new Scanner(System.in); //ingreso de datos
		String nombre;
		int edad;
		System.out.println("Ingresa Nombre: ");
		nombre=in.nextLine();
		System.out.println("Ingresas Edad: ");
		edad=in.nextInt();
		System.out.println("Tu nombre es: "+nombre+
				" y tienes "+edad+" años ");
		
	}

}
