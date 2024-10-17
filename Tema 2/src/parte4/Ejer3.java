package parte4;

import java.util.Scanner;

public class Ejer3 {

	public static void main(String[] args) {
		// Creamos la variable numero que sera el numero que introduzca el usuario
		int numero;
		// Creamos la variable media que servira para calcular la media de los numeros
		// introducidos
		double media;
		// Creamos la variable suma que servira para ir sumando los numeros introducidos
		// por el usuario
		int suma = 0;
		// Creamos la variable contador que servira para conocer cuantos numeros enteros
		// son introducidos y asi calcular la media
		double contador = 0.0;
		// Creamos el objeto Scanner
		Scanner lectura = new Scanner(System.in);
		// Print que le indica que hacer al usuario
		System.out.println(
				"Introduzca numero positivos y te calcularemos la media (Introduzca un numero negativo para salir del bucle)");
//Definimos la variable numero en funcion del input del usuario
		numero = lectura.nextInt();
		/*
		 * Creamos un bucle while donde mientras el numero introducido por el usuario
		 * sea >=0 sumaremos los numeros que vaya introduciendo el usuario y añadiendo
		 * un numero al contador para que finalmente cuando el usuario introduzca un
		 * numero<0 el usuario saldra del bucle y finalmente se calculara la media total
		 * y se le mostrara en la pantalla
		 */
		while (numero >= 0) {
			System.out.println(
					"Introduzca numero positivos y te calcularemos la media (Introduzca un numero negativo para salir del bucle)");
			suma += numero;
			numero = lectura.nextInt();
			contador++;
		}
		// Calculo aritmetico de la media
		media = suma / contador;
		// Print de la media
		System.out.println(media);
		// Cierre Scanner
		lectura.close();
	}
}
