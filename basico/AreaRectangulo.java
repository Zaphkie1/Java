package basico;
import java.util.Scanner;
/*
* Ej 15: Calcula el area de un rectangulo mediante
* la formula base*altura
*/

public class AreaRectangulo {

	public static void main(String[] args) {
		// Declaracion de variables
		double area;
        Scanner sc=new Scanner(System.in);
        System.out.println("ingrese ancho del rectangulo");
        double a=sc.nextDouble();  
        System.out.println("ingrese alto del rectangulo");
        double b=sc.nextDouble(); 
        area=a*b;
        System.out.println("El area del rectangulo es= " +area);

	}

}
