package parte3;

import java.util.Scanner;

public class Ejer1 {

	public static void main(String[] args) {
		// Creamos la variable entera numero que servira para almacenar el numero que
		// introduzca el usuario
		int numero;
		// Creamos el objeto Scanner
		Scanner lectura = new Scanner(System.in);
		// Print que le indica al usuario que debe hacer
		System.out.println("Introduzca un numero");
		// Definimos la variable numero en funcion del input del usuario
		numero = lectura.nextInt();
		// Creamos un condicional simple if que deriva en varios if else donde
		if (numero > 9999 || numero < 0) { /*
											 * Si el numero introducido queda fuera de ese rango el programa le indicara
											 * al usuario que introduzca un numero correcto
											 */
			System.out.println("El numero introducido no es valido");
		} else if (numero < 100 && numero % 10 == numero / 10) {// Si el numero introducido es <100 y su resto dividido
																// entre 10 es igual a su primer digito tras dividirlo
																// entre 10 (es decir su ultimo y primer digito
																// coinciden) el numero sera capicua
			System.out.println("El numero es capicua");
		} // Si se cumple el requisito se le mostrara al usuario que el numero que
			// introducido es capicua
		else if (numero < 100 && numero % 10 != numero / 10) {
			System.out.println("El numero no es capicua");
		} // Si se cumple el requisito se le mostrara al usuario que el numero que
			// introducido no es capicua
		else if (numero > 100 && numero < 1000 && numero % 100 == numero / 100) { // Si el numero introducido se
																					// encuentra dentro del rango de
																					// valores y cumple los requisitos
																					// introducidos pasara por la
																					// condicion llevandole al print
			System.out.println("El numero es capicua"); // Si se cumple el requisito se le mostrara al usuario que el
														// numero que introducido es capicua
		} else if (numero > 100 && numero < 1000 && numero % 100 != numero / 100) { // Si el numero introducido se
																					// encuentra dentro del rango de
																					// valores y cumple los requisitos
																					// introducidos pasara por la
																					// condicion llevandole al print
			System.out.println("El numero no es capicua");
		} // Si se cumple el requisito se le mostrara al usuario que el numero que
			// introducido no es capicua
		else if (numero > 1000 && numero < 10000 && numero % 1000 == numero / 1000 && numero % 100 == numero % 10) {
			System.out.println("El numero es capicua"); // Si se cumple el requisito se le mostrara al usuario que el
														// numero que introducido es capicua
		} else if (numero > 1000 && numero < 10000 && numero % 1000 != numero / 1000 || numero % 100 != numero % 10) { // Si
																														// el
																														// numero
																														// introducido
																														// se
																														// encuentra
																														// dentro
																														// del
																														// rango
																														// de
																														// valores
																														// y
																														// cumple
																														// los
																														// requisitos
																														// introducidos
																														// pasara
																														// por
																														// la
																														// condicion
																														// llevandole
																														// al
																														// print
			System.out.println("El numero no es capicua");
		}
		lectura.close();
	}
}
