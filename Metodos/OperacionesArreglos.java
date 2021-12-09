package Metodos;

import java.util.Scanner;

/*
Ej13: Realiza operciones basicas con arreglos
mediante el uso de metodos y generacion de numeros
aleatorios
*/
public class OperacionesArreglos {
    public static void main(String[] args) {
        menu();
    }

    private static void menu() {
        int opc;
        int x[]=new int[10];
        int y[]=new int[10];
        int z[]=new int[10];
        Scanner in = new Scanner(System.in);
        do {
            System.out.println("-------------------------------------");
            System.out.println("\tMenu arreglos");
            System.out.println("-------------------------------------");
            System.out.println("1.-Inicializa");
            System.out.println("2.-Suma");
            System.out.println("3.-Resta");
            System.out.println("4.-Multiplicacion");
            System.out.println("5.-Intercalacion");
            System.out.println("6.-Salir");
            System.out.println("Selecciona una opcion: ");
            opc = in.nextInt();
            switch (opc) {
                case 1:{
                    for(int i=0;i<x.length;i++){
                        x[i]=(int)(Math.random()*20+1);
                        y[i]=(int)(Math.random()*20+1);
                    }
                }
                    break;
                case 2:
                    sumaArreglos(x,y,z);
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.out.println("Opcion invalida");
            }// Fin del switch
        } while (opc != 6);
    }

    private static void sumaArreglos(int[] x, int[] y, int[] z) {
        //suma x[] + y[] = z[]
        for(int i=0;i<x.length;i++){
            z[i]=x[i]+y[i];
    }
    System.out.println("-------------------------------------");
    System.out.println("\tDatos de los arreglos");
    System.out.println("-------------------------------------");
    for(int i=0;i<x.length;i++){
        System.out.println(x[i]+"\t"+y[i]+"\t"+z[i]);
    }
}
}