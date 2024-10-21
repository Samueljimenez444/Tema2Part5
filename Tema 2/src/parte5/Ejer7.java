package parte5;

import java.util.Scanner;

public class Ejer7 {

	public static void main(String[] args) {
		// Creamos la variable opcion que servira para almacenar la eleccion en cuanto al calculo deseado
		String opcion;
		// Creamos la variable numero1 que servira para almacenar el numero introducido por el usuario
		int numero1;
		// Creamos la variable numero2 que servira para almacenar el numero introducido por el usuario
		int numero2;
		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		//Creamos un bucle do-while
do {
		// Pedir al usuario que ingrese un números
		System.out.print("Introduce el primer número: ");
		numero1 = sc.nextInt();
		// Pedir al usuario que ingrese otro número
		System.out.print("Introduce el segundo número: ");
		numero2 = sc.nextInt();

		// Mostrar las opciones disponibles para que el usuario elija una
		System.out.println("\nSelecciona una opción:");
		System.out.println("A. Sumar los números");
		System.out.println("B. Restar los números");
		System.out.println("C. Multiplicar los números");
		System.out.println("D. Dividir los números");

		// Pedir al usuario que seleccione una opción usando tan solo un caracter ya sea
		// A,a B,b etc
		System.out.print("Introduce la letra de la operación deseada (A, B, C, D): ");
		opcion = sc.next(); // Convertimos la entrada a mayúscula

		// Creamos un condicional multiple Switch
		switch (opcion) {
		case "A": // Si el caracter es A se realizara una Suma
			System.out.println("Resultado de la suma: " + (numero1 + numero2));
			break;
		case "B": // Si el caracter es B se realizara una Resta
			System.out.println("Resultado de la resta: " + (numero1 - numero2));
			break;
		case "C": // Si el caracter es C se realizara una Multiplicacion
			System.out.println("Resultado de la multiplicación: " + (numero1 * numero2));
			break;
		case "D": // Si el caracter es D se realizara una Division
			System.out.println("Resultado de la multiplicación: " + (numero1 / numero2));
			break;
		case "E": // Si el caracter es D se realizara una Division
			break;
		default:
			// Si el usuario ingresa una opción inválida
			System.out.println("Opción incorrecta. Por favor selecciona una opción válida.");
		}
		//Todas estas acciones se repetiran mientras el caracter introducido sea distinto a E
}while(!opcion.equalsIgnoreCase("E"));
//Mostramos al usuario que el programa ha terminado
System.out.println("El programa ha terminado");
		// Cerramos el scanner
		sc.close();

	}

}
