package EjercicioRepeticion;

import java.util.Scanner;

/*
Ej 21: Realiza un programa que vaya pidiendo números hasta que se introduzca un número
negativo y nos diga cuantos números se han introducido, la media de los impares y el mayor
de los pares. El número negativo sólo se utiliza para indicar el final de la introducción de
datos pero no se incluye en el cómputo.
*/
public class Ejercicio21 {
    public static void main(String[] args) {
        //Declaracion de variables
        int numeroIntroducido;
        int numeroDeElementos = 0;
        int sumaImpares = 0;
        int numeroDeElementosImpares = 0;
        int maximoPar = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("-------------------------------------");
        System.out.println("Media de impares y mayor de pares");
        System.out.println("-------------------------------------");
        System.out.println("Instrucciones: Introduce numeros enteros, Para terminar ingresa un numero negativo ");
        System.out.println("-------------------------------------");
        do {
            System.out.println("Introduce un numero: ");
            numeroIntroducido = in.nextInt();

            if (numeroIntroducido >= 0) {
                numeroDeElementos++;
                if ((numeroIntroducido % 2) == 1) { // número impar
                    sumaImpares += numeroIntroducido;
                    numeroDeElementosImpares++;
                } else {
                    if (numeroIntroducido > maximoPar)
                        maximoPar = numeroIntroducido;
                }
            }
        } while (numeroIntroducido >= 0);

        System.out.println("Ha introducido " + numeroDeElementos + " números");
        System.out.println("La media de los impares es " + sumaImpares / numeroDeElementosImpares);
        System.out.println("El máximo de los pares es " + maximoPar);
    }// Fin del metodo main ()
}// Fin de la clase