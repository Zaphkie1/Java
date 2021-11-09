package Evaluacion;
/*
Determinar en qué estado está el agua en función de su temperatura. Si es
negativa o cero el estado será sólido, si es menor que 100 será líquido y si
es mayor o igual que 100 será gaseosa. Pedir al usuario el valor de la
temperatura.
*/
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        //Declaracion de variables
        Scanner in = new Scanner(System.in);
		int temperatura;
        System.out.println("_______________________________");
		System.out.println("\tEstado de Fusion");
		System.out.println("-------------------------------");
		System.out.print("ingresa la temperatura del agua:");
		temperatura=in.nextInt();
        if(temperatura<= 0)
        {
            System.out.println("--------------------------------------");
            System.out.println("El agua esta en estado solido");
        }
        else if(temperatura > 0 && temperatura < 100)
        {
            System.out.println("--------------------------------------");
            System.out.println("El agua esta en estado liquido");
        }
    
        else if(temperatura > 99)
        {
            System.out.println("--------------------------------------");
            System.out.println("El agua esta en estado gaseoso");
        }
	}//Fin del metodo main ()
}//Fin de la clase