package Guia;
/*
* Ej15:
* Escribe un programa que pinte una pirámide rellena con un carácter introducido por teclado
* que podrá ser una letra, un número o un símbolo como *, +,-, $, &, etc. El programa debe
* permitir al usuario mediante un menú elegir si el vértice de la pirámide está apuntando hacia
* arriba, hacia abajo, hacia la izquierda o hacia la derecha.
*/
import java.util.Scanner;
public class Ejercicio15 {
    public static void main(String[] args) {
        //Declaracion de variables
        int opcion;
        String r;
        Scanner in = new Scanner(System.in);
        System.out.print("Introduzca un carácter de relleno: ");
        r=in.next();
        System.out.println("\tMenu");
        System.out.println("----------------------------------");
        System.out.println("1. Con el vértice hacia arriba");
        System.out.println("2. Con el vértice hacia abajo");
        System.out.println("3. Con el vértice hacia la izquierda");
        System.out.println("4. Con el vértice hacia la derecha");
        System.out.println("5. Salir");
        System.out.print("Elija una opcion: ");
        opcion=in.nextInt();
        switch(opcion) 
        {
          case 1:
          {
            System.out.println("  " + r);
            System.out.println(" " + r + r + r);
            System.out.println(r + r + r + r + r);
          }
          break;
          case 2:
          {
            System.out.println(r + r + r + r + r);
            System.out.println(" " + r + r + r);
            System.out.println("  " + r);
          }
          break;
          case 3:
          {
            System.out.println("    " + r);
            System.out.println("  " + r + " " + r);
            System.out.println(r + " " + r + " " + r);
            System.out.println("  " + r + " " + r);
            System.out.println("    " + r);
          }
          break;
          case 4:
          {
            System.out.println(r);
            System.out.println(r + " " + r);
            System.out.println(r + " " + r + " " + r);
            System.out.println(r + " " + r);
            System.out.println(r);
          }
          break;
          case 5:
            {
                System.exit(0);
            }
            default:
                System.out.println("Opcion Invalida !!!");
        }
    }//Fin del metodo main ()
}//Fin de la clase