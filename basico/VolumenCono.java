package basico;

import java.util.Scanner;

/*
*   Ej.25: Escribe un programa que calcule el volumen de un cono
*   mediante la formula v=1/3*pi*radio*radio*altura
*/

public class VolumenCono {

	public static void main(String[] args) {
		// Declaracion de variables

		Scanner in = new Scanner (System.in);
        double radio,altura,volumen;
		System.out.println("Ingresa el radio del cono: ");
		radio=in.nextDouble();
		System.out.println("Ingresa la altura del cono: ");
		altura=in.nextDouble();
		volumen=( Math.PI * Math.pow(radio, 2) * altura )/3;
		System.out.printf("El volumen del cono es: %.2f\n",volumen);

	}

}
