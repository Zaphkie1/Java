package repeticion;
/*
Ej 18: Crear un menu de Areas de las figuras
cuadrado, rectangulo, triangulo, circulo mediante
la sentencia (Do-While)
*/
import java.util.Scanner;

public class MenuAreaDoWhile {
    public static void main(String[] args) {
        //Declaracion de variables
        int opc;
        Scanner in = new Scanner(System.in);
        do{
        System.out.println("\tMenu de Areas");
        System.out.println("----------------------------");
        System.out.println("1. - Cuadrado");
        System.out.println("2. - Rectangulo");
        System.out.println("3. - Triangulo");
        System.out.println("4. - Circulo");
        System.out.println("5. - Salir");
        System.out.print("Seleccionar opcion: ");
        opc=in.nextInt();
        switch(opc)
        {
            case 1:
            {
                Double area,a;
                System.out.println("\tArea Cuadrado");
                System.out.println("----------------------------");
                System.out.print("ingrese el lado de cuadrado: ");
                a=in.nextDouble();
                area=a*a;
                System.out.println("Area = " +area);
            }
            break;
            case 2:
            {
                double area;
                Scanner sc=new Scanner(System.in);
                System.out.println("\tArea Rectangulo");
                System.out.println("----------------------------");
                System.out.print("ingrese ancho del rectangulo: ");
                double a=sc.nextDouble();
                System.out.print("ingrese alto del rectangulo: ");
                double b=sc.nextDouble();
                area=a*b;
                System.out.println("El area del rectangulo es= " +area);
            }
            break;
            case 3:
            {
                Scanner sc = new Scanner(System.in);
                double b,h;
                System.out.println("\tArea Triangulo");
                System.out.println("----------------------------");
                System.out.print("Ingresa la base del triangulo: ");
                b=sc.nextDouble();
                System.out.print("Ingresa la altura del triangulo: ");
                h=sc.nextDouble();
                double area;
                area=b*h/2;
               System.out.print("El area del triangulo es: "+area);
            }
            break;
            case 4:
            {
                double radio, resultado;
                Scanner obj=new Scanner(System.in);
                System.out.println("\tArea Circulo");
                System.out.println("----------------------------");
                System.out.print("Ingresa el radio del circulo: ");
                radio=obj.nextDouble();
                resultado=Math.PI*Math.pow(radio, 2);
                System.out.println("el area del circulo con radio "+radio+" es "+resultado);
            }
            case 5:
            {
                System.exit(0);
            }
            default:
                System.out.println("Opcion Invalida !!!");
        }//fin del switch
        }while (opc != 5); //Fin de while
    }//fin del metodo main ()
}//fin de la clase