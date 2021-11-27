package repeticion;

import java.util.Scanner;

/*
Ej26: Escribe un programa que diga multiplos de 3 y de 5
usando el metodo for
*/
public class MultiplosFor2 {
    public static void main(String[] args) {
        // Declaracion de variables
        Scanner in = new Scanner(System.in);
        int n = 0, tres = 0, cinco = 0;
        String datos = "";
        String multres = "";
        String mulcinco = "";
        System.out.print("\tMultiplos de 3 y 5\n");
        System.out.print("--------------------------------------\n");
        for (int i = 1; i <= 5; i++) {
            System.out.print("Ingrese numero " + i + ": ");
            n = in.nextInt();
            if (n % 5 == 0) {
                mulcinco += n + "\t";
                cinco++;
            }
            if (n % 3 == 0) {
                multres += n + "\t";
                tres++;
            }
            datos += n + "\t";
        }
        System.out.print("-----------------------------------\n");
        System.out.print("Numeros ingresados\n");
        System.out.println(datos);
        if (cinco > 0) {
            System.out.print("-----------------------------------\n");
            System.out.print("Numeros multiplos de cinco\n");
            System.out.println(mulcinco);
        }
        if (tres > 0) {
            System.out.print("-----------------------------------\n");
            System.out.print("Numeros multiplos de tres\n");
            System.out.println(multres);
        }
    }//Fin del metodo main ()
}//Fin de la clase
