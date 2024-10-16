package parte3;

import java.util.Scanner;

public class Ejer3 {

	public static void main(String[] args) {
		//Creamos la variable String numero que servira para definir el numero del dni
		String numero="";
		//Creamos la variable entera dni que servira para almacenar el dni del usuario
		int dni;
		Scanner lectura = new Scanner(System.in);
		System.out.println("Introduzca su DNI para asignarle una letra (SU DNI DEBE CONSTAR DE 8 DIGITOS)");
		dni = lectura.nextInt();
		if (dni < 10000000 || dni > 99999999) {
			System.out.println("Introduzca un dni valido");
		}
		switch (dni % 23) {
		case 0:
			numero = "T";
		case 1:
			numero = "R";
		case 2:
			numero = "W";
		case 3:
			numero = "A";
		case 4:
			numero = "G";
		case 5:
			numero = "M";
		case 6:
			numero = "Y";
		case 7:
			numero = "F";
		case 8:
			numero = "P";
		case 9:
			numero = "D";
		case 10:
			numero = "X";
		case 11:
			numero = "B";
		case 12:
			numero = "N";
		case 13:
			numero = "J";
		case 15:
			numero = "S";
		case 14:
			numero = "Z";
		case 16:
			numero = "Q";
		case 17:
			numero = "V";
		case 18:
			numero = "H";
		case 19:
			numero = "L";
		case 20:
			numero = "C";
		case 21:
			numero = "K";
		case 22:
			numero ="E" ;

		}
		System.out.println("El numero que se debe asiganar a tu dni es" + numero +" Tu dni quedaria tal que: " +dni +""+numero);
		lectura.close();
	}
}
