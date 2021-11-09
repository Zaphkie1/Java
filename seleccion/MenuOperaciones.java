package seleccion;

import java.util.Scanner;

/*
* Ej19: Desarrolle un programa para realizar las
* operaciones de suma, resta, multiplicacion y divicion de dos
* numeros enteros utilizando la sentencia switch
*/
public class MenuOperaciones {
    public static void main(String[] args) {
        // Declaracion de variables
        int num1, num2, result, opc;
        double result2;
        Scanner in = new Scanner(System.in);
        System.out.print("Selecciona el primer valor: ");
        num1 = in.nextInt();
        System.out.print("Selecciona el segundo valor: ");
        num2 = in.nextInt();
        System.out.println("\tMenu de Opciones");
        System.out.println("----------------------------");
        System.out.println("1. - Suma");
        System.out.println("2. - Resta");
        System.out.println("3. - Multiplicacion");
        System.out.println("4. - Division");
        System.out.println("5. - Salir");
        System.out.print("Seleccionar opcion: ");
        opc = in.nextInt();
        switch (opc) {
        case 1: {
            result = num1 + num2;
            System.out.println(num1 + " + " + num2 + " = " + result);
        }
            break;
        case 2: {
            result = num1 - num2;
            System.out.println(num1 + " - " + num2 + " = " + result);
        }
            break;
        case 3: {
            result = num1 * num2;
            System.out.println(num1 + " * " + num2 + " = " + result);
        }
            break;
        case 4: {
            result2 = (double) num1 / (double) num2;
            System.out.println(num1 + " / " + num2 + " = " + result2);
        }
            break;
        case 5: {
            System.exit(0);
        }
            break;
        default:
            System.out.println("Opcion Invalida !!!");
        }// fin del switch
    } // fin metodo main ()
}// fin de la clase