package Metodos;

import java.util.Scanner;

/*
Ej4: Realiza operciones de suma,resta,mult y div
mediante el usode metodos y paso de parametros
*/
public class Operaciones {
    public static void main(String[] args) {
        ingresaDatos();// Llamado del metodo
    }

    private static void ingresaDatos() {
        int num1, num2, s, r, m;
        double d;
        Scanner in = new Scanner(System.in);
        System.out.println("-------------------------------------");
        System.out.println("\tOperaciones");
        System.out.println("-------------------------------------");
        System.out.print("Ingresa num 1:");
        num1 = in.nextInt();
        System.out.print("Ingresa num 2:");
        num2 = in.nextInt();
        s = suma(num1, num2);
        r = resta(s, num1);
        m = mult(s, r);
        d = div(m, s);
        System.out.println("Suma : " + s);
        System.out.println("Resta : " + r);
        System.out.println("Multipicacion : " + m);
        System.out.println("Divicion : " + d);
    }

    private static double div(int x, int y) {
        return ((double) x / (double) y);
    }

    private static int mult(int x, int y) {
        return (x * y);
    }

    private static int resta(int x, int y) {
        return (x - y);
    }

    private static int suma(int x, int y) {
        return (x + y);
    }
}
