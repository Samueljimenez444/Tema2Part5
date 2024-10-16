package parte3;

import java.util.Scanner;

public class Ejer2 {

	public static void main(String[] args) {
	int numero;
	int valorAbsoluto;
	Scanner lectura=new Scanner(System.in);
	System.out.println("Introduzca un numero");
numero=lectura.nextInt();
valorAbsoluto= numero<0 ? numero*(-1): numero;
System.out.println("El valor absoluto del numero introducido es " + valorAbsoluto);
	}

}
