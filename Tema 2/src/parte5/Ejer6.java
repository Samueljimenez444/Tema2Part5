package parte5;

import java.util.Scanner;

public class Ejer6 {

	public static void main(String[] args) {
		//Creamos la variable tipo cadena jugador1 que servira para almacenar la eleccion del jugador1
		String jugador1 ;
		//Creamos la variable tipo cadena jugador2 que servira para almacenar la eleccion del jugador2
		String jugador2 ;
		//Creamos el objeto scanner
		Scanner lectura = new Scanner(System.in);
		
	/*Creamos una sucesion de bucles do-while*/
		do {
			do {
				//Print que le indica al usuario que debe elegir entre piedra papel o tijera
				System.out.println("Introduce Piedra Papel o Tijera (Jugador 1)");
				//Definimos la variable en funcion del input del usuario
				jugador1 = lectura.next();
				//Estas acciones se realizaran consecutivamente en forma de bucle mientras el usuario no introduzca Piedra, papel o tijera cuando se introduzca uno de estos valores se finalizara el bucle
			} while (!jugador1.equalsIgnoreCase("TIJERA") && !jugador1.equalsIgnoreCase("PAPEL")
					&& !jugador1.equalsIgnoreCase("PIEDRA"));
			do {
				//Print que le indica al usuario que debe elegir entre piedra papel o tijera
				System.out.println("Introduce Piedra Papel o Tijera (Jugador 2");
				//Definimos la variable en funcion del input del usuario
				jugador2 = lectura.next();
				//Estas acciones se realizaran consecutivamente en forma de bucle mientras el usuario no introduzca Piedra, papel o tijera cuando se introduzca uno de estos valores se finalizara el bucle
			} while (!jugador2.equalsIgnoreCase("TIJERA") && !jugador2.equalsIgnoreCase("PAPEL")
					&& !jugador2.equalsIgnoreCase("PIEDRA"));
			//Se crea un condicional if donde si la eleccion de un jugador equivale a la del otro
			if (jugador1.equalsIgnoreCase(jugador2)) {
				//Se mostrara el resultado
				System.out.println("Empate");
				//Condicional else if donde si sucede un escenario donde gana el jugador 1 
			} else if (jugador1.equalsIgnoreCase("Piedra") && jugador2.equalsIgnoreCase("Tijera")  || (jugador1.equalsIgnoreCase("Papel") && jugador2.equalsIgnoreCase("Piedra")) || (jugador1.equalsIgnoreCase("Tijera") && jugador2.equalsIgnoreCase("Papel"))) {
				//Se muestra el resultado
				System.out.println("Ganador Jugador 1");
				//Instrucciones para salir del bucle al usuario
			System.out.println("Pulsad S para seguir jugando o N para terminar");
			/*Se vuelve a preguntar a los usuarios sus elecciones*/
				jugador1 = lectura.next();
				//Instrucciones para salir del bucle al usuario
				System.out.println("Pulsad S para seguir jugando o N para terminar");
				jugador2 = lectura.next();
				//Condicional else donde si sucede cualquier otra posibilidad
			} else
				//Se muestra el resultado
				System.out.println("Gana Jugador 2");
			/*Mostramos al usuario otra vez las instrucciones para seguir jugando o salir del bucle*/
			System.out.println("Pulsad S para seguir jugando o N para terminar");
			jugador1 = lectura.next();
			System.out.println("Pulsad S para seguir jugando o N para terminar");
			jugador2 = lectura.next();
			//El juego se seguira repitiendo hasta que el jugador 1 o jugador 2 no pulse S
		} while (jugador1.equalsIgnoreCase("S") || jugador2.equalsIgnoreCase("S"));
		//Print para indicar que la partida ha terminado
		System.out.println("La partida ha terminado");
		//Cierre Scanner
		lectura.close();
	}
}