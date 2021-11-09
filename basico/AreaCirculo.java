package basico;
import java.util.Scanner;
/*
* Ej 16: Calcula el area de un circulo mediante
* la formula PI * radio * radio
*/

public class AreaCirculo {

	public static void main(String[] args) {
		// declaracion de variable
		
		double radio, resultado;
		Scanner obj=new Scanner(System.in);
		System.out.println("Ingresa el radio del circulo");
		radio=obj.nextDouble();
		resultado=(radio*radio)*3.1415;
		System.out.println("el area del circulo con radio "+radio+" es "+resultado);
	}

}
