package Metodos;

/*
Ej10: Generacion de numeros aleatorios (Random)
*/
public class NumerosRandom {
    public static void main(String[] args) {
        randon1();
        random2();
        random3();
        random4();
        random5();
    }

    private static void random5() {
        // Genera numero aleatorios entre 50 y 60 sin punto decimal
        System.out.println("-------------------------------------");
        System.out.println("Numeros aleatorios entre 50 y 60");
        System.out.println("-------------------------------------");
        for (int i = 1; i <= 10; i++) {
            System.out.println((int) (Math.random() * 11 + 50) + " ");
        }
    }

    private static void random4() {
        // Genera numero aleatorios entre 1 y 10 sin punto decimal
        System.out.println("-------------------------------------");
        System.out.println("Numeros aleatorios entre 1 y 10");
        System.out.println("-------------------------------------");
        for (int i = 1; i <= 10; i++) {
            System.out.println((int) (Math.random() * 10 + 1) + " ");
        }
    }

    private static void random3() {
        // Genera numero aleatorios entre 0 y 10 sin punto decimal
        System.out.println("-------------------------------------");
        System.out.println("Numeros aleatorios entre 0 y 10");
        System.out.println("-------------------------------------");
        for (int i = 1; i <= 10; i++) {
            System.out.println((int) (Math.random() * 10) + " ");
        }
    }

    private static void random2() {
        // Genera numero aleatorios entre 0 y 10
        System.out.println("-------------------------------------");
        System.out.println("Numeros aleatorios entre 0 y 10");
        System.out.println("-------------------------------------");
        for (int i = 1; i <= 10; i++) {
            System.out.println(Math.random() * 10 + " ");
        }
    }

    private static void randon1() {
        System.out.println("-------------------------------------");
        System.out.println("\tNumeros aleatorios");
        System.out.println("-------------------------------------");
        for (int i = 1; i <= 10; i++) {
            System.out.println(Math.random());
        }
    }
}