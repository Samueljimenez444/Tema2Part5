package parte5;

import java.util.Random;
import java.util.Scanner;

public class Ejer5 {

	public static void main(String[] args) {
		// Creamos la variable random rand
		Random rand = new Random();
		// Creamos la variable tipo cadena adivinar que servira para que el usuario vaya
		// indicandole al ordenador los rangos de numeros que puede introducir
		String adivinar;
		// Creamos la variable numero ordenador que sera un entero aleatorio entre 1,100
		// que servira para intentar adivinar el numero del usuario
		int numeroOrdenador = rand.nextInt(1, 101);
		// Variable entera que servira para almacenar el numero del usuario
		int numeroUsuario;
		// Variable entera que servira para definir el rango de los numeros que puede
		// pensar el programa
		int numeroMax = 101;
		// Variable entera que servira para definir el rango de los numeros que puede
		// pensar el programa
		int numeroMin = 1;

		// Creamos el objeto Scanner
		Scanner lectura = new Scanner(System.in);
		// Print que le indica al usuario que hacer
		System.out.println("Piensa en un numero, el ordenador tratara de adivinarlo");
		// Creamos un bulce do-while donde

		do {
			System.out.println(numeroOrdenador);// Print del numero que ha "pensado" el ordenador
			System.out.println("Di mayor, menor o igual para que el ordenador tenga indicios de cual es tu numero"); // Print
																														// que
																														// le
																														// da
																														// ordenes
																														// al
																														// usuario
			adivinar = lectura.next(); // Definimos la variable adivinar en base al input del usuario
			if (adivinar.equalsIgnoreCase("Mayor")) { // Creamos un condicional if donde si adivinar=mayor
				numeroMin = numeroOrdenador + 1; // se establece el numero min como numeroOrdenador+1 para acortar el
													// rango de los numeros y asi facilitar la labor del ordenador
				numeroOrdenador = rand.nextInt(numeroMin, numeroMax); // Se establece totalmente el rango numerico que
																		// puede adivinar el ordenador
			} else if (adivinar.equalsIgnoreCase("Menor")) { // Condicional else-if donde si adivinar=menor
				numeroMax = numeroOrdenador; // numeroMax=numeroOrdenador. Esto servira para establecer el rango
												// numerico a posteriori
				numeroOrdenador = rand.nextInt(numeroMin, numeroMax); // Definimos el rango numerico para facilitar la
																		// labor del ordenador

			} else if (!adivinar.equals("igual"))// Si la cadena introducida no entra en los estandares del programa se
													// le
				// mostrara al usuario que debe introducir una instruccion valida
				System.out.println("Vuelve a introducir una instruccion valida");
		} while (!adivinar.equalsIgnoreCase("Igual"));// El bucle se reproducira mientras la cadena introducida por el
														// usuario sea distinta que igual

		System.out.println("El ordenador ha ganado adivinando tu numero"); // Print que le indica al usuario que el
																			// ordenador ha sido vencido
		lectura.close(); // Cierre Scanner
	}
}