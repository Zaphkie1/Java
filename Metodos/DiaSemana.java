package Metodos;

/*
Ej12: Muestra en pantalla un dia de la semana de forma aleatoria (Random)
*/
public class DiaSemana {
    public static void main(String[] args) {
        // Declaracion de variables
        int dia;
        System.out.println("-------------------------------------");
        System.out.println("\tDia semana");
        System.out.println("-------------------------------------");
        dia = ((int) (Math.random() * 6));
        switch (dia) {
            case 0: {
                System.out.println("El dia de hoy es lunes");
            }
                break;
            case 1: {
                System.out.println("El dia de hoy es martes");
            }
                break;
            case 2: {
                System.out.println("El dia de hoy es miercoles");
            }
                break;
            case 3: {
                System.out.println("El dia de hoy es jueves");
            }
                break;
            case 4: {
                System.out.println("El dia de hoy es viernes");
            }
                break;
            case 5: {
                System.out.println("El dia de hoy es sabado");
            }
                break;
            case 6: {
                System.out.println("El dia de hoy es domingo");
            }
                break;
        }// Fin del whitch
    }
}