package basico;

import java.util.Scanner;

/*
 * Ej 12: Realizar un programa para convertir pesos-dolar, euro,
 * yen, libra, franco, colombia define las variables necesarias
 * para que imprima el resultado en formato de tabla
 * Dollar = 19.88, Euro = 23.44, Yen = 0.18, Libra = 27.47
 * Franco = 21.56, Pesos_col = 193
 *                        DIVISAS
 * ____________________________________________________________
 * Pesos_Mx | Dollar | Euro | Yen | Libra | Franco | Peso_col
 * ------------------------------------------------------------
 *     2       ???     ???    ???    ???     ???        ???
 */
public class Divisas {

	public static void main(String[] args) {
		// Declaracion de variables
		int pesos;
		double dollar=19.88;
		double euro=23.44;
		double yen=0.18;
		double libra=27.47;
		double franco=21.56;
		double peso_col=193;
		double result;
	Scanner in = new Scanner(System.in);
	System.out.println("pesos a convertir: ");
	pesos=in.nextInt();
	//Se realiza la conversion
	System.out.println("    _______________________________________________________________________________________");
	System.out.println("    |                                     DIVISAS                                         |");
	System.out.println("    ---------------------------------------------------------------------------------------");
	System.out.println("    |Pesos Mexicanos:                                        | "+pesos);
	System.out.println("    ---------------------------------------------------------------------------------------");
	System.out.println("    |Dolares:                                                | "+pesos/dollar                 );
	System.out.println("    ---------------------------------------------------------------------------------------");
	System.out.println("    |Euros:                                                  | "+pesos/euro                    );
	System.out.println("    ---------------------------------------------------------------------------------------");
	System.out.println("    |Yenes:                                                  | "+pesos/yen );
	System.out.println("    ---------------------------------------------------------------------------------------");
	System.out.println("    |Libras:                                                 | "+pesos/libra );
	System.out.println("    ---------------------------------------------------------------------------------------");
	System.out.println("    |Francos:                                                | "+pesos/franco );
	System.out.println("    ---------------------------------------------------------------------------------------");
	System.out.println("    |Pesos Colombianos:                                      | "+pesos/peso_col );
	System.out.println("    ---------------------------------------------------------------------------------------");
	}
}