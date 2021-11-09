package Guia;
import java.util.Scanner;
/*
* Ej6:
* Realiza un programa que calcule el tiempo que tardará
* en caer un objeto desde una altura h. Aplica la fórmula
* t =√2h g siendo g = 9:81m/s2
*/
public class Ejercicio6 {
    public static void main(String[] args) {
        //Declaracion de variables
        double h,s,g=9.81;
        Scanner in = new Scanner(System.in);
        System.out.println("_______________________________");
		System.out.println("\tTiempo de caida");
		System.out.println("-------------------------------");        
        System.out.print("Introduzca la altura (en metros) desde la que cae el objeto: ");
        h = in.nextDouble();
        s = Math.sqrt(2*h/g);
        System.out.printf("El objeto tarda "+s+" segundos en caer.\n");
    }//Fin del metodo main ()
}//Fin de la clase