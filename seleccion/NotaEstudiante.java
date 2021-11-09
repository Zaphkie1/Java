package seleccion;
/*
* Ej6: Determina la nota de un estudiante
* mediante lo siguiente
* si calificacion es entre 100 y 90 ----> Excelente
* si calificacion es entre 89 y 80 -----> Muy bien
* si calificacion es entre 79 y 70 -----> Bien
* si calificacion es entre 69 y 60 -----> Mal
* si calificacion es entre < 59 -----> Reprobado
*/

import java.util.Scanner;

public class NotaEstudiante {

   public static void main(String[] args) {
      // Declaracion de variables
      	double calificacion;
		Scanner in = new Scanner(System.in);
		System.out.println("________________________________________________");
		System.out.println("\tCalificaciones");
		System.out.println("------------------------------------------------");
		System.out.print("Ingresa tu calificacion obtenida en el examen: ");
		calificacion = in.nextDouble();
        
        if(calificacion >= 90 && calificacion <= 100)
		{
			System.out.print("Exelente");
		}
		else if(calificacion >=80 && calificacion <= 89)
		{
			System.out.print("Muy bien");
		}
        else if(calificacion >=70 && calificacion <= 79)
		{
			System.out.print("Bien");
		}
        else if(calificacion >=60 && calificacion <= 69)
		{
			System.out.print("Mal");
		}
        else
        {
            System.out.print("Reprobado");
        }
    }
    
}
