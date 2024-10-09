package parte2;

import java.util.Scanner;

public class Ejer5 {

	public static void main(String[] args) {
		//Creamos la variable Carnet que servira para comprobar el tipo de carnet que tiene el usuario
		String carnet;
		//Creamos el objeto Scanner
		 Scanner sc = new Scanner(System.in);

	        // Le indicamos al usuario que introduzca su correspondiente tipo de carnet
	        System.out.print("Introduce la letra del tipo de carnet (E, D, C1-C5, A, B1-B2): ");
	         carnet = sc.next().toUpperCase(); // Convertir la entrada a mayúsculas

	       //Usamos el condicional multiple switch para comprobar el carnet del usuario
	        switch (carnet) {
	            case "E": //Si carnet="E" el usuario tendra un carnet especial para remolques y se le mostrara en pantalla
	                System.out.println("Remolques");
	                break;
	            case "D": //Si carnet="D" el usuario tendra un carnet especial para conducir autobuses y se le mostrara en pantalla
	                System.out.println("Autobuses");
	                break;
	            case "C1": case "C2": case "C3": case "C4": case "C5": //Si carnet="C1","C2","C3","C4" O "C5" (todo esto "concatenando" case) el usuario tendra un carnet especial para Camiones y se le mostrara en pantalla
	                System.out.println("Camiones");
	                break;
	            case "A": //Si carnet="E" el usuario tendra un carnet especial para Motos y se le mostrara en pantalla
	                System.out.println("Motocicletas");
	                break;
	            case "B1": case "B2": //Si carnet="E" el usuario tendra un carnet especial para coches y se le mostrara en pantalla
	                System.out.println("Automóviles");
	                break;
	            default: //Si el input no corresponde con ningun case el codigo terminara aqui y se mostrara en pantalla que la categoria introducida no esta contemplada
	                System.out.println("Categoría no contemplada");
	        }
	     // Cerramos el scanner
	        sc.close(); 

	}

}
