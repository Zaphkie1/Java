package seleccion;

import java.util.Scanner;
/*
 *  Ej2: Determinar si un estudiante aprobo un 
 *  examen para que esto se cumpla calificacion
 *  debe ser 70
 */
public class aprovado {

	public static void main(String[] args) {
		// definicion de variables
		String nombre;
		int calificacion;
		Scanner in = new Scanner(System.in);
		//ingresa los datos
		System.out.println("\tResultado de examen");
		System.out.println("-------------------------------------");
		System.out.print("Ingresa tu Nombre:");
		nombre=in.nextLine();
		System.out.print("Ingresa tu calificacion obtenida en el examen: ");
		calificacion=in.nextInt();
		//determina si aprobo el examen
		if(calificacion >= 70)
		{
		System.out.print(nombre +" tu calificacion es de " +calificacion+
				" por lo tanto aprobaste el examen");	
		}
		if(calificacion < 70)
		{
		System.out.print(nombre +" tu calificacion es de " +calificacion+
					" por lo tanto reprobaste el examen");	
		}

	}

}
