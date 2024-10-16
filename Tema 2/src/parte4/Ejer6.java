package parte4;

import java.util.Scanner;

public class Ejer6 {

	public static void main(String[] args) {
	double altura;
	double altura2=0;
	double alturaMax;
	double alturaMin;
	Scanner lectura=new Scanner(System.in);
	System.out.println("Introduce una altura de un arbol");
altura2=lectura.nextDouble();
alturaMax=altura2;
alturaMin=altura2;
while(altura2!=-1) {
	System.out.println("Introduce una altura de un arbol");
	altura2=lectura.nextDouble();
	if(altura2>alturaMax) {
		alturaMax=altura2;
	}
	else if(altura2<alturaMin && altura2!=-1) {
		alturaMin=altura2;
	}
	
			
}
	System.out.println(alturaMin);
	System.out.println(alturaMax);
	}

}
