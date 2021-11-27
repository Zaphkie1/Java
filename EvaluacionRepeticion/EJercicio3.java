package EvaluacionRepeticion;

import java.util.Scanner;
/*
EJ3: Ingresar 10 números. Mostrar la media de los números positivos, la media de
los números negativos y la cantidad de ceros. (10 pts)
*/
public class EJercicio3 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int numeroneg=0;
        int numeropos=0;
        int numero0 = 0;
        int positivo = 0;
        int negativo = 0;
        int num;
        double mediapos;
        double medianeg;
        for(int i=1;i<=10;i++){
            System.out.print("Escribe un numero: ");
            num = in.nextInt();
            if(num<0){
                numeroneg++;
                negativo+=num;
            }else{
                if(num>0){
                    positivo+=num;
                    numeropos++;
                }else{
                    numero0++;
                }
            }
        }
        mediapos=(double) positivo/numeropos;
        medianeg=(double) negativo/numeroneg;
        System.out.println("Lamedia de los numeros positivos son: "+mediapos);
        System.out.println("La media de los numeros negativos son: "+medianeg);
        System.out.println("La cantidad de ceros es: "+numero0);
    }//Fin del metodo main ()
}//Fin de la clase
