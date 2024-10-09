package parte2;

import java.util.Scanner;

public class Ejer3 {

	public static void main(String[] args) {
		//Creamos la variable numero1
		int numero1;
		//Creamos la variable numero2
		int numero2;
		//Creamos el Scanner
		  Scanner sc = new Scanner(System.in);

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

	        // Pedir al usuario que seleccione una opción usando tan solo un caracter ya sea A,a B,b etc
	        System.out.print("Introduce la letra de la operación deseada (A, B, C, D): ");
	        char opcion = sc.next().toUpperCase().charAt(0);  // Convertimos la entrada a mayúscula

	        // Creamos un condicional multiple Switch
	        switch (opcion) {
	            case 'A': //Si el caracter es A se realizara una Suma
	                System.out.println("Resultado de la suma: " + (numero1 + numero2));
	                break;
	            case 'B': //Si el caracter es B se realizara una Resta
	                System.out.println("Resultado de la resta: " + (numero1 - numero2));
	                break;
	            case 'C': //Si el caracter es C se realizara una Multiplicacion
	                System.out.println("Resultado de la multiplicación: " + (numero1 * numero2));
	                break;
	            case 'D': //Si el caracter es D se realizara una Division
	                break;
	            default:
	                // Si el usuario ingresa una opción inválida
	                System.out.println("Opción incorrecta. Por favor selecciona una opción válida.");
	        }

	     // Cerramos el scanner   
	        sc.close(); 

	}

}
