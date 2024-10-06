package parte1;

import java.util.Scanner;

public class Ejer2 {

	public static void main(String[] args) {
		// Creamos la variable a que sirve para introducir un numero entero y comparar
		int a;
		// Creamos la variable b que sirve para introducir un numero entero y comparar
		int b;
		// Creamos un scanner que lea el input del usuario
		Scanner lectura = new Scanner(System.in);
		// Print que indica al usuario que hacer
		System.out.println("Introduce un numero");
		// Valor de a en funcion del input
		a = lectura.nextInt();
		// Print que le indica al usuario que hacer
		System.out.println("Introduce otro numero");
		// Valor de b en funcion del input
		b = lectura.nextInt();
		/*
		 * Creacion de condicional que comparara los numero para ver si son o no iguales
		 */
		if (a == b)
			System.out.println("Los numeros son iguales");
		else
			System.out.println("Los numeros no son iguales");
		// Cierre Scanner
		lectura.close();

	}

}