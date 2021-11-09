package basico;

import java.util.Scanner;

/*
*   Ej.24: Elabora un algoritmo que dado los datos:
*   radio y la altura de un cilindro, calcule e imprima el
*   areaa y su volumen.
*   El volumen de un cilindro se calcula aplicando la
*   siguiente formula: volumen=pi*radio*radio*altura
*   La superficie del cilindro la calculamos como:
*   area=2*pi*radio*altura
*/

public class Cilindro {

	public static void main(String[] args) {
		// Declaracion de variables

		Scanner in = new Scanner (System.in);
        double radio,altura,area,volumen;
        System.out.println("Ingresa el radio del cilindro: ");
		radio=in.nextDouble();
        System.out.println("Ingresa la altura del cilindro: ");
		altura=in.nextDouble();
        volumen= Math.PI*radio*radio*altura;
        area= 2*Math.PI*radio*altura;
		System.out.printf("El volumen del cilindro es: %.2f\n",volumen);
		System.out.printf("El area del cilindro es: %.2f\n",area);

	}

}
