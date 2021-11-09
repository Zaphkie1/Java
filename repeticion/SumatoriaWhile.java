package repeticion;

import java.util.Scanner;

public class SumatoriaWhile {
    public static void main(String[] args) {
        //declaracion de variables
        Scanner in = new Scanner(System.in);
        int n=0,num=0,snum=0;
        num=0;
        while(num>=0)
        {
            System.out.print("Ingresa un numero: ");
            num=in.nextInt();
            snum+=num;
            n++;
        }//Fin de while
        System.out.print("La sumatoria de "+(n-1)+" numero(s) es: "
                +(snum-num));
    }//Fin del metodo main ()
}//Fin de la clase
