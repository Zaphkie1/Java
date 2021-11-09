package basico;

import java.util.Scanner;

/*
*   Ej.23: Elabora un algoritmo mediante los datos de nombre,
*   peso y altura de un compa�ero tuyo, expresados esots dos
*   ultimos datos en kilogramos y metros respectivamente,
*   imprima el nombre y sus equivalentes de peso y altura en
*   libras y pulgadas. 1 Metro equivale a 39.3707
*   pulgadas y 1 kilogramo equivale a 2.204623 libra.
*   en formato de tabla
*/

public class Equivalencia {
    
    public static void main(String[] args) {
        //declaracion de variables

        Scanner in = new Scanner (System.in);
		String nombre;
        double kilogramos,metros,libras,pulgadas;
        System.out.println("Ingresa tu nombre: ");
		nombre=in.nextLine();
        System.out.println("Ingresa tu peso en kilogramos: ");
		kilogramos=in.nextDouble();
        System.out.println("Ingresa tu estatura en metros: ");
		metros=in.nextDouble();
        libras= 2.204623*kilogramos;
        pulgadas= 39.3707*metros;
        System.out.println("------------------------------------------------------------------------");
        System.out.println("|\t nombre \t|\t"+nombre+"\t\t");
        System.out.println("------------------------------------------------------------------------");
        System.out.println("|                              Peso                                     ");
        System.out.println("------------------------------------------------------------------------");
        System.out.println("|\t kilogramos \t| \t libras \t\t                                       ");
        System.out.println("------------------------------------------------------------------------");
        System.out.println("|\t" +kilogramos+ "\t        | \t "+libras+"\t\t                    ");
        System.out.println("------------------------------------------------------------------------");
        System.out.println("|                             Altura                                    ");
        System.out.println("------------------------------------------------------------------------");
        System.out.println("|\t Metros \t| \t Pulgadas \t\t"); 
        System.out.println("------------------------------------------------------------------------");
        System.out.println("|\t" +metros+ "\t        | \t "+pulgadas+ "\t\t                         ");
        System.out.println("------------------------------------------------------------------------");

    }
}