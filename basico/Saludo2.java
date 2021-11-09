 package basico;
 /*
  *  Ej2. Imprime saludos
  *  utilizando variable tipo string
  */

public class Saludo2{
	public static void main(String[] args) {
		//declaracion de variables
		//Sintaxis : <Tipo> <nombre> = <Valor>;
		String SaludoMX="Hola mundo !!!";
		String SaludoEn="Hello world !!!";
		String SaludoIt="Saluti Mundi !!!";
		String SaludoGe="Hallo Welt !!!";
		String SaludoPo="Witaj swiecie !!!";
		//Imprime en cabezado de saludos
		System.out.print("\t***Saludos***\n");
		System.out.print("__________________________________\n\n");
		//imprime el valor de las variables
		System.out.println("MX ---->" +SaludoMX+"\n");
		System.out.println("En ---->" +SaludoEn+"\n");
		System.out.println("It ---->" +SaludoIt+"\n");
		System.out.println("Ge ---->" +SaludoGe+"\n");
		System.out.println("Po ---->" +SaludoPo+"\n");
	}//Fin del metodo main ()
}//Fin de la clase
