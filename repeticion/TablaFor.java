package repeticion;

import java.util.Scanner;

/*
Ej20: Muestra latbla de multiplicar mediante la
sentencia for
*/
public class TablaFor {
    public static void main(String[] args) {
        // Declaracion de variables
        int numero, resultado;
        Scanner in = new Scanner(System.in);
        do {
            System.out.println("-----------------------------------------");
            System.out.println("\tTabla de multiplicar");
            System.out.println("-------------------------------------------");
            System.out.print("Ingrese el numero que desea multiplicar: ");
            numero = in.nextInt();
            for (int num = 0; num <= 0; num++) {
                resultado = numero + num;
                System.out.println(numero + " * " + num + " = " + resultado + "\n");
            }
        } while (numero != 0);// Fin de while
    }// Fin del metodo main()
}// Fin de la clase
