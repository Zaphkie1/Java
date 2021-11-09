package basico;

import java.util.Scanner;

/*
* Ej 11: Realiza operaciones basicas
* +, -, %, / solicitando datos desde el teclado
* mediante el uso de la clase Scanner
*/
public class Operaciones2 {

	public static void main(String[] args) {
		// Declaracion de variables
		int x,y,result;
		Scanner in = new Scanner(System.in);
		System.out.println("Ingresa el primer valor: ");
		x=in.nextInt();
		System.out.println("Ingresa el segundo valor: ");
		y=in.nextInt();
		//realizamos la suma
		result=(x+y);
		System.out.println("Suma de "+x+" + "+y+" = "+result);
		//realizamos la resta
		result=(x-y);
		System.out.println("Resta de "+x+" - "+y+" = "+result);
		//realizamos la multiplicacion
		result=(x*y);
		System.out.println("Multiplicacion de "+x+" * "+y+" = "+result);
		//realizamos la division
		double result2=((double)x/(double)y);//casting
		System.out.println("Division de "+x+" / "+y+" = "+result2);

	}

}
