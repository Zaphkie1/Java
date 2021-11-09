package Evaluacion;

import java.util.Scanner;

/*
Calcula la nota de un trimestre de la asignatura Programación . El programa
pedirá las dos notas que ha sacado el alumno en los dos primeros controles.
Si la media de los dos controles da un número mayor o igual a 5, el alumno
está aprobado y se mostrará la media. En caso de que la media sea un
número menor que 5, el alumno habrá tenido que hacer el examen de
recuperación que se califica como apto
o no apto , por tanto se debe
preguntar al usuario ¿Cuál ha sido el resultado de la recuperación? (apto/no
apto) . Si el resultado de la recuperación es apto , la nota será un 5; en caso
contrario, se mantiene la nota media anterior. (
*/
public class Ejerciocio8 {
    public static void main(String[] args) {
        // Declaracion de variables
        Double nota1, nota2, media, respuesta, noapto, apto;
        Scanner in = new Scanner(System.in);
        System.out.println("_______________________________");
        System.out.println("\tMedia de dos notas y boletin");
        System.out.println("-------------------------------");
        System.out.print("Introduzca la primera nota: ");
        nota1 = in.nextDouble();
        System.out.print("Introduzca la segunda nota: ");
        nota2 = in.nextDouble();
        media = (nota1 + nota2) / 3;
        System.out.println("¿Cuál ha sido el resultado de la recuperación? (apto/no apto)");
        respuesta = in.nextDouble();
        System.out.printf("La media es %.2f\n", media);
        if (media < 5) {
            System.out.println("Reprovado !!!");
        } else if (media >= 5) {
            System.out.println("Aprovado !!!");
        }
    }// Fin del metodo main ()
}// Fin de la clase
