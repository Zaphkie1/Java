package seleccion;
/*
 *  Ej.7: Muestra la clasificacion de los huracanes:
 *  Categoria 1: vientos entre 120 a 150 kilometros por hora.
 *  Categoria 2: vientos entre 151 a 180 kilometros por hora.
 *  Categoria 3: vientos entre 181 a 210 kilometros por hora.
 *  Categoria 4: Vientos entre 211 a 250 Kilometros por hora.
 */

import java.util.Scanner;

public class Huracan {

	public static void main(String[] args) {
		// Declaracion de variables
		double velocidad;
		Scanner in = new Scanner(System.in);
		System.out.println("_______________________________");
		System.out.println("clasificacion de huracanes");
		System.out.println("-------------------------------");
		System.out.print("Ingresa a que velocidad va el huracan: ");
		velocidad=in.nextDouble();
		if(velocidad >=211 && velocidad <=250)
		{
			System.out.print("El huracan es de categoria 4");
		}
		else if(velocidad >=181 && velocidad <=210)
		{
			System.out.print("El huracan es de categoria 3");
		}
		else if(velocidad >=151 && velocidad <=180)
		{
			System.out.print("El huracan es de categoria 2");
		}
		else if(velocidad >=120 && velocidad <=150)
		{
			System.out.print("El huracan es de categoria 1");
		}
		else
		{
			System.out.print("Error ingrese un valor valido");
		}

	}

}
