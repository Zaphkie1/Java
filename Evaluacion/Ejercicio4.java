package Evaluacion;
/*
Mediante el uso de la sentencia switch ingresar una nota en formato
numérico entera entre 0 y 10, y mostrar dicha nota de la forma: Cero, Uno,
Dos, Tres..., según sea el caso.
*/

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        //Declaracion de variables
        int numero;
		Scanner in = new Scanner(System.in);
		System.out.println("_______________________________");
		System.out.println("\tNumeros");
		System.out.println("-------------------------------");
		System.out.print("Ingresa un numero (0 - 10): ");
		numero=in.nextInt();
        switch(numero)
        {
            case 0:
            {
                System.out.println("Cero");
            }
            break;
            case 1:
            {
                System.out.println("Uno");
            }
            break;
            case 2:
            {
                System.out.println("Dos");
            }
            break;
            case 3:
            {
                System.out.println("Tres");
            }
            break;
            case 4:
            {
                System.out.println("Cuatro");
            }
            break;
            case 5:
            {
                System.out.println("Cinco");
            }
            break;
            case 6:
            {
                System.out.println("Seis");
            }
            break;
            case 7:
            {
                System.out.println("Siete");
            }
            break;
            case 8:
            {
                System.out.println("Ocho");
            }
            break;
            case 9:
            {
                System.out.println("Nueve");
            }
            break;
            case 10:
            {
                System.out.println("Diez");
            }
            break;
            default:
            System.out.println("Ingresa un numero valido !!!");
        }//Fin del switch
    }//Fin dle metodo main
}//Fin de la clase