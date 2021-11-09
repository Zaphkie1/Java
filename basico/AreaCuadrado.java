package basico;
import java.util.Scanner;
/*
* Ej 14: Calcula el area de un cuadrado mediante
* la formula lado*lado
*/

public class AreaCuadrado {

	public static void main(String[] args) {
		// Declaracion de variables
       
		double area;
        Scanner sc=new Scanner(System.in);
        System.out.println("ingrese el lado de cuadrado");
        double a=sc.nextDouble();         
        area=a*a;
        System.out.println("Area = " +area);

	}

}
