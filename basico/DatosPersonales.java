package basico;
/*
 * Ej 3: Muestra en pantalla datos personales de una perosna
 * utilizando variables
 */
public class DatosPersonales {

	public static void main(String[] args) {
		//definicion de variables
		String nombre="Javier Lopez";
		String direccion="Villas del carmen #15";
		String telefono="492-456-7890";
		String nacimiento="Durango";
		String correo="jlopez@gmail.com";
		int edad=21;
		double peso= 78.65;
		double altura=1.78;
		//Imprime los datos de persona
		System.out.print("\t***** Datos de la persona *****\n");
		System.out.print("____________________________________________\n");
		System.out.print("Nombre : "+nombre+"\n");
		System.out.print("Direccion : "+direccion+"\n");
		System.out.print("Telefono : "+telefono+"\n");
		System.out.print("Nacimiento : "+nacimiento+"\n");
		System.out.print("email : "+correo+"\n");
		System.out.print("Edad : "+edad+"\n");
		System.out.print("peso : "+peso+"\n");
		System.out.print("Altura : "+altura+"\n");
		//asingna nuevos valores a las variables
		nombre="vannesa ruiz";
		direccion="Las palmas #1";
		telefono="492-123-4567";
		nacimiento="Zacatecas, zac";
		correo="vannesa.ruiz@gmail.com";
		edad=19;
		peso=56.9;
		altura=1.75;
		//Imprime los datos de persona 2
		System.out.print("\n\t***** Datos de la persona *****\n");
		System.out.print("____________________________________________\n");
		System.out.print("Nombre : "+nombre+"\n");
		System.out.print("Direccion : "+direccion+"\n");
		System.out.print("Telefono : "+telefono+"\n");
		System.out.print("Nacimiento : "+nacimiento+"\n");
		System.out.print("email : "+correo+"\n");
		System.out.print("Edad : "+edad+"\n");
		System.out.print("peso : "+peso+"\n");
		System.out.print("Altura : "+altura+"\n");
	}//fin del metodo main()
}//fin de la clase
