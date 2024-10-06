package parte1;

import java.util.Scanner;

public class Ejer1 {

	public static void main(String[] args) {
		// Creacion de variable que sirve como numero entero
		int a;
//Creacion Scanner que leera los inputs
		Scanner lectura = new Scanner(System.in);
//Print que indica al usuario que hacer
		System.out.println("Introduce un numero");
//Valor de a en funcion del input
		a = lectura.nextInt();
		/* Condicional que realiza un modulo y calcula si el numero es par o impar */
		if (a % 2 == 0)
			System.out.println("El numero introducido es par");
		else
			System.out.println("El numero introducido no es par (Es impar)");
//Cierre Scanner
		lectura.close();
	}
}