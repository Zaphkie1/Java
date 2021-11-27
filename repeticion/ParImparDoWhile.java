package repeticion;

import java.util.Scanner;

/*
Ej15: Determina si un numero ingresaro
es numero par o numero impar, obtener la sumatoria
de los numeros son pares y cuantos impares, terminar interaccion
cuando se ingrese un 0, mediante el uso de la
sentencia do-while
*/
public class ParImparDoWhile {
    public static void main(String[] args) {
        // declaracion de variables
        Scanner in = new Scanner(System.in);
        int numero, sPares = 0, sImpares = 0;
        int npar = 0, nimpar = 0;
        System.out.print("\tSumatoria de Numeros Pares e Impares\n");
        System.out.print("------------------------------------------------\n");
        do {
            System.out.print("Ingresa un valor: ");
            numero = in.nextInt();
            if (numero % 2 == 0) {
                sPares += numero;// sumatoria de los pares
                npar++; // cuenta los pares
            } else {
                sImpares += numero;
                nimpar++;
            }
        } while (numero != 0); // condicion
        System.out.println("-----------------------------------");
        System.out.println("La sumatoria de " + (npar - 1) + " numeros" + " pares es " + sPares);
        System.out.println("La sumatoria de " + nimpar + " numeros" + " impares es " + sImpares);
    }// fin del metodo main()
}// fin de la clase