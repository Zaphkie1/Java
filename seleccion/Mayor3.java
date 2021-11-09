package seleccion;

import java.util.Scanner;

public class Mayor3 {

	public static void main(String[] args) {
		// Declaracion de variables
        Scanner in = new Scanner(System.in);
        double Numero1;
		double Numero2;
		double Numero3;
		System.out.println("_______________________________________");
		System.out.println("\tNumero mayor de 3 numeros");
		System.out.println("---------------------------------------");
		System.out.print("Introduzca primer numero: ");
        Numero1=in.nextDouble();
        System.out.print("Introduzca segundo numero: ");
        Numero2=in.nextDouble();;
        System.out.print("Introduzca tercer numero: ");
        Numero3=in.nextDouble();
        if (Numero1 > Numero2 && Numero1 > Numero3) 
        {
               System.out.println("El numero mayor es: " + Numero1);                                             
        } 
        else if (Numero2 > Numero1 && Numero2 > Numero3) 
        {
            System.out.println("el numero mayor es: " + Numero2);
        } 
		else if (Numero3 > Numero1 && Numero3 > Numero2) 
		{
			System.out.println("el numero mayor es: " + Numero3);
		}
        else 
        {
            System.out.println("Estos numeros son iguales");
        }
    }
    
	}

