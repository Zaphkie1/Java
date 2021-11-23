package EjercicioRepeticion;
/*
Ej 5: Muestra los números del 320 al 160, contando de 20 en 20 hacia atrás
utilizando un bucle while
*/
public class Ejercicio5 {
    public static void main(String[] args) {
        //Declaracion de variables
        int i=320;
        System.out.println("-------------------------------------");
        System.out.println("\tNumeros While");
        System.out.println("-------------------------------------");
         while(i>=160) {
            System.out.println(i);
            i-=20;
         }//Fin del While
    }//Fin del metodo main ()
}//Fin de la clase