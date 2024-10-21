package parte5;

import java.util.Scanner;

public class Ejer3 {

	public static void main(String[] args) {
		//Creamos la variable entera numero que servira para almacenar el numero del usuario
		int numero;
		//Creamos la variable suma que ira sumando los distintos numeros desde N siendo n el numero introducido por el usuario hasta 1. Esta variable la inicializamos en 1 ya que el programa nos indica que se comienza el intervalo en 1
		int suma = 1;
		//Creamos el objeto scanner
		Scanner lectura=new Scanner(System.in);
		//Print que le indica que hacer al usuario
		System.out.println("Introduzca un numero");
		//Definimos numero en funcion del input del usuario
		numero=lectura.nextInt();
		do { //Creamos un bucle do-while donde
			suma+=numero; //Definimos suma como la suma de los distintos numeros que van sucediendose en el bucle
	--numero; //Bajamos el valor de numero en 1
		}while(numero>1);//Mientras numero>1 se realizaran las acciones definidas arriba
		System.out.println(suma); //Print del resultado
		//Cierre Scanner
		lectura.close();
	}

}
