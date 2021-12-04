package GuiaMetodosyArreglos;

/*
Ej1:Escribe un programa que muestre la tirada de tres dados. Se debe mostrar también
la suma total (los puntos que suman entre los tres dados).
*/
public class Ejercicio1 {
    public static void main(String[] args) {
        // Declaracion de variables
        int dado1,dado2,dado3,resultado;
        System.out.println("-------------------------------------");
        System.out.println("\t\tDado");
        System.out.println("-------------------------------------");
        dado1 =((int)(Math.random()*6)+1);
        dado2 =((int)(Math.random()*6)+1);
        dado3 =((int)(Math.random()*6)+1);
        resultado=dado1+dado2+dado3;
        System.out.println("Dado 1 = "+dado1);
        System.out.println("Dado 2 = "+dado2);
        System.out.println("Dado 3 = "+dado3);
        System.out.println("Suma de los dados = "+resultado);
    }// Fin del whitch
}