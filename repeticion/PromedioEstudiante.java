package repeticion;
/*
Ej4:Escribe un programa en el que se pida el nombre y n calificaciones 
utilizando while
*/
import java.util.Scanner;

public class PromedioEstudiante {
    public static void main(String[] args) {
        // declaracion de variables
        int ncalif, calif, scalif = 0, c;
        double promedio;
        String nombre;
        Scanner in = new Scanner(System.in);
        // solicitar los datos de entrada
        System.out.println("\tPromedio Estudiante\n");
        System.out.println("---------------------------------\n");
        System.out.print("Ingresa Nombre del estudiante: ");
        nombre = in.next();
        System.out.print("Ingresa numero de calificaciones: ");
        ncalif = in.nextInt();
        c = 1;// inicializacion
        while (c <= ncalif)// condicion
        {
            System.out.print("Ingresa calificacion " + c + " : ");
            calif = in.nextInt();
            scalif += calif;
            c++; // incremento
        } // fin del while
        promedio = (double) scalif / (double) ncalif;
        System.out.printf("El promedio de %s = %.2f ", nombre, promedio);
    }// fin del metodo main ()
}// fin de la clase
