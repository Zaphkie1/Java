package repeticion;

import java.util.Scanner;

/*
Ej11: Relealizar un juego para adivinar un numero.
para ello pedir un numero N y luago ir pidiendo
numeros indicando con respecto N. El proceso termina
cuando el ususario acierta
*/
public class AciertaNumero {
    public static void main(String[] args) {
        //Declaracion de variables
        int numeroa, numero;
        Scanner in = new Scanner(System.in);
        System.out.println("_______________________________");
        System.out.println("\tNumero aleatorio");
        System.out.println("-------------------------------");
        System.out.print("ingresa el numero que deseas adivinar: ");
        numeroa = in .nextInt();
        System.out.println("ingresa un numero: ");
        numero = in .nextInt();
        if (numero > numeroa); {
        System.out.println("El numero a adivinar es mas pequeño ingresa otro nuemro");
        }
         if (numero < numeroa); {
                System.out.println("el numero a adivinar es mas grande ingresa otro numero");

        }
    }
}