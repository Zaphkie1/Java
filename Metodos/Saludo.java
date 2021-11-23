package Metodos;

import javax.swing.JOptionPane;

public class Saludo {
    public static void main(String[] args) {
        saludo(); //llamar al metodo saludo
    }
    //Definicion de metodo
    private static void saludo() {
    JOptionPane.showMessageDialog(null,
                                "Hola Mundo !!!","Ejemplo saludo",
                                JOptionPane.ERROR_MESSAGE);
    }
}
