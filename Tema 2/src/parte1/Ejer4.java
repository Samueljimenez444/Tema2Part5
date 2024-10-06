package parte1;

import java.util.Scanner;

public class Ejer4 {

	public static void main(String[] args) {
		// Creamos la variable a que servira para comparar dos numeros
		float a;
		// Creamos la variable a que servira para comparar dos numeros
		float b;
		// Creamos el Scanner
		Scanner lectura = new Scanner(System.in);
		/* Le damos valor a las variables en base al input del usuario */
		a = lectura.nextFloat();
		b = lectura.nextFloat();
		/*
		 * Creamos condicionales donde si la variable a<b se indicara que a es mayor que
		 * b si por otra parte b>a se mostrara que b es mayor a "a" por ultimo si a=b se
		 * mostrara que ambos son iguales
		 */
		if (a < b)
			System.out.println("El numero" + a + " Es mayor que " + b);
		else if (b > a)
			System.out.println("El numero" + b + " Es mayor que " + a);
		else
			System.out.println("Los numeros son iguales");
		// Cierre Scanner
		lectura.close();

	}

}