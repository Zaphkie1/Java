package repeticion;
/*
* Ej17: Hacer un programa para calcular al Perimetro de un
* Cuadrado, rectangulo, triangulo, y circulo mediante un
* menu de opciones (Usar la sentencia Do-While)
*/
import java.util.Scanner;
public class MenuPerimetroDoWhile {
    public static void main(String[] args) {
        // Declaracion de variables
        int opc;
        Scanner in = new Scanner(System.in);
        do {// Inicio Do-While
            System.out.println("\tMenu de Perimetros");
            System.out.println("----------------------------");
            System.out.println("1. - Cuadrado");
            System.out.println("2. - Rectangulo");
            System.out.println("3. - Triangulo");
            System.out.println("4. - Circulo");
            System.out.println("5. - Salir");
            System.out.print("Seleccionar opcion: ");
            opc = in.nextInt();
            switch (opc) {
            case 1: {
                double lado1, lado2, lado3, lado4, perimetro;
                System.out.println("\tPermietro Cuadrado");
                System.out.println("--------------------------------");
                System.out.print("Ingresa el lado 1 del cuadrado: ");
                lado1 = in.nextDouble();
                System.out.print("Ingresa el lado 2 del cuadrado: ");
                lado2 = in.nextDouble();
                System.out.print("Ingresa el lado 3 del cuadrado: ");
                lado3 = in.nextDouble();
                System.out.print("Ingresa el lado 4 del cuadrado: ");
                lado4 = in.nextDouble();
                perimetro = lado1 + lado2 + lado3 + lado4;
                System.out.printf("Perimetro = %.2f", perimetro);
            }
                break;
            case 2: {
                double largo, ancho, perimetro;
                System.out.println("\tPermietro Rectangulo");
                System.out.println("--------------------------------");
                System.out.print("Ingresa el largo del rectangulo: ");
                largo = in.nextDouble();
                System.out.print("Ingresa el ancho del rectangulo: ");
                ancho = in.nextDouble();
                perimetro = 2 * (ancho + largo);
                System.out.printf("Perimetro = %.2f", perimetro);
            }
                break;
            case 3: {
                double ladoa, ladob, ladoc, perimetro;
                System.out.println("\tPermietro Triangulo");
                System.out.println("--------------------------------");
                System.out.print("Ingrese lado a: ");
                ladoa = in.nextDouble();
                System.out.print("Ingrese lado b: ");
                ladob = in.nextDouble();
                System.out.print("Ingrese lado c: ");
                ladoc = in.nextDouble();
                perimetro = ladoa + ladob + ladoc;
                System.out.printf("Perimetro = %.2f", perimetro);
            }
                break;
            case 4: {
                double radio, perimetro;
                System.out.println("\tPermietro Ciruculo");
                System.out.println("--------------------------------");
                System.out.print("Ingresa radio: ");
                radio = in.nextDouble();
                perimetro = 2 * Math.PI * radio; // Pi*diametro
                System.out.printf("Perimetro = %.2f", perimetro);
            }
            case 5: {
                System.exit(0);
            }
            default:
                System.out.println("Opcion Invalida !!!");
            }// fin del switch
        } while (opc != 5);// Fin de while
    }// fin del metodo main ()
}// Fin de la clase