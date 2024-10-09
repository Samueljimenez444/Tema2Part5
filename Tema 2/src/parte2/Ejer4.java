package parte2;

import java.util.Scanner;

public class Ejer4 {

	public static void main(String[] args) {
		//Creamos la variable suma que realizara el calculo final de la suma de los numeros de las dos tiradas
	int suma;
	//Creamos la variable valor1 que servira para transformar el valor de la cadena en numero
	int valor1;
	//Creamos la variable valor2 que servira para transformar el valor de la cadena en numero
	int valor2;

	//Creamos la variable tirada1 que actuara como cadena que el usuario introducira para convertir su tirada de dado en formato entero
	String tirada1;
	//Creamos la variable tirada2 que actuara como cadena que el usuario introducira para convertir su segunda tirada de dado en formato entero
	 String tirada2;
	//Creamos el objeto Scanner para leer inputs del usuario
		 Scanner sc = new Scanner(System.in);

	        // Pedir al usuario que ingrese el resultado de la primera tirada en formato cadena ignorando mayusculas y minusculas
	        System.out.print("Introduce el resultado de la primera tirada (UNO, DOS, TRES, CUATRO, CINCO, SEIS): ");
	        //Definimos la variable tirada1 en funcion del input del usuario
	        tirada1 = sc.next().toUpperCase(); // Convertir la entrada a mayúsculas

	        // Pedir al usuario que ingrese el resultado de la segunda tirada en formato cadena ignorando mayusculas y minusculas
	        System.out.print("Introduce el resultado de la segunda tirada (UNO, DOS, TRES, CUATRO, CINCO, SEIS): ");
	       tirada2 = sc.next().toUpperCase(); // Convertir la entrada a mayúsculas

	        /*Damos el valor 0 a las variables para poder realizar la transformacion*/
	        valor1 = 0;
	        valor2 = 0;
	        

	        //Creamos condicional multiple switch donde dependiendo del input en la primera tirada
	        switch (tirada1) {
	            case "UNO": //Si el usuario  introduce "Uno" se convertira esta cadena a numero a traves de la variable valor1 otorgandole el valor de 1
	                valor1 = 1;
	                break;
	            case "DOS": //Si el usuario  introduce "dos" se convertira esta cadena a numero a traves de la variable valor1 otorgandole el valor de 2
	                valor1 = 2;
	                break;
	            case "TRES":
	                valor1 = 3; //Si el usuario  introduce "tres" se convertira esta cadena a numero a traves de la variable valor1 otorgandole el valor de 3
	                break;
	            case "CUATRO": //Si el usuario  introduce "cuatro" se convertira esta cadena a numero a traves de la variable valor1 otorgandole el valor de 4
	                valor1 = 4;
	                break;
	            case "CINCO": //Si el usuario  introduce "cinco" se convertira esta cadena a numero a traves de la variable valor1 otorgandole el valor de 5
	                valor1 = 5;
	                break;
	            case "SEIS": //Si el usuario  introduce "seis" se convertira esta cadena a numero a traves de la variable valor1 otorgandole el valor de 6
	                valor1 = 6;
	                break;
	            default: //Si no se corresponde el input a ningun valor el codigo sera conducido hasta aqui
	                System.out.println("Tirada 1 inválida.");
	               
	        }

	    /*Hacemos el mismo proceso en este condicional switch solo que esta vez solo transformara el valor de la primera tirada introducida por el usuario*/
	        switch (tirada2) {
	            case "UNO":
	                valor2 = 1;
	                break;
	            case "DOS":
	                valor2 = 2;
	                break;
	            case "TRES":
	                valor2 = 3;
	                break;
	            case "CUATRO":
	                valor2 = 4;
	                break;
	            case "CINCO":
	                valor2 = 5;
	                break;
	            case "SEIS":
	                valor2 = 6;
	                break;
	            default: //Si no se corresponde el input a ningun valor el codigo sera conducido hasta aqui
	                System.out.println("Tirada 2 inválida.");
	             
	        }

	        //Realizamos el calculo final para ver el valor total de las dos tiradas sumadas
	        suma = valor1 + valor2;
	        System.out.println("La suma de las dos tiradas es: " + suma);
	     // Cerramos el scanner
	        sc.close(); 

	}

}
