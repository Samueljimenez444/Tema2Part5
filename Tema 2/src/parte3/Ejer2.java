package parte3;

import java.util.Scanner;

public class Ejer2 {

	public static void main(String[] args) {
		//Creamos la variable numero que contendra la informacion del numero introducido por el usuario
	int numero;
	//Creamos la variable entera valor absoluto que servira para transformar el numero introducido por el usuario a positivo
	int valorAbsoluto;
	//Creamos el objeto Scanner
	Scanner lectura=new Scanner(System.in);
	//Print que le indica al usuario que debe hacer
	System.out.println("Introduzca un numero");
	//Definimos la variable en funcion del input del usuario
numero=lectura.nextInt();
//Creamos un ternario donde si el numero<0 (es decir es negativo) el programa lo tranformara a positivo, sin embargo si el numero es positvo lo dejara igual
valorAbsoluto= numero<0 ? numero*(-1): numero;
//Print del resultado
System.out.println("El valor absoluto del numero introducido es " + valorAbsoluto);
lectura.close();
	}
}
