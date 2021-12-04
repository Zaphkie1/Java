package GuiaMetodosyArreglos;
/*
Ej2:Muestra un numero indeterminado de números enteros aleatorios entre 1 y 100
separados por espacios.
*/
public class Ejercicio2 {
    public static void main(String[] args) {
        System.out.println("-------------------------------------");
        System.out.println("Numeros aleatorios entre 1 y 100");
        System.out.println("-------------------------------------");
        for (int i = 1; i <= 100000; i++) {
            System.out.print((int) (Math.random() * 100 + 1) + " \t");
        }
    }
}
