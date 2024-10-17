package parte4;

import java.util.Scanner;

public class Ejer4 {

	public static void main(String[] args) {
		// Creamos la variable numero que servira para conocer los numeros introducidos
		// por el usuario
		int numero;
		/*
		 * Creamos las variables contador, contador2 y contador3 (QUE SERA DE TIPO
		 * DOUBLE PARA REALIZAR UNA CONVERSION IMPLICITA A DECIMAL Y ASI MOSTRAR LA
		 * MEDIA EXACTA) que serviran para ir contabilizando las veces
		 */
		int contador = 0;
		int contador2 = 0;
		double contador3 = 0.0;
		/*
		 * Creamos el conjunto de variable suma y suma2 que serviran para realizar los
		 * calculos de las distintas sumas de numeros enteros( en el caso de suma) y
		 * numeros negativos (en el caso de suma 2 donde suma2 a su vez sera una
		 * variable tipo double para realiar una conversion a decimal y asi mostrar la
		 * media exacta con decimales)
		 */
		int suma = 0;
		double suma2 = 0.0;
		// Creamos la variable mediaNegativos la cual servira para calcular la media de
		// numeros negativos introducidos
		double mediaNegativos = 0.0;
//Creamos el objeto Scanner
		Scanner lectura = new Scanner(System.in);
		// Mostramos al usuario que tiene que hacer
		System.out.println("Introduce 10 numeros");
//Definimos la variable numero en funcion a lo que introduzca el usuario
		numero = lectura.nextInt();
//Sumamos +1 a contador
		++contador;
//Realizamos la suma del numero introducido
		suma += numero;
		/*
		 * Creamos un bucle while donde minetras contador sea<10 el programa leera hasta
		 * 10 numeros introducidos por el usuario, por cada numero introducido contador
		 * incrementara en +1 para asi contabilizar cuantos numeros son introducidos
		 */
		while (contador < 10) {
			System.out.println("Introduzca otro numero");
			numero = lectura.nextInt();
			if (numero > 0) { // Si el numero introducido es >0 el programa sumara el numero introducido a la
								// variable suma
				suma += numero;

			} else if (numero < 0) {// Si el numero introducido es<0 el programa sumara el numero negativo
									// introducido en la variable suma2 y a su vez aumentara la variable contador3
									// en +1 para contabiliazar el nº de numeros negativos introducidos

				suma2 += numero;

				++contador3;

			} else {// Si el numero ==0 el contador2 (contador de cuantos 0 hemos introducido)
					// incrementara en 1

				++contador2;

			}
			++contador;
		}
//Calculamos la media numerica
		mediaNegativos = suma2 / contador3;
		/* Mostramos en pantalla todos los calculos realizados */
		System.out.println("La suma de numeros positivos es igual a " + suma);
		System.out.println("La suma de media de numeros negativos es igual a " + mediaNegativos);
		System.out.println("El numero de 0 introducidos es de " + contador2);
		// Cerramos el Scanner
		lectura.close();
	}
}