package EjercicioRepeticion;
/*
Ej 2: Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle while.
*/
public class Ejercicio2 {
    public static void main(String[] args) {
        //Declaracion de variables
        int i=0;
        System.out.println("-------------------------------------");
        System.out.println("\tNumeros While");
        System.out.println("-------------------------------------");
         while(i<=100) {
            System.out.println(i);
            i+=5;
         }//Fin del While
    }//Fin del metodo main ()
}//Fin de la clase