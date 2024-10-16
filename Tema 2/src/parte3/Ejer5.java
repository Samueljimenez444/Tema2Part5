package parte3;

import java.util.Random;
import java.util.Scanner;

public class Ejer5 {

	public static void main(String[] args) {
		 Random random = new Random();
		 int resultado;
		 int suma;
		 int numero;
		 numero=random.nextInt(1,100);
		 int numero2;
		 numero2=random.nextInt(1,100);
		 resultado=numero+numero2;
		 Scanner lectura=new Scanner(System.in);
		 System.out.println(numero);
		 System.out.println(numero2);
		 System.out.println("Introduzca el resultado de la suma entre los dos numeros aleatorios");
		 suma=lectura.nextInt();
		 if(suma==resultado) {
			 System.out.println("Acertaste");
		 }
		 else
			 System.out.println("Has fallado");
	}

}
