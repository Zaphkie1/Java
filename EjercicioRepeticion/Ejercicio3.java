package EjercicioRepeticion;
/*
Ej 3: Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle do-while
*/
public class Ejercicio3 {
    public static void main(String[] args) {
        //Declaracion de variables
        int i = 0;
        System.out.println("-------------------------------------");
        System.out.println("\tNumeros Do-While");
        System.out.println("-------------------------------------");
        do{
            System.out.println(i);
            i+=5;
        }while(i<=100);
    }//Fin del metodo main ()
}//Fin de la clase
