package parte4;

import java.util.Scanner;

public class Ejer5 {

	public static void main(String[] args) {
		int edad=1;
		int edadmayor=0;
		int suma = 0;
		double media=0.0;
		double contador = -0.0;
		Scanner lectura = new Scanner(System.in);
		System.out.println("Introduce las edades de los alumnos");
		edad = lectura.nextInt();
		if(edad>=18) {
			edadmayor++;
		}
		while (edad >= 0) {
			suma += edad;
			System.out.println("Introduce otra edad");
			edad = lectura.nextInt();
			++contador;
			if(edad>=18) {
				edadmayor++;
			}
		}
		media=suma/contador;
		System.out.println(edadmayor);
		System.out.println(media);
	}
}
