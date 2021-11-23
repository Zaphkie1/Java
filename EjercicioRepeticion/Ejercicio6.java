package EjercicioRepeticion;
/*
Ej 6: Muestra los números del 320 al 160, contando de 20 en 20 utilizando un bucle do-while.
*/
public class Ejercicio6 {
    public static void main(String[] args) {
        //Declaracion de variables
        int i = 320;
        System.out.println("-------------------------------------");
        System.out.println("\tNumeros Do-While");
        System.out.println("-------------------------------------");
        do{
            System.out.println(i);
            i-=20;
        }while(i>=160);
    }//Fin del metodo main ()
}//Fin de la clase
