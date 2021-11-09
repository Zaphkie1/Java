package repeticion;

import java.util.Scanner;

/*
Ej15: Determina si un numero ingresaro
es numero par o numero impar, obtener la sumatoria
de los numeros son pares y cuantos impares, terminar interaccion
cuando se ingrese un 0, mediante el uso de la
sentencia do-while
*/
public class ParImparDoWhile {
    public static void main(String[] args) {
        //Declaracion de variables
        int numero,i,sPares=0,sImpares=0;
        int npar=0,total,nimpar=0;
        Scanner in = new Scanner(System.in);
        //solicitar los datos de entrada
        System.out.println("\tSumatoria de Numeros Pares e Nmpares\n");
        System.out.println("--------------------------------------\n");
        System.out.print("Ingresa total de numeros que deseas capturar: ");
        total=in.nextInt();
        i=1;//inicializacion
        while(i <= total)//condicion
        {
            System.out.print("Ingresa valor: "+i+" ==> ");
            numero=in.nextInt();
            if (numero %2 == 0)
            {
                sPares+=numero; //sumatoria de los pares
                npar++; //cuenta los numeros pares
            }
            else
            {
                sImpares+=numero;
                nimpar++;
            }
            i++;
        }// fin del while
        System.out.println("------------------------------------------\n");
        System.out.println("La sumatoria de "+npar+" numeros"
        +" pares es "+sPares);
        System.out.println("La sumatoria de "+nimpar+" numeros"
        +" pares es "+sImpares);
    }
}
