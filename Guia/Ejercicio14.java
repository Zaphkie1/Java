package Guia;
/*
* Ej14:
* Realiza un programa que diga si un número introducido por teclado es par 
* y/o divisible entre 5.
*/
public class Ejercicio14 {
    public static void main(String[] args) {
        //Declaracion de variables
        System.out.print("Introduzca un número entero: ");
        int n = Integer.parseInt(System.console().readLine());
    
        if ((n % 2) == 0) 
        {
          System.out.print("El número introducido es par");
        } 
        else 
        {
          System.out.print("El número introducido es impar");
        }
    
        if ((n % 5) == 0) 
        {
          System.out.println(" y divisible entre 5.");
        } 
        else 
        {
          System.out.println(" y no es divisible entre 5.");
        }
    }//Fin del metodo main ()
}//Fin de la clase