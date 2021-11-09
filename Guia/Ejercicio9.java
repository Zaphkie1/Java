package Guia;

import java.util.Scanner;

/*
* Ej9:
* Realiza un programa que resuelva una ecuación de segundo 
* grado (del tipo ax2 + bx + c = 0).
*/
public class Ejercicio9 {
    public static void main(String[] args) {
        //Declaracion de variables
        int a ,b, c, d, e, f, g, h, j, l, m, n;
		double k;
		double i;
		Scanner in = new Scanner(System.in);
		System.out.println("_______________________________");
		System.out.println("\tEcuacion de segundo grado");
		System.out.println("-------------------------------");
		System.out.print("Escribe la primera incógnita(a): ");
		a = in.nextInt();
		System.out.print("Escribe la segunda incógnita(b): ");
		b = in.nextInt();
		System.out.print("Escribe la primera incógnita(c): ");
		c = in.nextInt();
		d = -b;
		e = b * b;
		f = -4 * a * c;
		g = 2 * a;
		h = e - f;
		i = Math.sqrt(h);
		j = (int) ((d + i) / g);
		k = (d - i) / g;
		if(j > k){
			System.out.println("El resultado mayor es: "+j+" El número menor es: "+k);
		}
		else if(j < k)
        {
			System.out.println("El resultado mayor es: "+k+" El número menor es: "+j);
		}
    }//Fin del metodo main ()
}//Fin de la clase