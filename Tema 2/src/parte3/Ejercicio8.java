package parte3;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		
		int mes;
		int año;
		int dias;
Scanner lectura=new Scanner(System.in);
System.out.println("Introduzca el año");
año=lectura.nextInt();
System.out.println("Introduzca el mes");
mes=lectura.nextInt();
switch(mes) {
case 1, 3, 5, 7, 8, 10, 12:{
	System.out.println("El mes tiene 31 dias");
}
case 4,6,9,11:{
	System.out.println("El mes tiene 30 dias");
}

case 2:{
	if(año%4!=0)
	System.out.println("El mes tiene 28 dias");
	else
		System.out.println("El mes tiene 29 dias");
}

}
}
	}



	



	
	
 

