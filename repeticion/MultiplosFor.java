package repeticion;

import java.util.Scanner;

/*
Ej26: Ingresar 5 numeros eh indicar si alguno es multiplo de 3
o multiplo de 5, mostrar los 5 numeros
*/
public class MultiplosFor {
    public static void main(String[] args) {
        // Declaracion de variables
        Scanner in = new Scanner(System.in);
        int n = 0;
        String datos = "";
        for (int x = 1; x <= 5; x++) {
            System.out.print("Introduce un numero: ");
            n = in.nextInt();
            if (n % 5 == 0) {
                System.out.println("El numero " + n + " es multilo de 5");
            } if (n % 3 == 0) {
                System.out.println("El numero " + n + " es multiplo de 3");
            }
            datos += n + "\t";
        }
        System.out.println("\tMultilos de 3 y 5");
        System.out.println("------------------------------------");
        System.out.print("Nnmeros ingresados \n");
        System.out.print(datos);
       }
    }
