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
        // Declaracion de variables
        int numeroa, numero;
        Scanner in = new Scanner(System.in);
        System.out.println("\t Adivina un numero");
        System.out.println("-------------------------------------");
        System.out.print("Ingresa un numero: ");
        numeroa = in.nextInt();
        do {
            System.out.println("----------------------------------");
            System.out.print("ingresa tu numero: ");
            numero = in.nextInt();
            if (numeroa > numero) {
                System.out.print("El número que intentas adivinar es mayor que el introducido \n");
            } else if (numeroa < numero) {
                System.out.print("El número que intentas adivinar es menor que el introducido \n");
            }
        } while (numeroa != numero);
        System.out.println("Felicidades encontraste el numero correcto: " + numeroa);
    } // fin del metodo main
}// fin de la clase