package Guia;

import java.util.Scanner;

/*
* Ej8:
* Amplía el programa anterior para que diga la nota del 
* boletín (insuficiente, suficiente, bien, notable o sobresaliente).
*/
public class Ejercicio8 {
    public static void main(String[] args) {
            //Declaracion de variables
            Double nota1,nota2,nota3,media;
            Scanner in = new Scanner(System.in);
            System.out.println("_______________________________");
            System.out.println("\tMedia de tres notas y boletin");
            System.out.println("-------------------------------");
            System.out.print("Introduzca la primera nota: ");
            nota1 = in.nextDouble();
            System.out.print("Introduzca la segunda nota: ");
            nota2 = in.nextDouble();        
            System.out.print("Introduzca la tercera nota: ");
            nota3 = in.nextDouble();        
            media = (nota1 + nota2 + nota3) / 3;
            System.out.printf("La media es %.2f\n", media);
            if (media < 5) 
            {
              System.out.println("Insuficiente");
            }
            else if ((media >= 5) && (media < 6)) 
            {
              System.out.println("Suficiente");
            }
            else if ((media >= 6) && (media < 7)) 
            {
              System.out.println("Bien");
            }
            else if ((media >= 7) && (media < 9)) 
            {
              System.out.println("Notable");
            }
            else if (media >= 9);
              System.out.println("Sobresaliente");
        }//Fin del metodo main ()
    }//Fin de la clase