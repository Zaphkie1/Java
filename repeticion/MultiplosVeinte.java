package repeticion;
/*
* Ej 7: Muestra los numeros del 320 al 160,
* contando de 20 en 20 hacia atras medinte el uso de
* la sentencia while
*/
public class MultiplosVeinte {
    public static void main(String[] args) {
            int numero=320;//inicializacion
            while(numero >=160)//condicion
            {
                System.out.print(numero+"\n");
                numero-=20; //numero = numero - 20 ( disminucion )
            }//fin del while
        }//fin del metodo main ()
    }//fin de la clase