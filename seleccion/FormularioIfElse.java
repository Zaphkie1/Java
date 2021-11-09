package seleccion;
/*
* Ej4: Ingresa datos del formulario
* nombre,direccion,telefono,correo,edad,sueldo
* sexo,profesion, solo si la persona es mayor de edad
* de lo contrario enviar mensajes de que el formulario
* no esta disponible para menores de edad.
* Presentar en formato tabla.
*/

import java.util.Scanner;

public class FormularioIfElse {

	public static void main(String[] args) {
		// Declaracion de variables
		
		Scanner in = new Scanner(System.in); //ingreso de datos
		String nombre;
		String direccion;
		String telefono;
		String email;
		String sexo;
		String estudios;
		String profesion;
		String ingresos;
		int edad;
		System.out.println("Ingresa tu Nombre: ");
		nombre=in.nextLine();
		System.out.println("Ingresa tu Edad: ");
		edad=in.nextInt();
		if (edad >= 18)
		{
			System.out.println("Ingresas tu Direccion: ");
			direccion=in.next();
			System.out.println("Ingresas tu Numero de telefono: ");
			telefono=in.next();
			System.out.println("Ingresas tu Email: ");
			email=in.next();
			System.out.println("Ingresas tu Genero: ");
			sexo=in.next();
			System.out.println("Ingresas tu nivel de Estudios: ");
			estudios=in.next();
			System.out.println("Ingresas tu Pagina web: ");
			profesion=in.next();
			System.out.println("Ingresas Tus ingresos: ");
			ingresos=in.next();
			System.out.println("    _______________________________________________________________________________________");
			System.out.println("    |                                  Datos personales                                   |");
			System.out.println("    ---------------------------------------------------------------------------------------");
			System.out.println("    |Nombre:                                                 | "+nombre                     );
			System.out.println("    ---------------------------------------------------------------------------------------");
			System.out.println("    |Edad:                                                   | "+edad                       );
			System.out.println("    ---------------------------------------------------------------------------------------");
			System.out.println("    |Direccion:                                              | "+direccion                  );
			System.out.println("    ---------------------------------------------------------------------------------------");
			System.out.println("    |Telefono:                                               | "+telefono                   );
			System.out.println("    ---------------------------------------------------------------------------------------");
			System.out.println("    |Email:                                                  | "+email                      );
			System.out.println("    ---------------------------------------------------------------------------------------");
			System.out.println("    |Sexo:                                                   | "+sexo                       );
			System.out.println("    ---------------------------------------------------------------------------------------");
			System.out.println("    |Estudios:                                               | "+estudios                   );
			System.out.println("    ---------------------------------------------------------------------------------------");
			System.out.println("    |Pagina Web                                              | "+profesion                  );
			System.out.println("    ---------------------------------------------------------------------------------------");
			System.out.println("    |Ingresos:                                               | "+ingresos                   );
			System.out.println("    ---------------------------------------------------------------------------------------");
		}
		else // false o 0
		{
			System.out.println(nombre+" tienes " +edad+
					" años, eres menor de edad no puedes continuar con la encuesta");	
		}

	}

}
