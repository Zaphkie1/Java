package basico;
public class Operaciones {
/*
 * Ej8: Muestra el uso de operaciones aritmeticos
 * y conversion de tipos en operaciones basicas
 */
	public static void main(String[] args) {
		// Declaracion de variables
		String x="10";
		int y=20,z=50;
		double a=20.45;
		System.out.println(x+y); //1020
		System.out.println(y+z); //70
		System.out.println(y+a); //40.45
		System.out.println(a+z); //70.45
		System.out.println((double)y/(double)z); //0.4 cating
		System.out.println((Integer.parseInt(x))+z); //Convierte a entero //60 casting diferente
		System.out.println(Double.parseDouble(x)+a); //Convierte a doble
		System.out.println("**********************************************");
		int result=10;
		System.out.println(result); //10
		result++;
		System.out.println(result); //11
		System.out.println(result++); //11
		System.out.println(result); //12
		result--;
		System.out.println(--result); //10
		System.out.println(result--); //10
		System.out.println(result); //9
		++result;
		result--;	
	}//fin del metodo main
}//fin de la clase
