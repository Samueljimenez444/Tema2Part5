package parte3;

import java.util.Scanner;

public class Ejer7 {

	public static void main(String[] args) {
		double dineroNoDescuento;
		double dineroDescuento;
	final double precio=2.5;
	int distancia;
	int dias;
Scanner lectura=new Scanner(System.in);
System.out.println("Introduce la distancia en km que vas a recorrer");
distancia=lectura.nextInt();
System.out.println("Introduce los dias que te vas a alojar");
dias=lectura.nextInt();
if(distancia>800 && dias>7) {
	dineroNoDescuento=distancia*precio;
			dineroDescuento=dineroNoDescuento-(dineroNoDescuento*0.3);
			System.out.println("El dinero a pagar aplicando el descuento es de " +dineroDescuento);
}
			else {
				dineroNoDescuento=distancia*precio;
				System.out.println("El dinero a pagar es de " +dineroNoDescuento);
			}
	}
	}

