package basico;

import java.util.Scanner;

/*
*  Ej.22: Imprime tempratura en gradosC y gradosF
*  en formato de tabla
*/

public class Temperatura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
	    double centigrados,fahrenheit;
	    System.out.println("Ingresa grados centigrados");
	    centigrados=sc.nextDouble();
	    fahrenheit= centigrados*9/5+32;
	    
		System.out.println("    _______________________________________________________________________________________");
		System.out.println("    |                                     GRADOS C a F                                     |");
		System.out.println("    ---------------------------------------------------------------------------------------");
		System.out.println("    |Grados Centigrados:                                     | "+centigrados+             "|");
		System.out.println("    ---------------------------------------------------------------------------------------");
		System.out.println("    |Grados fahrenheit:                                      | "+fahrenheit+              "|"  );
		System.out.println("    ---------------------------------------------------------------------------------------");

	}

}
