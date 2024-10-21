package parte5;

import java.util.Scanner;

public class Ejer4 {

	public static void main(String[] args) {
		int numero;
		int multiplicacion;
		int contador=1;
		Scanner lectura=new Scanner(System.in);
		System.out.println("Introduzca un numero");
		numero=lectura.nextInt();
		do {
	multiplicacion=numero*contador;
	System.out.println(multiplicacion);
	contador++;
		}while(contador<=10);
		lectura.close();

	}

}
