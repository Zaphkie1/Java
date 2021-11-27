package repeticion;
/*
* Ej8: Muestra la tabla de multiplicar de un
* numero introducido por teclado utilizando la
* sentencia while ( 1 x 1 = 1 )
*/
import java.util.Scanner;

public class TablaMultiplicar {
    public static void main(String[] args) {
        // Declaracion de variables
        int num, resultado, i = 1;
        Scanner in = new Scanner(System.in);
        System.out.print("Digita un número: ");
        num = in.nextInt();
        while (i <= 10) {
            resultado = num * i;
            System.out.println(num + " x " + i + " = " + resultado);
            i++;
        } // fin del while
    }// fin dle metodo main ()
}// fin de la clase