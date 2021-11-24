package EjercicioRepeticion;
/*
Ej 22: Muestra por pantalla todos los números primos entre 2 y 100, ambos incluidos.
*/
public class Ejercicio22 {
    public static void main(String[] args) {
        System.out.println("-------------------------------------");
        System.out.println("Numeros primos estre 2 y 100");
        System.out.println("-------------------------------------");
    boolean esPrimo = true;
    int n,i;
    for (n = 2; n <= 100; n++) {
      // comprueba si n es primo
      esPrimo = true;
      for (i = 2; i < n; i++) {
        if (n % i == 0) {
          esPrimo = false;
        }
      }
      if (esPrimo) {
        System.out.print(n + " ");
      }
    }
    System.out.println();
    }// Fin del metodo main ()
}// Fin de la clase