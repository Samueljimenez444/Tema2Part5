package parte3;

import java.util.Scanner;

public class Ejer4 {

	public static void main(String[] args) {
		// Creamos la variable numero donde almacenar el número que introducira el usuario
				int numero;

				//Creamos la variable numero que servira para conocer las unidades del numero introducido por el usuario
				int unidad;

				// Creamos la variable numero que servira para conocer las decenas del numero introducido por el usuario
				int decena;

				// Cadena para definir el resultado
				String resultado = "";

				// Cadena para definir cual es la decena
				String cadDecenas = "";
				
				// Cadena para definir cual es la unidad
				String cadUnidades = "";

				// Creamos el objeto Scanner
				Scanner reader = new Scanner(System.in);

				// Le damos las instrucciones al usuario
				System.out.println("Introduzca un número entero");
				//Definimos numero en base al input del usuario
				numero = reader.nextInt();
				
				// Calculamos el modulo con el cual conseguiremos obtener las unidades del numero introducido
				unidad = numero % 10;

				// Dividimos entre 10 para quedarnos con la decena
				decena = numero / 10;


				if (numero >= 1 && numero <= 99) {

					switch (numero) {
					case 10 -> resultado = "diez";
					case 11 -> resultado = "once";
					case 12 ->  resultado = "doce";
					case 13 ->  resultado = "trece";
					case 14 ->  resultado= "catorce";
					case 15 ->  resultado= "quince";
					default -> {
						
						switch (unidad) {
						case 1 -> cadUnidades = "uno";
						case 2 -> cadUnidades = "dos";
						case 3 -> cadUnidades = "tres";
						case 4 -> cadUnidades = "cuatro";
						case 5 -> cadUnidades = "cinco";
						case 6 -> cadUnidades = "seis";
						case 7 -> cadUnidades = "siete";
						case 8 -> cadUnidades = "ocho";
						case 9 -> cadUnidades = "nueve";
						}

						switch (decena) {
						case 1 -> cadDecenas = "dieci" ;
						case 2 -> {
							if (unidad == 0) {
								cadDecenas = "veinte";
							} else {
								cadDecenas = "veinti";
							}
						}
						case 3 -> {
							cadDecenas = "treinta";
							if (unidad != 0) {
								cadDecenas = cadDecenas + " y " ;
							}
						}

						case 4 -> {
							cadDecenas = "cuarenta";
							if (unidad != 0) {
								cadDecenas = cadDecenas + " y " ;
							}
							
						}

						case 5 -> {
							cadDecenas = "cincuenta";
							if (unidad != 0) {
								cadDecenas = cadDecenas + " y " ;
							}
							
						}

						case 6 -> {
							cadDecenas = "sesenta";
							if (unidad!= 0) {
								cadDecenas = cadDecenas + " y " ;
							}
						}

						case 7 -> {
							cadDecenas = "setenta";
							if (unidad != 0) {
								cadDecenas = cadDecenas + " y " ;
							}
						}

						case 8 -> {
							cadDecenas = "ochenta";
							if (unidad != 0) {
								cadDecenas = cadDecenas + " y ";
							}
						}
						case 9 -> {
							cadDecenas = "noventa";
							if (unidad != 0) {
								cadDecenas = cadDecenas + " y " ;
							}
						}
						}
					}
					}
				}

				resultado = resultado.equals("") ? (cadDecenas + cadUnidades): resultado;
				//Print resultado
				System.out.println(resultado);
				// Cerramos el Scanner
				reader.close();
	}

}
