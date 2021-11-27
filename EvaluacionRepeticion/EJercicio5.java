package EvaluacionRepeticion;

import java.util.Scanner;

/*
Ej5: Una empresa que se dedica a la venta de desinfacturasingresadactantes necesita un
programa para gestionar las facturas. En cada factura figura: el código del
artículo, la cantidad vendida en litros y el precio por litro. Se pide de 5 facturas
introducidas: Facturación total, cantidad en litros vendidos del artículo y
cuantas facturas se emitieron de más de $1000.00, mostar la información en
formato de tabla (40 pts)
*/
public class EJercicio5 {
    public static void main(String[] args) {
        // Declaracion de variables
        Scanner in = new Scanner(System.in);
        int facturasingresada, cantidadlitros = 0, facturasmil = 0,codigoarticulo, precio, total = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.println("Codigo del articulo: ");
            codigoarticulo = in.nextInt();
            System.out.println("Cantidad de Litros vendida:");
            cantidadlitros = in.nextInt();
            System.out.println("Precio de Litro:");
            precio = in.nextInt();
            facturasingresada = cantidadlitros * precio;
            total = total + facturasingresada;
            if (facturasingresada > 1000) {
                facturasmil++;
            }
        } // fin de for
        System.out.println("Facturacion total: " + total);
        System.out.println("Litros Vendidos: " + cantidadlitros);
        System.out.println("Hay " + facturasmil + " Facturas mayores de 1000");
    }//fin del metodo main ()
}//fin de la clase