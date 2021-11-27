package Metodos;

import javax.swing.JOptionPane;

/*
Ej3: crear un menu para calcular areas y
perimetros de  las figuras circulo triangulo
rectangulo y cuadrado utilizando metodos
*/
public class MenuFiguras {
	public static void main(String[] args) {
		menu();
	}// Fin menu

	private static void menu() {
		int opc;
		do {
			opc = Integer.parseInt(JOptionPane.showInputDialog(null, "1- Areas\n 2-Perimetros\n 3-Salir",
					"Menu perimetros y Areas", JOptionPane.INFORMATION_MESSAGE));
			switch (opc) {
				case 1:
					MenuAreas();
					break;
				case 2:
					MenuPerimetros();
					break;
				case 3:
					System.exit(0);
				default:
					JOptionPane.showMessageDialog(null, "Opcion Invalida",
							"ERROR", JOptionPane.ERROR_MESSAGE);
			}// Switch
		} while (opc != 3);
	}// private 1

	private static void MenuAreas() {
		int opc;
		do {
			opc = Integer.parseInt(JOptionPane.showInputDialog(null, "1- Circulo\n 2-Triangulo\n 3-Rectangulo\n"
					+ " 4-Cuadrado\n 5-Volver",
					"Menu Areas", JOptionPane.INFORMATION_MESSAGE));
			switch (opc) {
				case 1:
					AreaCirculo();
					break;
				case 2:
					AreaTriangulo();
					break;
				case 3:
					AreaRectangulo();
					break;
				case 4:
					AreaCuadrado();
					break;
				case 5:
					menu();
				default:
					JOptionPane.showMessageDialog(null, "Opcion Invalida",
							"ERROR", JOptionPane.ERROR_MESSAGE);
			}// switch
		} while (opc != 5);
	}// private ma

	private static void AreaCuadrado() {
		// Declaracion de variables
		double lado, area;
		lado = Double.parseDouble(
				JOptionPane.showInputDialog(null, "Ingresa Valor lado", "Area Cuadrado", JOptionPane.QUESTION_MESSAGE));
		area = lado * lado;
		JOptionPane.showMessageDialog(null, format(area), "Area Cuadrado", JOptionPane.PLAIN_MESSAGE);
	}// areaCuadrado

	private static void AreaRectangulo() {
		// Declaracion de variables
		double area, lado, ancho;
		lado = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa Valor de lado", "Area Rectangulo",
				JOptionPane.QUESTION_MESSAGE));
		ancho = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa Valor de ancho", "Area Rectangulo",
				JOptionPane.QUESTION_MESSAGE));
		area = lado * ancho;
		JOptionPane.showMessageDialog(null, format(area), "Area Rectangulo", JOptionPane.PLAIN_MESSAGE);
	}// areaRectangulo

	private static void AreaTriangulo() {
		// Declaracion de variables
		double area, base, altura;
		base = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa Valor de base", "Area Triangulo",
				JOptionPane.QUESTION_MESSAGE));
		altura = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa Valor de altura", "Area Triangulo",
				JOptionPane.QUESTION_MESSAGE));
		area = base * altura;
		JOptionPane.showMessageDialog(null, format(area), "Area Rectangulo", JOptionPane.PLAIN_MESSAGE);
	}// areaTriangulo

	private static void AreaCirculo() {
		// Declaracion de variables
		double area, radio;
		radio = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa Valor de Radio", "Area Circulo",
				JOptionPane.QUESTION_MESSAGE));
		area = Math.PI * Math.pow(radio, 2);
		JOptionPane.showMessageDialog(null, format(area), "Area Circulo", JOptionPane.PLAIN_MESSAGE);
	}// areacirculo

	private static void MenuPerimetros() {
		int opc;
		do {
			opc = Integer.parseInt(JOptionPane.showInputDialog(null, "1- Circulo\n 2-Triangulo\n 3-Rectangulo\n"
					+ " 4-Cuadrado\n 5-Volver",
					"Menu Perimetros", JOptionPane.INFORMATION_MESSAGE));
			switch (opc) {
				case 1:
					PerimetroCirculo();
					break;
				case 2:
					PerimetroTriangulo();
					break;
				case 3:
					PerimetroRectangulo();
					break;
				case 4:
					PerimetroCuadrado();
					break;
				case 5:
					menu();
				default:
					JOptionPane.showMessageDialog(null, "Opcion Invalida",
							"ERROR", JOptionPane.ERROR_MESSAGE);
			}// switch
		} while (opc != 5);
	}// private mp

	private static void PerimetroCuadrado() {
		// Declaracion de variables
		double perimetro, lado;
		lado = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa Valor de lado", "Perimetro Cuadrado",
				JOptionPane.QUESTION_MESSAGE));
		perimetro = lado * 4;
		JOptionPane.showMessageDialog(null, format(perimetro), "Perimetro Cuadrado", JOptionPane.PLAIN_MESSAGE);
	}// perimetroCuadrado

	private static void PerimetroRectangulo() {
		// Declaracion de variables
		double perimetro, ladoa, ladob;
		ladoa = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa Valor de lado A", "Perimetro Rectangulo",
				JOptionPane.QUESTION_MESSAGE));
		ladob = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa Valor de lado B", "Perimetro Cuadrado",
				JOptionPane.QUESTION_MESSAGE));
		perimetro = ladoa + ladoa + ladob + ladob;
		JOptionPane.showMessageDialog(null, format(perimetro), "Perimetro Rectangulo", JOptionPane.PLAIN_MESSAGE);
	}// perimetroRectangulo

	private static void PerimetroTriangulo() {
		// Declaracion de variables
		double perimetro, lado;
		lado = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa Valor de lado", "Perimetro Cuadrado",
				JOptionPane.QUESTION_MESSAGE));
		perimetro = lado * 3;
		JOptionPane.showMessageDialog(null, format(perimetro), "Perimetro Triangulo", JOptionPane.PLAIN_MESSAGE);
	}// perimetroTriangulo

	private static void PerimetroCirculo() {
		// Declaracion de variables
		double perimetro, area, radio;
		radio = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa Valor de Radio", "Perimetro Circulo",
				JOptionPane.QUESTION_MESSAGE));
		perimetro = 2 * Math.PI * radio;
		JOptionPane.showMessageDialog(null, format(perimetro), "Perimetro Circulo", JOptionPane.PLAIN_MESSAGE);
	}// perimetroCirculo

	private static Object format(double perimetro) {
		return null;
	}
}// Fin class