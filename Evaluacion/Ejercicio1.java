package Evaluacion;
/*
Ej 1: Ingresar dos números y mostrarlos ordenados de mayor a menor.
*/
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        //Declaracion de variales
        Scanner in = new Scanner(System.in);
        int a;
        int b;
        System.out.print("ingrese el primer numero : ");
        a=in.nextInt();
        System.out.print("ingrese el sugundo numero : ");
        b=in.nextInt();
        if(a>b)
        {
            System.out.print("el orden correcto es : "+a+"->"+b);
        }
        else
            System.out.print("el orden de mayor a menor es : "+b+" -> "+a);
    }
}