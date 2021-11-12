package repeticion;

/*
* Ej1: Imprime numeros enteros ( 1- 10 )
* mediante el uso de la sentencia while
*/
public class NumerosWhile {
    public static void main(String[] args) {
        // declaracion de variables
        int numero = 1;// inicializacion
        while (numero <= 10)// condicion
        {
            System.out.print(numero + "\n");
            numero++; // numero = numero + 1 ( incremento )
        } // fin del while
    }// fin del metodo main ()
}// fin de la clase
