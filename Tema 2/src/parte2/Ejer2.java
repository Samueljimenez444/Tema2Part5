package parte2;

import java.util.Scanner;

public class Ejer2 {

	public static void main(String[] args) {
		//Creamos la variable dia que servira para conocer el dia que el usuario quiere
		int dia;
		//Creamos el objeto Scanner
		 Scanner sc = new Scanner(System.in);

	        // Pedir al usuario que ingrese un número del 1 al 7
	        System.out.print("Introduce un número entre 1 y 7: ");
	        //Definimos la variable dia en funcion del input del usuario
	        dia = sc.nextInt();

	        // Creamos condicional multiple donde
	        switch (dia) {
	            case 1: //dia=1 el sistema mostrara Lunes
	                System.out.println("Lunes");
	                break;
	            case 2: //dia=2 el sistema mostrara Martes
	                System.out.println("Martes");
	                break;
	            case 3: //dia=3 el sistema mostrara Miercoles
	                System.out.println("Miércoles");
	                break;
	            case 4: //dia=4 el sistema mostrara Jueves
	                System.out.println("Jueves");
	                break;
	            case 5: //dia=5 el sistema mostrara Viernes
	                System.out.println("Viernes");
	                break;
	            case 6: //dia=6 el sistema mostrara Sabado
	                System.out.println("Sábado");
	                break;
	            case 7: //dia=7 el sistema mostrara Domingo
	                System.out.println("Domingo");
	                break;
	            default: //Si no coincide ningun valor se mostrara este print
	                System.out.println("Número fuera de rango. Debe ser entre 1 y 7.");
	        }

	        sc.close(); // Cerramos el scanner

	}

}
