package basico;

import java.util.Scanner;
/*
 * Ej10: Realiza un programa que solicite datos de persona
 * (nombre, apellido, direccion, telefono, email, sexo, 
 * estudios, estado civil, pagina web, ingresos) y muestra los
 * datos de persona en formato de tabla mediante el uso de la
 * Clase Scanner para el ingreso de datos.
 */
public class Formulario {

	public static void main(String[] args) {
		// Declaracion de variables
		Scanner in = new Scanner(System.in); //ingreso de datos
		String nombre;
		String apellido;
		String direccion;
		String telefono;
		String email;
		String sexo;
		String estudios;
		String estadocivil;
		String paginaweb;
		String ingresos;
		System.out.println("Ingresa tu Nombre: ");
		nombre=in.nextLine();
		System.out.println("Ingresas tus Apellidos ");
		apellido=in.nextLine();
		System.out.println("Ingresas tu Direccion: ");
		direccion=in.nextLine();
		System.out.println("Ingresas tu Numero de telefono: ");
		telefono=in.nextLine();
		System.out.println("Ingresas tu Email: ");
		email=in.nextLine();
		System.out.println("Ingresas tu Genero: ");
		sexo=in.nextLine();
		System.out.println("Ingresas tu nivel de Estudios: ");
		estudios=in.nextLine();
		System.out.println("Ingresas tu Estado civil: ");
		estadocivil=in.nextLine();
		System.out.println("Ingresas tu Pagina web: ");
		paginaweb=in.nextLine();
		System.out.println("Ingresas Tus ingresos: ");
		ingresos=in.nextLine();
		System.out.println("    _______________________________________________________________________________________");
		System.out.println("    |                                  Datos personales                                   |");
		System.out.println("    ---------------------------------------------------------------------------------------");
		System.out.println("    |Nombre:                                                 | "+nombre);
		System.out.println("    ---------------------------------------------------------------------------------------");
		System.out.println("    |Apellido:                                               | "+apellido                  );
		System.out.println("    ---------------------------------------------------------------------------------------");
		System.out.println("    |Direccion:                                              | "+direccion                     );
		System.out.println("    ---------------------------------------------------------------------------------------");
		System.out.println("    |Telefono:                                               | "+telefono );
		System.out.println("    ---------------------------------------------------------------------------------------");
		System.out.println("    |Email:                                                  | "+email );
		System.out.println("    ---------------------------------------------------------------------------------------");
		System.out.println("    |Sexo:                                                   | "+sexo );
		System.out.println("    ---------------------------------------------------------------------------------------");
		System.out.println("    |Estudios:                                               | "+estudios );
		System.out.println("    ---------------------------------------------------------------------------------------");
		System.out.println("    |Estado civil:                                           | "+estadocivil );
		System.out.println("    ---------------------------------------------------------------------------------------");
		System.out.println("    |Pagina Web                                              | "+paginaweb );
		System.out.println("    ---------------------------------------------------------------------------------------");
		System.out.println("    |Ingresos:                                               | "+ingresos );
		System.out.println("    ---------------------------------------------------------------------------------------");

		
	}

}
