package seleccion;
import java.util.Scanner;
/*
 * Ej14: Determina la nora de un estudiante mediante el uso
 * de la sentencia switch
 */
public class Nota {

	public static void main(String[] args) {
		// declaracion de variables
		String nombre;
		int nota;
		Scanner in = new Scanner(System.in);
		System.out.println("Nota estudiante");
		System.out.println("----------------------");
		System.out.print("Ingresa de el nombre del estudiante: ");
		nombre=in.next();
		System.out.print("Ingresa cealificacion: ");
		nota=in.nextInt();
		switch(nota)
		{
			case 100:
			{
				System.out.println("Excelente !!!");
			}
			break;
			case 90:
			{
				System.out.println("Muy bien !!!");
			}
			break;
			case 80:
			{
				System.out.println("Bien !!!");
			}
			break;
			case 70:
			{
				System.out.println("Suficiente !!!");
			}
			break;
			case 60:
			{
				System.out.println("Reprobado !!!");
			}
			break;
			default:
			System.out.println("Opcion Invalida");
		}//fin de switch
	}//fin de main()
}//fin de clase