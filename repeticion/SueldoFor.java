package repeticion;

import java.util.Scanner;

/*
Ej24: Solicita 10 sueldos.
Muestra la suma total y cuantos sueldos son mayores a 1000
*/
public class SueldoFor {
    public static void main(String[] args) {
        //Declaracion de variables
        int sueldos;
        int nsueldos=0;
        int sueldosuma=0;
		Scanner in=new Scanner(System.in);
        for(int i=1; i<=10; i++)
        {
            System.out.print("Introduzca sueldo "+i+":");
            sueldos=in.nextInt();
            sueldosuma+=sueldos;
            if(sueldos>1000)
            {
                nsueldos++;
            }
        }//fin de for
        System.out.println("Suma de los sueldos: "+sueldosuma);
        System.out.println("Mayores de 1000: " +nsueldos);
    }//Fin del metodo main
}//Fin de la clase
