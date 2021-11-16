package repeticion;

/*
Ej22: Muestra en pantalla la potencia de los primeros
diez numeros eteros mediante el uso de la senencia for
de la siguiente forma:
---------------------------
1     2     3     4     5
---------------------------
1     1     1     1     1
2     3     8     16    32
..    ..    ..    ..    ..

*/
public class PotenciaFor {
    public static void main(String[] args) {
        // Declaracion de variables
        System.out.println("------------------------------------");
        System.out.println("1\t2\t3\t4\t5\n");
        System.out.println("------------------------------------");
        for(int i=1;i<=10;i++){
            System.out.println((int)Math.pow(i, 1)+"\t"
            +(int)Math.pow(i, 2)+"\t"
            +(int)Math.pow(i, 3)+"\t"
            +(int)Math.pow(i, 4)+"\t"
            +(int)Math.pow(i, 5));
        }
    }
}
