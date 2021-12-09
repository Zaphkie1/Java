package GuiaMetodosyArreglos;
/*
Ej3: Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos)separados
por espacios. Muestra la media de esos números
*/
public class Ejercicio3 {
    public static void main(String[] args) {
        //Declaracion de variables
        System.out.println("------------------------------------------");
        System.out.println("Numeros aleatorios entre 100 y 199 y media");
        System.out.println("------------------------------------------");

        for (int i = 1; i <= 50; i++) {
            int num =((int)(Math.random()*101)+100);
            double media = num/2;
            System.out.println("La media del numero "+num+ " es = "+media);

        }
    }
}
