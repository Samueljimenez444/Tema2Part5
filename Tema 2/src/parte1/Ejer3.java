package parte1;

import java.util.Scanner;

public class Ejer3 {

	public static void main(String[] args) {
		// Creamos variable numero que servira para saber si ese numero introducido es
		// nulo o no
		float numero;
		// Creacion Scanner
		Scanner lectura = new Scanner(System.in);
		// Le da valor a la variable numero en funcion del input del usuario
		numero = lectura.nextFloat();
		/*
		 * Creacion linea condicionales donde si el numero>1 el numero sera nulo,
		 * por otra parte si la primera afirmacion es falsa y numero<-1 el numero
		 * sera casi nulo, si el numero introducido es 0 se mostrara al usuario y por
		 * ultimo si todo esto es falso el numero no sera casi nulo
		 */
		 if (numero > -1 && numero < 1 && numero != 0) {
	            System.out.println("El número " + numero + " es un número casi-nulo.");
	        } else {
	            System.out.println("El número " + numero + " no es un número casi-nulo.");
		// Cierra Scanner
		lectura.close();
	        }
	}
}