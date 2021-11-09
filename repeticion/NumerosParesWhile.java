package repeticion;
/*
* Ej2: Imprime los 20 primeros numeros pares
* mediante el uso de la sentencia while
*/
public class NumerosParesWhile {
    public static void main(String[] args) {
        //declaracion de variables
        int numero=2; //inicializacion
        while(numero <=40) //condicion
        {
            System.out.print(numero+"\n");
            numero+=2; //numero = numero + 2 ( incremento )
        }//fin del while
    }//fin del metodo main ()
}//fin de la clase