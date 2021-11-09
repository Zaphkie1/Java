package repeticion;

import java.util.Scanner;

public class Sumatoria2While {
    public static void main(String[] args) {
        //declaracion de variables
        Scanner in = new Scanner(System.in);
        int contador = 0;
        int numero = 0;
        System.out.print("Dime un numero: ");
        numero = in.nextInt();

        while(numero > 0)
        {
            contador++;
            System.out.print("Dime un numero: ");
            numero = in.nextInt();
        }
        System.out.printf("se ingresaron "+contador+" numeros positivos");
        
    }
}
