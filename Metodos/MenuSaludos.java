package Metodos;

import javax.swing.JOptionPane;

public class MenuSaludos {
    public static void main(String[] args) {
        // Declaracion de variables
        menu();
    }

    private static void menu() {
    int opc;
    do {
        opc = Integer.parseInt(
                JOptionPane.showInputDialog(null, "1.-Español\n" + "2.-Ingles\n3.-Aleman\n4.-Italiano\n" + "5.-Salir\n",
                        "Menu Saludos", JOptionPane.ERROR_MESSAGE));
        switch(opc) {
        case 1: SaludoSpanish();
            break;
        case 2: SaludoEnglish();
            break;
        case 3: SaludoGerman();
            break;
        case 4: SaludoItaly();
            break;
        case 5:
            System.exit(0);
        default:
            JOptionPane.showMessageDialog(null, "Opcion Invalida", "Error", JOptionPane.ERROR_MESSAGE);
        }// Fin del switch
    }while(opc!=5);
}
    private static void SaludoItaly() {
        JOptionPane.showMessageDialog(null, "Saluti Mundi !!!", "Saludo en Italiano", JOptionPane.INFORMATION_MESSAGE);
        }

    private static void SaludoGerman() {
        JOptionPane.showMessageDialog(null, "Saluti Mundi !!!", "Saludo en Italiano", JOptionPane.INFORMATION_MESSAGE);
    }
    private static void SaludoEnglish() {
        JOptionPane.showMessageDialog(null, "Hello World !!!", "Saludo en Ingles", JOptionPane.INFORMATION_MESSAGE);
    }
    private static void SaludoSpanish() {
        JOptionPane.showMessageDialog(null, "Hola mundo !!!", "Saludo en Español", JOptionPane.INFORMATION_MESSAGE);
    }
}