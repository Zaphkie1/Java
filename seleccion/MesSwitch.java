package seleccion;
import java.util.Scanner;
/*
* Ej16: Determina el mes del año mediante el uso
* de la sentencia Switch (1 - 12)
*/
public class MesSwitch {

    public static void main(String[] args) {
        // declaracion de variables
        int Mes;
		Scanner in = new Scanner(System.in);
		System.out.println("_______________________________");
		System.out.println("Numero del Mes");
		System.out.println("-------------------------------");
		System.out.print("ingresa el numero del Mes: ");
		Mes=in.nextInt();
        switch(Mes)
		{
			case 12:
			{
				System.out.println("El Numero "+Mes+" Significa que: Es Diciembre");
			}
			break;
			case 11:
			{
				System.out.println("El Numero "+Mes+" Significa que: Es Noviembre");
			}
			break;
			case 10:
			{
				System.out.println("El Numero "+Mes+" Significa que: Es Octubre");
			}
			break;
			case 9:
			{
				System.out.println("El Numero "+Mes+" Significa que: Es Septiembre");
			}
			break;
			case 8:
			{
				System.out.println("El Numero "+Mes+" Significa que: Es Agosto");
			}
			break;
            case 7:
			{
				System.out.println("El Numero "+Mes+" Significa que: Es Julio");
			}
			break;
            case 6:
			{
				System.out.println("El Numero "+Mes+" Significa que: Es Junio");
			}
			break;
            case 5:
			{
				System.out.println("El Numero "+Mes+" Significa que: Es Mayo");
			}
			break;
			case 4:
			{
				System.out.println("El Numero "+Mes+" Significa que: Es Abril");
			}
			break;
			case 3:
			{
				System.out.println("El Numero "+Mes+" Significa que: Es Marzo");
			}
			break;
			case 2:
			{
				System.out.println("El Numero "+Mes+" Significa que: Es Febrero");
			}
			break;
			case 1:
			{
				System.out.println("El Numero "+Mes+" Significa que: Es Enero");
			}
			break;
			default:
			System.out.println("Ingrese un numero valido.");
		}//fin de switch
	}//fin de main()
}//fin de clase