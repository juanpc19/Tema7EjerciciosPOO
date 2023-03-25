package ejercicio3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int valorX;// declaro variable que guardara valor con el modificar x

		int valorY;// declaro variable que guardara valor con el modificar y

		// creo nuevo objeto tipo Punto y lo asigno a la variable p y lo inicializo con valores concretos
		Punto p = new Punto(0, 0);
		// creo nuevo objeto tipo Punto y lo asigno a la variable p2 y lo inicializo con valores concretos
		Punto p2 = new Punto(20, 20);

		// cero escaner y lo nombro dogma
		Scanner dogma = new Scanner(System.in);

		// llamo a funcion imprime con objeto p
		p.imprime();

		// llamo a funcion imprime con objeto p2
		p2.imprime();

		// solicito al usuario valor para valorX
		System.out.println("Introduzca valor con el que modificar longitud (x) del  punto: ");

		// recojo valor con escaner y lo asigno a valorX
		valorX = dogma.nextInt();

		// solicito al usuario valor para valorY
		System.out.println("Introduzca valor con el que modificar latitud (y) del  punto: ");

		// recojo valor con escaner y lo asigno a valorY
		valorY = dogma.nextInt();

		// Llamo a funcion setXy con objeto p y le doy parametros de entrada valorX y
		// valorY
		p.setXY(valorX, valorY);

		// llamo a funcion imprime con objeto p
		p.imprime();

		// solicito al usuario valor para valorX
		System.out.println("Introduzca valor con el desplazar longitud (x) del  punto: ");

		// recojo valor con escaner y lo asigno a valorX
		valorX = dogma.nextInt();

		// solicito al usuario valor para valorY
		System.out.println("Introduzca valor con el desplazar latitud (y) del  punto: ");

		// recojo valor con escaner y lo asigno a valorY
		valorY = dogma.nextInt();

		// llamo a funcion desplaza con objeto p y le doy parametros de entrada valorX y
		// valorY
		p.desplaza(valorX, valorY);

		// llamo a funcion imprime con objeto p
		p.imprime();

		// llamo a funcion distancia con objeto p y le doy como parametro de entrada el
		// objeto p2 e imprimo lo que me devuelve en mensaje por pantalla
		System.out.println("La distancia entre el los puntos dados es:" + p.distancia(p2));

		//cierro escaner
		dogma.close();
	}

}
