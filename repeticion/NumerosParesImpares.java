package repeticion;
/*
Ej5: Determina la sumatoria de n numeros pares eh impares
ingresaos desde el tecladoo mediante el uso de la
sentencia while
*/
import java.util.Scanner;
public class NumerosParesImpares {
    public static void main(String[] args) {
        // declaracion de variables
        Scanner in = new Scanner(System.in);
        int num = 0, simpar = 0, spar = 0, npar = 0, nimpar = 0;
        do {
            System.out.print("Ingresa un numero: ");
            num = in.nextInt();
            if (num % 2 == 0) {
                spar += num;
                npar++;
            } else {
                simpar += num;
                nimpar++;
            }
        } while (num != 0);
        System.out.println("La sumarotia de " + (npar - 1) + " numeros" + " pares es " + spar);
        System.out.println("La sumarotia de " + nimpar + " numeros" + " impares es " + simpar);
    }// fin del metodo main ()
}// fin de la clase