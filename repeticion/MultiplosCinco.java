package repeticion;
/*
* Ej6: Imprime los multiplos de 5 de 0 a 100
* utilizando la centencia while
*/
public class MultiplosCinco {
    public static void main(String[] args) {
        //declaracion de variables
        int numero=5;//inicializacion
        while(numero <=100)//condicion
        {
            System.out.print(numero+"\n");
            numero+=5; //numero = numero + 5 ( incremento )
        }//fin del while
    }//fin del metodo main ()
}//fin de la clase