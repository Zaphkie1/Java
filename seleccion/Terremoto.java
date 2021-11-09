package seleccion;
/*
* Ej5: Determina el nivel de estruccion
* mediante la magnitud de los grados ritcher
*/

import java.util.Scanner;

public class Terremoto {

	public static void main(String[] args) {
		// declaracion de variables
		double intensidad;
		Scanner in = new Scanner(System.in);
		System.out.println("_______________________________");
		System.out.println("Afectaciones del terremoto");
		System.out.println("-------------------------------");
		System.out.print("Ingresa intensidad del terremoto: ");
		intensidad=in.nextDouble();
		if(intensidad >= 8)
		{
			System.out.print("La mayoria de las estructuras"
					+ " de los edificios caen");
		}
		else if(intensidad >=7.0 )
		{
			System.out.print("Varios edificios destruidos");
		}
		else if(intensidad >=6.0)
		{
			System.out.print("Varios edificios dañados"
			+ "severamente, algunos colapsan");
		}
		else if(intensidad >=4.5)
		{
			System.out.print("Daños en edificios construidos"
			+ " deficientemente");
		}
		else
		{
			System.out.print("No hay destruccion de edificios");
		}


	}// fin del metodo main ()

}// fin de la clase
