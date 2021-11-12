package repeticion;

/*
Ej13: Muestra los primeros 100 numeros pares
usando la sentencia Do-While
*/
public class Numerosparesdowhile {
    public static void main(String[] args) {
        // Declaracion de variables
        int num = 2;// Inicializacion
        System.out.println("------------------------------------\n");
        System.out.println("\tNumeros pares dowhile\n");
        System.out.println("------------------------------------\n");
        do {
            System.out.println(num);
            num += 2;// Incremento
        } while (num <= 200);// Condicion
    }
}
