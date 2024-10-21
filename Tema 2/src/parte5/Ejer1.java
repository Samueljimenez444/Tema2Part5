package parte5;

public class Ejer1 {

	public static void main(String[] args) {
		//Creamos la variable numero y la inicializamos en 0 para que el bucle consigue imprimir todos los numeros desde 0 (este incluido) hasta 20
		int numero=0;
		//Creamos un bucle do-while donde
		do {
System.out.println(numero);//Mostramos el numero por el que empieza la serie
++numero;//Aumentamos el numero en 1 para que se muestre toda la serie seguida
	}while(numero<21); //Todas estas acciones sucederan hasta que 21<=numero
	}

}
