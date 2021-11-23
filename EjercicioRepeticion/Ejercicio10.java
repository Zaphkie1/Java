package EjercicioRepeticion;

import java.util.Scanner;

/*
Ej 10: Escribe un programa que calcule la media de un conjunto de números positivos introducidos
por teclado. A priori, el programa no sabe cuántos números se introducirán. El usuario
indicará que ha terminado de introducir los datos cuando meta un número negativo.
*/
public class Ejercicio10 {
    public static void main(String[] args) {
        double numeros = 0;
        double numeroingresado = 0;
        double suma = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("------------------------------------------------------------");
        System.out.println("\tMedia de numeros enteros");
        System.out.println("\tPara finalizar ingresa un numero negtivo");
        System.out.println("------------------------------------------------------------");
        while (numeroingresado >= 0) {
            System.out.print("Ingresa un numero: ");
            numeroingresado = in.nextInt();
            numeros++;
            suma += numeroingresado;
        }
        System.out.println("La media de los números positivos introducidos es " + (suma - numeroingresado) / (numeros - 1));
    }// Fin del metodo main ()
}// Fin de la clase