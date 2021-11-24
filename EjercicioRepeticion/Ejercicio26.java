package EjercicioRepeticion;

import java.util.Scanner;

/*
Ej 26: Realiza un programa que pida primero un número y a continuación un dígito. El programa
nos debe dar la posición (o posiciones) contando de izquierda a derecha que ocupa ese
dígito en el número introducido
*/
public class Ejercicio26 {
    public static void main(String[] args) {
        // Declaracion de variables
        int numero, numero2;
        int numerovolt = 0;
        int longitud = 0;
        int posicion = 1;
        int numeroingresado;
        Scanner in = new Scanner(System.in);
        System.out.println("-------------------------------------");
        System.out.println("\tNumero y digito");
        System.out.println("-------------------------------------");
        System.out.print("Introduce un número: ");
        numeroingresado = in.nextInt();
        System.out.print("Introduce un dígito: ");
        numero2 = in.nextInt();
        System.out.print("De izquierda a derecha, el numero " + numero2 + " esta adentro de " + numeroingresado
                + " en las siguientes posiciones: ");
        numero = numeroingresado;
        if (numero == 0) {
            longitud = 1;
        }
        while (numero > 0) {
            numerovolt = (numerovolt * 10) + (numero % 10);
            numero /= 10;
            longitud++;
        }
        while (numerovolt > 0) {
            if ((numerovolt % 10) == numero2) {
                System.out.print(posicion + " ");
            }
            numerovolt /= 10;
            posicion++;
        }
        System.out.println();
    }// Fin del metodo main ()
}// Fin de la clase