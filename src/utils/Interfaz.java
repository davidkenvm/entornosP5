package utils;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Interfaz {
	public static void muestraMensaje(String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje);
	}
	
	public static void muestraMensaje(float f) {
		JOptionPane.showMessageDialog(null, f);
	}
	private static boolean sonNumeros(String cadena) {
		// devuelve true si todos los dígitos de la cadena
		// son suméricos
		String numeros = "0123456789";
		int longNumeros = cadena.length();
		for (int i = 0; i < longNumeros; i++) {
			if (!numeros.contains(cadena.charAt(i)+"")) {
				return false;
			}
		}
		return true;
	}

	public static int pideEntero(String message) {
		// pido el dato por pantalla
		String cadena = JOptionPane.showInputDialog(null, message, "LOS ENLACES", JOptionPane.QUESTION_MESSAGE);
		while (!sonNumeros(cadena)) {
			muestraMensaje("Los datos introducidos no son numéricos");
			// vuelvo a pedirlo hasta que sea correcto
			cadena = JOptionPane.showInputDialog(null, message, "LOS ENLACES", JOptionPane.QUESTION_MESSAGE);
		}
		return Integer.parseInt(cadena);
	}

	public static String pideCadena(String message) {
		return  JOptionPane.showInputDialog(null, message, "LOS ENLACES", JOptionPane.QUESTION_MESSAGE);
	}

	public static double pideDoble(String mensaje) {
		Scanner teclado = new Scanner(System.in);
		boolean incorrecto = true;
		while (incorrecto) {
			try {
				String dato = JOptionPane.showInputDialog(mensaje);
				if (dato == null) {
					JOptionPane.showMessageDialog(null, "No puede ser nulo.");
				}else {
					//INSTRUCCION PELIGROSIIIIISIMA
					double num = Double.parseDouble(dato);
					incorrecto = false;
					return num;
				}
			}catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Tiene que ser un dato numérico\n." + " utiliza '.' para los decimales." );
				incorrecto = true;
			}
			
		}//FIN DEL WHILE
		return 0;
		
	}
}
