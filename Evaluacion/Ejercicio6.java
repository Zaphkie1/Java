package Evaluacion;

import java.util.Scanner;

/*
Ej 6: En el súper de la esquina están haciendo un descuento del 3% a todos los
productos que tengan un valor mayor de $30.00 y menor que $100, y un
descuento de 8% si tiene un costo de $100 en adelante. Realizar un
programa que permita leer el nombre y valor del producto, determinar si tiene
el descuento e imprimir el producto y precio final.
*/
public class Ejercicio6 {
    public static void main(String[] args) {
        // Declaracion de variables
        Scanner in = new Scanner(System.in);
        String articulo;
        double costo, descuento, descuento2;
        System.out.println("_______________________________");
        System.out.println("\tProducto con descuento");
        System.out.println("-------------------------------");
        System.out.println("ingresa el nombre del articulo:");
        articulo = in.nextLine();
        System.out.println("ingresa el precio del producto:");
        costo = in.nextDouble();
        if (costo >= 30 && costo < 100) {
            System.out.println("--------------------------------------");
            System.out.println("Producto: " + articulo);
            System.out.println("Precio original: " + costo);
            descuento = (costo - costo * 0.03);
            descuento2 = (costo * 0.03);
            System.out.println("Descuento del producto: " + descuento2);
            System.out.printf("Producto con descuento:%.2f \n", descuento);
            System.out.println("--------------------------------------");
        } else if (costo >= 100) {
            System.out.println("--------------------------------------");
            System.out.println("Producto: " + articulo);
            System.out.println("Precio original: " + costo);
            descuento = (costo - costo * 0.08);
            descuento2 = (costo * 0.08);
            System.out.println("Descuento del producto: " + descuento2);
            System.out.printf("Producto con descuento:%.2f \n", descuento);
            System.out.println("--------------------------------------");
        }
    }// Fin del metodo main ()
}// Fin de la clase