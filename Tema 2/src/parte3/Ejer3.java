package parte3;

import java.util.Scanner;

public class Ejer3 {

	public static void main(String[] args) {
		int numero = 0;
		int dni;
		Scanner lectura = new Scanner(System.in);
		System.out.println("Introduzca su DNI para asignarle una letra (SU DNI DEBE CONSTAR DE 8 DIGITOS)");
		dni = lectura.nextInt();
		if (dni < 10000000 || dni > 99999999) {
			System.out.println("Introduzca un dni valido");
		}
		switch (dni % 23) {
		case 1:
			numero = 1;
		case 2:
			numero = 2;
		case 3:
			numero = 3;
		case 4:
			numero = 4;
		case 5:
			numero = 5;
		case 6:
			numero = 6;
		case 7:
			numero = 7;
		case 8:
			numero = 8;
		case 9:
			numero = 9;
		case 10:
			numero = 10;
		case 11:
			numero = 11;
		case 12:
			numero = 12;
		case 13:
			numero = 13;
		case 14:
			numero = 15;
		case 16:
			numero = 16;
		case 17:
			numero = 17;
		case 18:
			numero = 18;
		case 19:
			numero = 19;
		case 20:
			numero = 20;
		case 21:
			numero = 21;
		case 22:
			numero = 22;

		}
		System.out.println("El numero que se debe asiganar a tu dni es" + numero);
		lectura.close();
	}
}
