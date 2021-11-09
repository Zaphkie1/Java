package seleccion;
import java.util.Scanner;
/*
* Ej18: Determina el numero de dias que tiene un determinado
* mes de año mediante el uso de la sentencia switch
* meses validos (1 - 12)
*/
public class DiaMes {

    public static void main(String[] args) {
        // declaracion de variables
        int Mes;
		Scanner in = new Scanner(System.in);
		System.out.println("_______________________________");
		System.out.println("\tNumero de Dias del mes");
		System.out.println("-------------------------------");
		System.out.print("ingresa el numero del Mes: ");
		Mes=in.nextInt();
        switch(Mes)
		{
			case 12:
            case 10:
            case 8:
            case 7:
            case 5:
            case 3:
            case 1:
			{
				System.out.println("El Mes "+Mes+" tiene 31 Dias");
			}
			break;
            case 4:
            case 6:
            case 9:
            case 11:
			{
				System.out.println("El Mes "+Mes+" tiene 30 Dias");
			}
			break;
            case 2:
            {
                System.out.println("El Mes "+Mes+" tiene 28 Dias"); 
            }
			default:
			System.out.println("El numero debe ser entre (1 - 12).");
		}//fin de switch
	}//fin de main()
}//fin de claseclass DiaMes