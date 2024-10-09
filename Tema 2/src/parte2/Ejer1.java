package parte2;

import java.util.Scanner;

public class Ejer1 {

	public static void main(String[] args) {
		//Creamos la variable nota que servira para calificar el numero introducido por el usuario
		int nota;
		//Creamos el objeto scanner 
		  Scanner sc = new Scanner(System.in);

	        // Pedimos al usuario que ingrese una nota entre 0 y 10
	        System.out.print("Introduce una nota entre 0 y 10: ");
	        //Definimos la variable nota en funcion del input del usuario
	        nota = sc.nextInt();

	        // Creamos un condicional multiple donde si
	        switch (nota) {
	            case 0: case 1: case 2: case 3: case 4: //nota=0,1,2,3 o 4 el sistema mostrara insuficiente
	                System.out.println("Insuficiente");
	                break;
	            case 5: //nota=5 el sistema mostrara suficiente
	                System.out.println("Suficiente");
	                break;
	            case 6: //nota=6 el sistema mostrara bien
	                System.out.println("Bien");
	                break;
	            case 7: case 8: //nota=7, 8 el sistema mostrara notable
	                System.out.println("Notable");
	                break;
	            case 9: case 10: //nota=9, 10 el sistema mostrara Sobresaliente
	                System.out.println("Sobresaliente");
	                break;
	            default: //Si no cumple ninguna condicion el codigo le llevara hasta aqui
	                System.out.println("Nota fuera de rango. Debe ser entre 0 y 10.");
	        }
	        
	     // Cerramos el scanner   
	        sc.close(); 
	        
	        
	        
	}

}
