package EjercicioRepeticion;

import java.util.Scanner;

/*
Ej 15: Escribe un programa que dados dos números, uno real (base) y un entero positivo
(exponente), saque por pantalla todas las potencias con base el numero dado y exponentes
entre uno y el exponente introducido. No se deben utilizar funciones de exponenciación.
Por ejemplo, si introducimos el 2 y el 5, se deberán mostrar 21, 22, 23, 24 y 25.
*/
public class Ejercicio15 {
    public static void main(String[] args) {
        // Declaracion de variables
        double base, potencia;
        int exponente2, exponente;
        Scanner in = new Scanner(System.in);
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("\tPotencia entre numero real (Base) y numero entero(Exponente)");
        System.out.println("------------------------------------------------------------------------------------");
        System.out.print("Introduce un número real: ");
        base = in.nextDouble();
        System.out.print("Introduce un múmero entero: ");
        exponente2 = in.nextInt();
        for (int i = 1; i <= exponente2; i++) {
            potencia = 1;
            exponente = i;
            for (int j = 0; j < exponente; j++) {
                potencia *= base;
            }
            System.out.println(base + "^" + i + " = " + potencia);
        } // Fin de for
    }// Fin del metodo main ()
}// Fin de la clase