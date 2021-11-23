package EjercicioRepeticion;

import java.util.Scanner;

/*
Ej 20: Igual que el ejercicio anterior pero esta vez se debe pintar una pirámide hueca.
*/
public class Ejercicio20 {
    public static void main(String[] args) {
        //Declracion de variables
        int alturaintroducida,altura=1,i=1,espacios,espaciosdelante;
        String relleno;
        Scanner in = new Scanner(System.in);
        System.out.println("-------------------------------------");
        System.out.println("\tPiramide hueca");
        System.out.println("-------------------------------------");
        System.out.print("INtroduce la altura de la pirámide: ");
        alturaintroducida = in.nextInt();
        System.out.print("Introduce el relleno de la piramide: ");
        relleno = in.next();
        altura = 1;
        i = 0;
        espaciosdelante = alturaintroducida - 1;
        espacios = 0;
        while (altura < alturaintroducida) {
            for (i = 1; i <= espaciosdelante; i++) {
                System.out.print(" ");
            }
            System.out.print(relleno);
            for (i = 1; i < espacios; i++) {
                System.out.print(" ");
            }
            if (altura > 1) {
                System.out.print(relleno);
            }
            System.out.println();
            altura++;
            espaciosdelante--;
            espacios += 2;
        }
        for (i = 1; i < altura * 2; i++) {
            System.out.print(relleno);
        }
    }// Fin del metodo main ()
}// Fin de la clase