package parte4;

import java.util.Scanner;

public class Ejer5 {

	public static void main(String[] args) {
		//Creamos la variable entera edad y la inicializamos en 1 para que pueda cumplir la condicion de nuestro bloque while. Esta variable almacenara las edades que introduzca el usuario
		int edad = 1;
		//Creamos la variable entera edadMayor que servira para contabilizar cuantos alumnos son mayores de edad
		int edadMayor = 0;
		//Creamos la variable entera suma que servira para calcular posteriormente la media de edades
		int suma = 0;
		//Creamos la variable tipo double media que servira para calcular la media de edades introducidas
		double media = 0.0;
		//Creamos la variable tipo double media que servira para calcular la media de edades introducidas siendo el contador el numero de edades introducidas por el usuario
		double contador = -0.0;
		//Creamos el objeto Scanner
		Scanner lectura = new Scanner(System.in);
		//Print que le indica al usuario que debe hacer
		System.out.println("Introduce las edades de los alumnos");
		//Definimos edad en base al siguiente input del usuario
		edad = lectura.nextInt();
		//Si edad>=18 aumentamos en 1 la cantidad de la variable edadMayor es decir si algun alumno es mayor de edad o no
		if (edad >= 18) {
			edadMayor++;
		}
		while (edad >= 0) {//Mientras edad>=0 (Cuando se introduzca 0 el programa finalizara
			suma += edad; //Se calcula la suma de las edades introducidas
			System.out.println("Introduce otra edad"); //Print que le indica al usuario que hacer
			edad = lectura.nextInt();  //Definimos edad en base al siguiente input del usuario
			++contador; //Aumentamos en 1 el contador
			if (edad >= 18) {//Si edad>=18 aumentamos en 1 la cantidad de la variable edadMayor es decir si algun alumno es mayor de edad o no
				edadMayor++;
			}
		}
		//Calculamos la media de edades
		media = suma / contador;
		/*Print de la media y de los alumnos mayores de edad*/
		System.out.println("Hay en total " +edadMayor + " alumnos mayores de edad");
		System.out.println("La media de edad es igual a: " + media);
		//Cerramos el scanner
		lectura.close();
	}
}
