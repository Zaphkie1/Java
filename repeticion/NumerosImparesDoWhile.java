package repeticion;
/*
Ej14: Muestra los primeros 100 numeros impares
usando la sentencia Do-While
*/
public class NumerosImparesDoWhile {
    public static void main(String[] args) {
         //Declaracion de variables
         int num=1;//Inicializacion
         System.out.println("------------------------------------\n");
         System.out.println("\tNumeros pares dowhile\n");
         System.out.println("------------------------------------\n");
         do {
             System.out.println(num);
             num+=3;//Incremento
         } while (num <= 100);//Condicion
     }
 }
