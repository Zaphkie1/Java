package repeticion;
/*
Ej19: Imprime numeros pares, impares y numeros madiante la sentencia
for utilizando un menu de operaciones
1. - Imprime 10 numeros pares
2. - Imprime 10 numeros impares
3. - Imprime 10 numeros
4. - Salir
*/
import java.util.Scanner;

public class MenuForNumeros {
    public static void main(String[] args) {
        // Declaracion de variables
        int opc;
        Scanner in = new Scanner(System.in);
        do {
            System.out.println("\tMenu de Numeros");
            System.out.println("----------------------------");
            System.out.println("1. - Imprime 10 numeros pares");
            System.out.println("2. - Imprime 10 numeros impares");
            System.out.println("3. - Imprime 10 numeros");
            System.out.println("4. - Salir");
            System.out.print("Seleccionar opcion: ");
            opc = in.nextInt();
            switch (opc) {
            case 1: {
                int num = 2;
                System.out.println("------------------------------------\n");
                System.out.println("\tNumeros pares\n");
                System.out.println("------------------------------------\n");
                do {
                    System.out.println(num);
                    num += 2;
                } while (num <= 20);
            }
                break;
            case 2: {
                int num = 1;
                System.out.println("------------------------------------\n");
                System.out.println("\tNumeros pares\n");
                System.out.println("------------------------------------\n");
                do {
                    System.out.println(num);
                    num += 3;// Incremento
                } while (num <= 30);
            }
                break;
            case 3: {
                int numero = 1;
                while (numero <= 10) {
                    System.out.print(numero + "\n");
                    numero++;
                }
            }
                break;
            case 4: {
                System.exit(0);
            }
            default:
                System.out.println("Opcion Invalida !!!");
            }// fin del switch
        } while (opc != 5); // Fin de while
    }// fin del metodo main ()
}// fin de la clase