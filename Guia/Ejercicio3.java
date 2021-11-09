package Guia;
import java.util.Scanner;
/*
* Ej3:
* Escribe un programa en que dado un número del 1 a 7 
* escriba el correspondiente nombre del día de la semana.
*/
public class Ejercicio3 {
    public static void main(String[] args) {
        //Declaracion de variables
        int Dia;
		Scanner in = new Scanner(System.in);
		System.out.println("_______________________________");
		System.out.println("\tDia de la semana");
		System.out.println("-------------------------------");
		System.out.print("Ingresa el numero de un dia: ");
		Dia=in.nextInt();
        switch(Dia)
        {
            case 1:
            {
                System.out.println("Es lunes !!!");
            }
            break;
            case 2:
            {
                System.out.println("Es martes !!!");
            }
            break;
            case 3:
            {
                System.out.println("Es miercoles !!!");
            }
            break;
            case 4:
            {
                System.out.println("Es jueves !!!");
            }
            break;
            case 5:
            {
                System.out.println("Es viernes !!!");
            }
            break;
            case 6:
            {
                System.out.println("Es sabado !!!");
            }
            break;
            case 7:
            {
                System.out.println("Es domingo !!!");
            }
            break;
            default:
            System.out.println("Ingresa un numero valido !!!");
        }//Fin del switch
    }//Fin dle metodo main
}//Fin de la clase