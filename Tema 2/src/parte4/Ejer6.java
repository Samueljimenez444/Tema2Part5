package parte4;

import java.util.Scanner;

public class Ejer6 {

	public static void main(String[] args) {
		/*Definimos 3 variables de tipo double que funcionaran en relacion con la altura. Altura 2 servira para almacenar las alturas que seran introducidas por el usuario. AlturaMax servira para definir la altura maxima introducida por el usuario y lo mismo a pero a la inversa aplicara para alturaMin*/
		double altura2 = 0;
		double alturaMax;
		double alturaMin;
		//Creamos el objeto Scanner
		Scanner lectura = new Scanner(System.in);
		//Print que le indica que hacer al usuario
		System.out.println("Introduce una altura de un arbol");
		//Definimos altura2 en base al siguiente input del usuario
		altura2 = lectura.nextDouble();
		/*Al ser la primera altura introducida la altura maxima y minima sera igual a la altura introducida*/
		alturaMax = altura2;
		alturaMin = altura2;
		while (altura2 != -1) {//Mientras la altura sea distinta a -1 el programa registrara las diferentes alturas introducidas por el usuario
			System.out.println("Introduce una altura de un arbol");
			altura2 = lectura.nextDouble(); 	//Definimos altura2 en base al siguiente input del usuario
			if (altura2 > alturaMax) { //Si la altura introducida es mayor a alturaMax la nueva alturaMax pasara a ser la altura introducida
				alturaMax = altura2;
			} else if (altura2 < alturaMin && altura2 != -1) {//Si por el contrario la altura introducida es la alturaMin y esta es distinta a -1 (Para evitar que cuando el usuario quiera abandonar el programa sea -1 la altura minima) esta se convertira en la altura minima
				alturaMin = altura2;
			}

		}
		//Print de la altura mas alta introducida
		System.out.println(alturaMin);
		//Print de la altura mas baja introducida
		System.out.println(alturaMax);
		//Cierre Scanner
		lectura.close();
	}

}
