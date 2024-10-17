package parte4;

import java.util.Scanner;

public class Ejer2 {

	public static void main(String[] args) {
		// Creamos la variable numero que servira para que el usuario pueda introducir
		// numeros negativos
		int numero;
//Creamos la variable contador que servira para contabilizar cuantas veces introduce un numero positivo el usuario
		int contador = 0;
//Creamos el objeto Scanner
		Scanner lectura = new Scanner(System.in);
//Print que indica al usuario que hacer
		System.out.println(
				"Introduce numero positivos para contabilizar cuantos introduces (Introduzca un numero negativo para salir del bucle");
//Definimos la variable numero en funcion del input del usuario
		numero = lectura.nextInt();
		/*
		 * Creamos un bucle while donde mientras que el numero introducido por el
		 * usuario sea >=0 (positivo) el contador ira sumandose a si mismo el numero 1
		 * por cada numero >=0 que el usuario introduzca. Un vez el usuario introduzca
		 * un numero negativo el bucle se rompera y se printeara el nºde numeros
		 * postivos que se ha introducido
		 */
		while (numero >= 0) {
			System.out.println("Introduce mas numero positivos (Introduzca un numero negativo para salir del bucle)");
			numero = lectura.nextInt();
			++contador;
		}
//Print de cuantos numeros enteros se han introducido
		System.out.println(contador);
		// Cierre Scanner
		lectura.close();
	}

}