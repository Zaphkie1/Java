package Evaluacion;
/*
Ej 2: Ingresar un número entre 0 y 9999 y decir cuantas cifras tiene.
*/
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
            //Declaracion de variables
            Scanner in=new Scanner(System.in);
            System.out.println("Ingrese un numero entre 0 y 9,999");
            int numero=in.nextInt();
            System.out.println("---------------------------");
            if(numero<10)
            {
                System.out.println("tine 1 cifra");
            }
            else if(numero<100)
            {
                System.out.println("tiene 2 cifras");
            }
           else if(numero<1000)
            {
                System.out.println("tiene 3 cifras");
            }
           else if(numero<1000)
            {
                System.out.println("tiene 4 cifras");
            }
           else if(numero<100000)
            {
                System.out.println("tiene 5 cifras");
            }
           else if(numero<1000000)
            {
                System.out.println("tiene 6 cifras");
            }
           else if(numero<10000000)
            {
                System.out.println("tiene 7 cifras");
            }
           else if(numero<100000000)
            {
                System.out.println("tiene 8 cifras");
            }
           else if(numero<1000000000)
            {
                System.out.println("Tiene 9 cifras");
            }
            else if(numero<1000000000)
            {
                System.out.println("tiene 10 cifras");
            }
        }//Fin del metodo main ()
    }//Fin de la clase