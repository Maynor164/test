import java.util.Scanner;
public class cadetex {

	public static void main(String[] args) {
		/*Ejercicio 2: Imprimir n veces una cadena de texto (
		Realizar un programa donde el usuario ingresa un numero y una cadena de texto. Seguidamente, el programa imprimrá la cadena de texto la misma cantidad de veces que el numero ingresado.
		Ejemplo:
		Ingrese un numero: 3
		Ingrese una cadena: Hola
		Hola
		Hola
		Hola*/
		System.out.println("Bienvenido usuario a The Matrix");
		System.out.println("Ingrese un numero");
		Scanner S = new Scanner(System.in);
		int x; 
		x= S. nextInt();
		System.out.println("Ingrese un texto");
		String h;
		h= S.next();
		/*Utilizamos el while para repetir determinadas veces que el usuario ingrese*/
		/*Creamos una varible contadora para repetir el texto*/
		int zamus=0;
		while (zamus<x)
		{	
			System.out.println(h);
			zamus++;
		}	
	
	}
}	
