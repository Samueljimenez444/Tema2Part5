package parte3;

import java.util.Scanner;

public class Ejer1 {

	public static void main(String[] args) {
	int numero;
	int capicua;
	Scanner lectura=new Scanner(System.in);
	System.out.println("Introduzca un numero");
	numero=lectura.nextInt();
	if(numero>9999 || numero<0) {
		System.out.println("El numero introducido no es valido");
	}else if(numero<100 && numero%10==numero/10) {
			System.out.println("El numero es capicua");}
		else if(numero<100 && numero%10!=numero/10) {
			System.out.println("El numero no es capicua");}
			else if(numero>100 && numero<1000 && numero%100==numero/100) {
				System.out.println("El numero es capicua");
	}
			else if(numero>100 && numero<1000 && numero%100!=numero/100) {
				System.out.println("El numero no es capicua");}
				else if(numero>1000 && numero<10000 && numero%1000==numero/1000 && numero%100==numero%10) {
					System.out.println("El numero es capicua");
		}
				else if(numero>1000 && numero<10000 && numero%1000!=numero/1000 || numero%100!=numero%10) {
					System.out.println("El numero no es capicua");
	}
	lectura.close();
	}
}

