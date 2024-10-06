package parte1;

import java.util.Scanner;

public class Ejer5 {

	public static void main(String[] args) {
		// Creacion Scanner
		Scanner lectura = new Scanner(System.in);
		/*
		 * Creamos las variables num1,num2,num3 que serviran como los numeros que vamos
		 * a usar para comparar
		 */
		int num1;
		int num2;
		int num3;
		/*
		 * Creamos las variables que definiran que numero es mayor, menor o el que va en
		 * el medio
		 */
		int mayor;
		int medio;
		int menor;
		/*
		 * Indicamos al usuario que debe introducir mediante prints y definimos el valor
		 * de las variables mediante el print del usuario
		 */
		System.out.print("Introduzca el primer número: ");
		num1 = lectura.nextInt();

		System.out.print("Introduzca el segundo número: ");
		num2 = lectura.nextInt();

		System.out.print("Introduzca el tercer número: ");
		num3 = lectura.nextInt();
		/*
		 * Conjunto de condicionales que ordenaran los numeros de mayo a menor donde
		 * usaremos operadores logicos como && para definir que numero ocupara el lugar
		 * de la variable "nummayor" "nummedio" o "nummenor" para asi asignarlos y poder
		 * ordenarlos correctamente
		 */
		if (num1 >= num2 && num1 >= num3) {
			mayor = num1;
			if (num2 >= num3) {
				medio = num2;
				menor = num3;
			} else {
				medio = num3;
				menor = num2;
			}
		} else if (num2 >= num1 && num2 >= num3) {
			mayor = num2;
			if (num1 >= num3) {
				medio = num1;
				menor = num3;
			} else {
				medio = num3;
				menor = num1;
			}
		} else {
			mayor = num3;
			if (num1 >= num2) {
				medio = num1;
				menor = num2;
			} else {
				medio = num2;
				menor = num1;
			}
		}
//Print del resultado
		System.out.println(mayor + " " + medio + " " + menor);
		// Cierre Scanner
		lectura.close();
	}
}