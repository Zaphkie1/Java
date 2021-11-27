package repeticion;
/*
Ej21: Determina el promedio de un estudiante, solicita
los 5 parciales del semestre y determina si el estudiante
esta aprovado (Calificacion mayor o igual a 70) mediante la
sentencia for
*/

import java.util.Scanner;
public class PromedioEstudianteFor {
    public static void main(String[] args) {
        // declaracion de variables
        int calif=0,scalif=0;
        double promedio;
        String nombre;
        Scanner in = new Scanner(System.in);
        System.out.println("\tPromedio Estudiante");
        System.out.println("------------------------------------");
        System.out.println("Ingresa el nombre del estudiante: ");
        nombre = in.next();
        for(int i=1;i<=5;i++){
            System.out.println("Ingresa calificacion "+i+" : ");
            calif=in.nextInt();
            scalif+=calif;
        }
        promedio=(double)scalif/(double)5;
        System.out.println("El promedio es: "+promedio);
        if(promedio>=70){
            System.out.println(nombre);
            System.out.println("Eres un alumno aprobado !!!");
        }
        else{
            System.out.println(nombre);
            System.out.println("No estas aprobado !!!");
        }
    }// fin del metodo main()
}// fin de la clase