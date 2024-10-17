package parte4;

import java.util.Scanner;

public class Ejer1 {

	public static void main(String[] args) {
		// Creamos la variable numero que servira como el valor numerico que introducira
		// el usuario
		int numero;
		// Creamos la variable suma la cual nos servira para ir sumando los numeros
		// introducidos por el usuario
		int suma = 0;
		// Creamos el objeto Scanner el cual leera los inputs del usuario
		Scanner lectura = new Scanner(System.in);
		// Prints que le indican al usuario que debe realizar
		System.out.println("Introduzca numeros positivos para sumarlos");
		System.out.println("Introduzca numeros negativos para terminar cuando quieras terminar");
		// Definimos la variable numero en base al input del usuario
		numero = lectura.nextInt();
		/*
		 * Creamos un bucle while donde mientras el numero sea mayor o igual que 0 el
		 * programa sumara los numeros que vaya introduciendo el usuario hasta que este
		 * introduzca un numero negativo para salir del bucle
		 */
		while (numero >= 0) {
			System.out.println("Introduzca numeros positivos para sumarlos");
			suma += numero;
			numero = lectura.nextInt();

		}
		// Print del resultado final de sumas
		System.out.println(suma);
//Cierre Scanner
		lectura.close();
	}
}