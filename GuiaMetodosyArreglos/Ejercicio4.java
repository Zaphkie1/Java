package GuiaMetodosyArreglos;

import java.util.Scanner;

/*
Ej4:Escribe un programa que piense un número al azar entre 0 y 100. El usuario debe
adivinarlo y tiene para ello 5 oportunidades. Después de cada intento fallido, el
programa dirá cuántas oportunidades quedan y si el número introducido es menor
o mayor que el número secreto.
*/
public class Ejercicio4 {
    public static void main(String[] args) {
        int intentos=5,numeroin,resultado;
        Scanner in=new Scanner(System.in);
        int num =((int)(Math.random()*100)+1);
        System.out.println("-------------------------------------");
        System.out.println("\tAdivina el numero !!!");
        System.out.println("-------------------------------------");
        System.out.println("Ingresa un numero");
        numeroin = in.nextInt();
    }
}