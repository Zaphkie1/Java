package Metodos;

import javax.swing.JOptionPane;

/*
Ej6: Realiza operciones de suma,resta,mult y div
mediante el uso de JOption
*/
public class OperacionesJOption {
    public static void main(String[] args) {
        menu();
    }// Fin menu

    private static void menu() {
        int opc;
        do {
            opc = Integer.parseInt(
                    JOptionPane.showInputDialog(null, "1- Suma\n 2-Resta\n3-Multiplicacion\n4-Divicion\n5-Salir",
                            "Menu Operaciones", JOptionPane.INFORMATION_MESSAGE));
            switch (opc) {
                case 1:
                    MenuSuma();
                    break;
                case 2:
                    MenuResta();
                    break;
                case 3:
                    MenuMultiplicacion();
                    break;
                case 4:
                    MenuDivicion();
                    break;
                case 5:
                    System.exit(0);
                default:
                    JOptionPane.showMessageDialog(null, "Opcion Invalida",
                            "ERROR", JOptionPane.ERROR_MESSAGE);
            }// Switch
        } while (opc != 5);
    }// private 1

    private static void MenuSuma() {
        double n1, n2, resultado;
        n1 = Double.parseDouble(
                JOptionPane.showInputDialog(null, "Ingresa el primer numero", "Suma",
                        JOptionPane.QUESTION_MESSAGE));
        n2 = Double.parseDouble(
                JOptionPane.showInputDialog(null, "Ingresa el segundo numero", "Suma",
                        JOptionPane.QUESTION_MESSAGE));
        resultado = n1 + n2;
        JOptionPane.showMessageDialog(null, n1 + " + " + n2 + " = " + resultado,
                "Divicion", JOptionPane.PLAIN_MESSAGE);
    }// Fin de la suma

    private static void MenuResta() {
        double n1, n2, resultado;
        n1 = Double.parseDouble(
                JOptionPane.showInputDialog(null, "Ingresa el primer numero", "Resta",
                        JOptionPane.QUESTION_MESSAGE));
        n2 = Double.parseDouble(
                JOptionPane.showInputDialog(null, "Ingresa el segundo numero", "Resta",
                        JOptionPane.QUESTION_MESSAGE));
        resultado = n1 - n2;
        JOptionPane.showMessageDialog(null, n1 + " - " + n2 + " = " + resultado,
                "Divicion", JOptionPane.PLAIN_MESSAGE);
    }// Fin de la resta

    private static void MenuMultiplicacion() {
        double n1, n2, resultado;
        n1 = Double.parseDouble(
                JOptionPane.showInputDialog(null, "Ingresa el primer numero", "Multiplicacion",
                        JOptionPane.QUESTION_MESSAGE));
        n2 = Double.parseDouble(
                JOptionPane.showInputDialog(null, "Ingresa el segundo numero", "Multiplicacion",
                        JOptionPane.QUESTION_MESSAGE));
        resultado = n1 * n2;
        JOptionPane.showMessageDialog(null, n1 + " * " + n2 + " = " + resultado,
                "Multiplicacion", JOptionPane.PLAIN_MESSAGE);
    }// Fin de la multiplicacion

    private static void MenuDivicion() {
        double n1, n2, resultado;
        n1 = Double.parseDouble(
                JOptionPane.showInputDialog(null, "Ingresa el primer numero", "Divicion",
                        JOptionPane.QUESTION_MESSAGE));
        n2 = Double.parseDouble(
                JOptionPane.showInputDialog(null, "Ingresa el segundo numero", "Divicion",
                        JOptionPane.QUESTION_MESSAGE));
        resultado = n1 / n2;
        JOptionPane.showMessageDialog(null, n1 + " / " + n2 + " = " + resultado,
                "Divicion", JOptionPane.PLAIN_MESSAGE);
    }// Fin de la divicon
}// FIn de la clase