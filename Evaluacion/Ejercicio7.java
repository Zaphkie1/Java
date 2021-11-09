package Evaluacion;

import java.util.Scanner;

/*
La compañía “Fumigas S.C”, utiliza aviones para fumigar las cosechas
contra una gran variedad de plagas. La cantidad que la compañía cobra a los
granjeros depende de que es lo que se desea fumigar y de cuantas hectareas
desea que se fumiguen de acuerdo con la siguiente distribucion.Tecnológico Nacional de México
Instituto Tecnológico de Zacatecas
        Tipo 1: Fumigación contra malas hierbas $10.00 por hectárea.
        Tipo 2: Fumigación contra langostas $20.00 por hectárea.
        Tipo 3: Fumigación contra gusanos $30.00 por hectárea.
        Tipo 4: Fumigación contra todo lo anterior $50.00 por hectárea.
Si el área a fumigar es entre 500 y 1000 hectáreas, el granjero obtiene un
5%, de descuento, si el area es entre 1001 y 2000 hectáreas el granjero
obtiene un 10% de descuento, si el area es entre 2001 o mas el granjero
obtiene un descuento del 20%. Elabore un programa que lea la siguiente
información: nombre del granjero, tipo de fumigación solicitada.
*/
public class Ejercicio7 {
    public static void main(String[] args) {
        //Declaracion de variables
        int opc,hectareas;
        double descuento,valor,total;
        String nombre;
        Scanner in = new Scanner(System.in);
        System.out.println("\tFumigaciones");
        System.out.println("nombre del granjero:");
        nombre = in.nextLine();
        System.out.println("Ingresa el numero de hectareas");
        hectareas = in.nextInt();
        System.out.println("----------------------------");
        System.out.println("1. - Fumigación contra malas hierbas $10.00 por hectárea.");
        System.out.println("2. - Fumigación contra langostas $20.00 por hectárea.");
        System.out.println("3. - Fumigación contra gusanos $30.00 por hectárea.");
        System.out.println("4. - Fumigación contra todo lo anterior $50.00 por hectárea.");
        System.out.print("Seleccionar opcion: ");
        opc=in.nextInt();
        switch(opc)
        {
            case 1:
            {
                if(hectareas<=1000 && hectareas>=500);
                {
                descuento=5;
                valor=10.00*(double)hectareas;
                total=valor-(valor*0.05);
                System.out.println("El granjero "+nombre+ " solicito el tipo de fumigacion"+opc);
                System.out.printf("El total a pagar es de %.2f",total);
                }
                if(hectareas<=2000 && hectareas>1000);
                {
                descuento=5;
                valor=10.00*(double)hectareas;
                total=valor-(valor*0.05);
                System.out.println("El granjero "+nombre+ " solicito el tipo de fumigacion"+opc);
                System.out.printf("El total a pagar es de %.2f",total);
                }
                if(hectareas>2000);
                {
                descuento=5;
                valor=10.00*(double)hectareas;
                total=valor-(valor*0.05);
                System.out.println("El granjero "+nombre+ " solicito el tipo de fumigacion"+opc);
                System.out.printf("El total a pagar es de %.2f",total);
                }

            }
            break;
            case 2:
            {
                if(hectareas<=1000 && hectareas>=500);
                {
                descuento=5;
                valor=20.00*(double)hectareas;
                total=valor-(valor*0.05);
                System.out.println("El granjero "+nombre+ " solicito el tipo de fumigacion"+opc);
                System.out.printf("El total a pagar es de %.2f",total);
                }
                if(hectareas<=2000 && hectareas>1000);
                {
                descuento=5;
                valor=20.00*(double)hectareas;
                total=valor-(valor*0.05);
                System.out.println("El granjero "+nombre+ " solicito el tipo de fumigacion"+opc);
                System.out.printf("El total a pagar es de %.2f",total);
                }
                if(hectareas>2000);
                {
                descuento=5;
                valor=20.00*(double)hectareas;
                total=valor-(valor*0.05);
                System.out.println("El granjero "+nombre+ " solicito el tipo de fumigacion"+opc);
                System.out.printf("El total a pagar es de %.2f",total);
                }

            }
            break;
            case 3:
            {
                if(hectareas<=1000 && hectareas>=500);
                {
                descuento=5;
                valor=30.00*(double)hectareas;
                total=valor-(valor*0.05);
                System.out.println("El granjero "+nombre+ " solicito el tipo de fumigacion"+opc);
                System.out.printf("El total a pagar es de %.2f",total);
                }
                if(hectareas<=2000 && hectareas>1000);
                {
                descuento=5;
                valor=30.00*(double)hectareas;
                total=valor-(valor*0.05);
                System.out.println("El granjero "+nombre+ " solicito el tipo de fumigacion"+opc);
                System.out.printf("El total a pagar es de %.2f",total);
                }
                if(hectareas>2000);
                {
                descuento=5;
                valor=30.00*(double)hectareas;
                total=valor-(valor*0.05);
                System.out.println("El granjero "+nombre+ " solicito el tipo de fumigacion"+opc);
                System.out.printf("El total a pagar es de %.2f",total);
                }

            }
            break;
            case 4:
            {
                if(hectareas<=1000 && hectareas>=500);
                {
                descuento=5;
                valor=50.00*(double)hectareas;
                total=valor-(valor*0.05);
                System.out.println("El granjero "+nombre+ " solicito el tipo de fumigacion"+opc);
                System.out.printf("El total a pagar es de %.2f",total);
                }
                if(hectareas<=2000 && hectareas>1000);
                {
                descuento=5;
                valor=50.00*(double)hectareas;
                total=valor-(valor*0.05);
                System.out.println("El granjero "+nombre+ " solicito el tipo de fumigacion"+opc);
                System.out.printf("El total a pagar es de %.2f",total);
                }
                if(hectareas>2000);
                {
                descuento=5;
                valor=50.00*(double)hectareas;
                total=valor-(valor*0.05);
                System.out.println("El granjero "+nombre+ " solicito el tipo de fumigacion"+opc);
                System.out.printf("El total a pagar es de %.2f",total);
                }

            }
            break;
            
        }//fin del switch
    }//fin del metodo main ()    
}//fin de la clase