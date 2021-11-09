package seleccion;

import java.util.Scanner;

/*
* Ej15: Determina el dia de la semana ingresand
* un valor entero segun corresponda(1-7)mediante el uso de la
* sentencia switch
*/
public class DiaSemana2 {

	public static void main(String[] args) {
		// declaracion de variables
		int Dia;
		Scanner in = new Scanner(System.in);
		System.out.println("_______________________________");
		System.out.println("Dia de la semana");
		System.out.println("-------------------------------");
		System.out.print("ingresa el numero del dia de la semana: ");
		Dia = in.nextInt();
		switch (Dia) {
		case 7: {
			System.out.println("Es domingo");
		}
			break;
		case 6: {
			System.out.println("Es sabado");
		}
			break;
		case 5: {
			System.out.println("Es viernes");
		}
			break;
		case 4: {
			System.out.println("Es jueves");
		}
			break;
		case 3: {
			System.out.println("Es miercoles");
		}
			break;
		case 2: {
			System.out.println("Es martes");
		}
			break;
		case 1: {
			System.out.println("Es lunes");
		}
			break;
		default:
			System.out.println("Ingrese un numero valido.");
		}// fin de switch
	}// fin de main()
}// fin de clase