package Guia;
import java.util.Scanner;
/*
* Ej1:
*  Escribe un programa que pida por teclado un día de la semana
*  y que diga qué asignatura toca a primera hora ese día.
*/
public class Ejercicio1 {
    public static void main(String[] args) {
        //Declaracion de variables
        int Dia;
		Scanner in = new Scanner(System.in);
		System.out.println("_______________________________");
		System.out.println("\tHorario de clases");
		System.out.println("-------------------------------");
		System.out.print("ingresa el numero del dia de la semana: ");
		Dia=in.nextInt();
        switch(Dia)
        {
            case 1:
            {
                System.out.println("\tLunes");
                System.out.println("-------------------------------");
                System.out.println("12:00 - 13:00 - Fundamentos de programacion ");
                System.out.println("13:00 - 14:00 - Calculo diferenial");
                System.out.println("14:00 - 15:00 - Taller de etica");
                System.out.println("15:00 - 16:00 - Matematicas discretas");
                System.out.println("17:00 - 18:00 - Taller de administracion");
            }
            break;
            case 2:
            {
                System.out.println("\tMartes");
                System.out.println("-------------------------------");
                System.out.println("12:00 - 13:00 - Fundamentos de programacion ");
                System.out.println("13:00 - 14:00 - Calculo diferenial");
                System.out.println("14:00 - 15:00 - Taller de etica");
                System.out.println("15:00 - 16:00 - Matematicas discretas");
                System.out.println("16:00 - 17:00 - Fundamentos de investigacion");
                System.out.println("17:00 - 18:00 - Taller de administracion");
            }
            break;
            case 3:
            {
                System.out.println("\tMiercoles");
                System.out.println("-------------------------------");
                System.out.println("12:00 - 13:00 - Fundamentos de programacion ");
                System.out.println("13:00 - 14:00 - Calculo diferenial");
                System.out.println("14:00 - 15:00 - Taller de etica");
                System.out.println("15:00 - 16:00 - Matematicas discretas");
                System.out.println("17:00 - 18:00 - Taller de administracion");
            }
            break;
            case 4:
            {
                System.out.println("\tJueves");
                System.out.println("-------------------------------");
                System.out.println("12:00 - 13:00 - Fundamentos de programacion ");
                System.out.println("13:00 - 14:00 - Calculo diferenial");
                System.out.println("14:00 - 15:00 - Taller de etica");
                System.out.println("15:00 - 16:00 - Matematicas discretas");
                System.out.println("16:00 - 17:00 - Fundamentos de investigacion");
                System.out.println("17:00 - 18:00 - Taller de administracion");
            }
            break;
            case 5:
            {
                System.out.println("\tViernes");
                System.out.println("-------------------------------");
                System.out.println("11:00 - 12:00 - Tutorias");
                System.out.println("13:00 - 14:00 - Calculo diferencial");
                System.out.println("15:00 - 16:00 - Matematicas discretas");
            }
            break;
            case 6:
            {
                System.out.println("\tSabado");
                System.out.println("-------------------------------");
                System.out.println("08:00 - 12:00 - Ingles");
            }
            break;
            default:
            System.out.println("Ingresa un numero valido !!!");
        }//Fin de Switch
    }//Fin del metodo main ()  
}//Fin de la clase
