package basico;
import java.util.Scanner;
/*
* Ej 17: Calcula el area de un triangulo mediante
* la formula base*altura / 2
*/

public class AreaTriangulo {

	public static void main(String[] args) {
		// Declaracion de variables
		
		Scanner sc = new Scanner(System.in);
        double b,h;
        System.out.println("Ingresa la base del triangulo:");
        b=sc.nextDouble();
        System.out.println("Ingresa la altura del triangulo:");
        h=sc.nextDouble();
        double area;
        area=b*h/2;
       System.out.print(area);

	}

}
