package EvaluacionRepeticion;

import java.util.Scanner;

/*
Ej4: Ingresar un numero defindo de usuarios y solicitar su nombre y sueldo,
mostrar nombre del empleado con el sueldo máximo.
*/
public class EJercicio4 {
    public static void main(String[] args) {
        //Declaracion de variables
        Scanner in=new Scanner(System.in);
        String nombre;
        int sueldo;
        int sueldomaximo=0;
        for(int i=1;i<=5;i++){
            System.out.println("Ingresa el nombre del usuario "+i+" : ");
            nombre=in.next();
            System.out.println("Escribe el sueldo del empleado "+i+ " : ");
            sueldo = in.nextInt();
                if(sueldo>sueldomaximo)
                sueldomaximo=sueldo;
                System.out.println("El nombre del  con el salario mas alto es: "+nombre);
                System.out.println("Su sieldo es de: "+sueldomaximo);
        }
    }//Fin del metodo main ()
}//Fin de la clase