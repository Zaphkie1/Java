package Metodos;

import java.util.Scanner;

import javax.swing.JOptionPane;

/*
Ej7: Determinar si un estudiante aprobo el semestre
ingresando un determinado numero de calificaciones
utiliza JOptionpanel
*/
public class PromedioEstudianteJOption {
    public static void main(String[] args) {
        ingresaDatos();
    }

    private static void ingresaDatos() {
        // Declaracion de variables
        int ncalif;
        String nombre;
        String calif;
        double scalif = 0;
        Scanner in = new Scanner(System.in);
        nombre = JOptionPane.showInputDialog(null, "Ingresa el nombre del estudiante:", "Promedio estudiante",
                JOptionPane.INFORMATION_MESSAGE);
        ncalif = (int) Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa numero de calificaciones",
                "Promedio estudiante", JOptionPane.INFORMATION_MESSAGE));
        for (int i = 1; i <= ncalif; i++) {
            calif = JOptionPane.showInputDialog(null, "Ingresa Calificacion " + i+" : ", JOptionPane.INFORMATION_MESSAGE);
        }
        obtenerPromedio(nombre, scalif, ncalif);
    }

    private static void obtenerPromedio(String nombre, double scalif, int ncalif) {
    }
}
