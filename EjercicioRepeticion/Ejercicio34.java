package EjercicioRepeticion;

/*
Ej 34: Escribe un programa que pida dos números por teclado y que luego mezcle en dos números
diferentes los dígitos pares y los impares. Se van comprobando los dígitos de la siguiente
manera: primer dígito del primer número, primer dígito del segundo número, segundo dígito
del primer número, segundo dígito del segundo número, tercer dígito del primer número…
Para facilitar el ejercicio, podemos suponer que el usuario introducirá dos números de la
misma longitud y que siempre habrá al menos un dígito par y uno impar. Usa long en lugar
de int donde sea necesario para admitir números largos.
Ejemplo 1:
Por favor, introduzca un número: 9402
Introduzca otro número: 6782
El número formado por los dígitos pares es 640822
El número formado por los dígitos impares es 97
Ejemplo 2:
Por favor, introduzca un número: 137
Introduzca otro número: 909
El número formado por los dígitos pares es 0
El número formado por los dígitos impares es 19379
*/
public class Ejercicio34 {
    public static void main(String[] args) {
        // Declaracion de variables
        System.out.print("Por favor, introduzca un número: ");
        long numeroIntroducido1 = Long.parseLong(System.console().readLine());
        System.out.print("Introduzca otro número: ");
        long numeroIntroducido2 = Long.parseLong(System.console().readLine());
        long numero = numeroIntroducido1;
        long volteado1 = 0;
        int longitud = 0;
        if (numero == 0) {
            longitud = 1;
        }
        while (numero > 0) {
            volteado1 = (volteado1 * 10) + (numero % 10);
            numero /= 10;
            longitud++;
        } // while
        numero = numeroIntroducido2;
        long volteado2 = 0;
        while (numero > 0) {
            volteado2 = (volteado2 * 10) + (numero % 10);
            numero /= 10;
        } // while
        long resultadoPares = 0;
        long resultadoImpares = 0;
        int digito;
        for (int i = 0; i < longitud; i++) {
            digito = (int) (volteado1 % 10);
            if ((digito % 2) == 0) {
                resultadoPares = resultadoPares * 10 + digito;
            } else {
                resultadoImpares = resultadoImpares * 10 + digito;
            }
            digito = (int) (volteado2 % 10);
            if ((digito % 2) == 0) {
                resultadoPares = resultadoPares * 10 + digito;
            } else {
                resultadoImpares = resultadoImpares * 10 + digito;
            }
            volteado1 /= 10;
            volteado2 /= 10;
        }
        System.out.println("El número formado por los dígitos pares es: " + resultadoPares);
        System.out.println("El número formado por los dígitos impares es: " + resultadoImpares);
    }// Fin del metodo main ()
}// Fin de la clase