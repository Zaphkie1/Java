package repeticion;

import java.util.Scanner;

/*
Ej25: Determina la edad de 5 alumnos utilizando la 
sentencia for
*/
public class EdadFor {
    public static void main(String[] args) {
        //Declaracion de variables
        Scanner in = new Scanner (System.in);
        int edad,cedad=0,caltura=0;
        double esta,mediaedad,medialt,sedad=0,saltura=0;
        System.out.println("\tEdades de alumnos");
        System.out.println("---------------------------------------");
        for(int i=1;i<=5;i++){
            System.out.println("Ingrese edad "+i+" : ");
            edad=in.nextInt();
            System.out.println("Ingresa estatura "+i+" : ");
            esta=in.nextDouble();
            if(edad>=18){
                cedad++;
                sedad+=edad;
            }
            if(esta>=1.75){
                caltura++;
                saltura+=esta;
            }
        }
        mediaedad=sedad/cedad;
        medialt=saltura/caltura;
        System.out.printf("Edad media: %.2f\n",mediaedad);
        System.out.printf("Estatura media: %.2f\n",medialt);
        System.out.println("Alumnos mayores de 18 años: "+cedad);
        System.out.println("Alumnos que miden mas de 1.75 mts: "+caltura);
    }//Fin del metodo main ()
}//Fin de la clase
