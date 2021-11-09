package Guia;
/*
* Ej11:
* Escribe un programa que dada una hora determinada
* (horas y minutos), calcule los segundos que faltan
* para llegar a la medianoche.
*/

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        //Declaracion de variables
        int hora,minuto,segundosMedia,segundosTranscurridos;
        Scanner in = new Scanner(System.in);
        System.out.println("_______________________________");
        System.out.println("\tSegundos hasta media noche");
        System.out.println("-------------------------------");
        System.out.print("A continuación deberá introducir una hora del día, ");
        System.out.println("primero introducirá la hora y luego los minutos.");
        
        System.out.print("hora: ");
        hora = in.nextInt(); 
        
        System.out.print("minuto: ");
        minuto = in.nextInt();
    
        segundosTranscurridos = (hora * 3600) + (minuto * 60);
        segundosMedia = (24 * 3600) - segundosTranscurridos;
                
        System.out.printf("Desde las " +hora+":"+minuto+ " hasta la medianoche faltan " +segundosMedia+ " segundos");
    }//Fin del metodo main ()
}//Fin de la clase