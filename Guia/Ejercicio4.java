package Guia;
import java.util.Scanner;
/*
* Ej4:
* Vamos a ampliar uno de los ejercicios de la relación anterior para considerar las horas
* extras. Escribe un programa que calcule el salario semanal de un trabajador teniendo en
* cuenta que las horas ordinarias (40 primeras horas de trabajo) se pagan a 12 euros la hora.
* A partir de la hora 41, se pagan a 16 euros la hora.
*/
public class Ejercicio4 {
    public static void main(String[] args) {
        //Declaracion de variables
        int sueldos,horast;
		Scanner in = new Scanner(System.in);
        System.out.println("_______________________________");
		System.out.println("\tSueldo semanal");
		System.out.println("-------------------------------");
        System.out.print("Introduce el número de horas trabajadas durante la semana: ");
        horast = in.nextInt();
        if (horast <= 40) 
        {
          sueldos = 12 * horast;
        } 
        else 
        {
          sueldos = (40 * 12) + ((horast - 40) * 16);
        }
        System.out.println("El sueldo semanal que le corresponde es de " + sueldos + " euros");
    }//Fin del metodo main ()
}//Fin de la clase