package seleccion;
import java.util.Scanner;
/*
* Ej17: Determinar si el valor ingresado corresponde
* a un dia laboral de la semana (1 - 5) o a un dia
* no laboral (6 - 7). Mediante el uso de la
* sentencia Switch. Enviar un mensaje segun corresponda
*/
public class DiaLaboral {

    public static void main(String[] args) {
        // Declaracion de variables
        int Dia;
		Scanner in = new Scanner(System.in);
		System.out.println("_______________________________");
		System.out.println("\tDia Laboral");
		System.out.println("-------------------------------");
		System.out.print("ingresa el numero del dia de la semana: ");
		Dia=in.nextInt();
        switch(Dia)
		{
			case 7:
			{
				System.out.println("El dia "+Dia+" no es Laboral");
			}
			break;
			case 6:
			{
				System.out.println("El dia "+Dia+" no es Laboral");
			}
			break;
            case 5:
            case 4:
            case 3:
            case 2:
            case 1:
			{
				System.out.println("El dia "+Dia+" Es Laboral");
			}
			break;
			default:
			System.out.println("Ingrese un numero valido.");
		}//fin de switch
	}//fin de main()
}//fin de clase