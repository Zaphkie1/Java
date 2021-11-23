package EjercicioRepeticion;

import java.util.Scanner;

/*
Ej 7: Realiza el control de acceso a una caja fuerte. La combinación será un número de 4 cifras.
El programa nos pedirá la combinación para abrirla. Si no acertamos, se nos mostrará el
mensaje “Lo siento, esa no es la combinación” y si acertamos se nos dirá “La caja fuerte se
ha abierto satisfactoriamente”. Tendremos cuatro oportunidades para abrir la caja fuerte.
*/
public class Ejercicio7 {
    public static void main(String[] args) {
        //Declaracion de variables
        int intentos = 4;
        int numeroingresado;
        boolean correcto = false;
		Scanner in = new Scanner(System.in);
        System.out.println("-------------------------------------");
        System.out.println("\tCaja fuerte");
        System.out.println("-------------------------------------");
        do {
            System.out.print("Introduzca la contraseña de la caja fuerte: ");
            numeroingresado= in.nextInt();
            if (numeroingresado == 1234) {
                correcto = true;
            } else {
                System.out.println("Lo siento, esa no es la combinación.");
            }
            intentos--;
        } while ((intentos > 0) && (!correcto));
        if (correcto) {
            System.out.println("La caja fuerte se ha abierto satisfactoriamente.");
        } else {
            System.out.println("Demasiados intentos fallidos.");
        }
    }//Fin del metodo main ()
}//Fin de la clase
