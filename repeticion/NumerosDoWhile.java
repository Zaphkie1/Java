package repeticion;

public class NumerosDoWhile {
    public static void main(String[] args) {
        //Declaracion de variables
        int num=1;//Inicializacion
        System.out.println("----------------------------\n");
        System.out.println("\tNumeros dowhile\n");
        System.out.println("------------------------------");
        do {
            System.out.println(num);
            num++;//Incremento
        } while (num <= 100);//Condicion
    }
}
