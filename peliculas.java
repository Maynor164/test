import java.util.Scanner;
public class peliculas {

	public static void main(String[] args) {
	/*Ejercicio 1: Rating de películas (5pts)
Realizar un programa en Java donde se mostrará el titulo de una película. Seguidamente, el usuario ingresará una calificación de 1 a 5 estrellas. Si el usuario ingresó 1, se imprimirá "Pésima"; 2, "Mala"; 3, "Regular"; 4, "Buena"; 5, "Exeletente"*/

System.out.println("Bienvenido usuarios a Criticos 2014");
/*Orientar al usuario con las opciones*/
System.out.println("1.Pesima  2.Mala 3.Buena 4.Muy buena 5.Excelente");
System.out.println("Ingrese calificacion para The Hobbit 2");
/*Declaracion de variables en este caso caracter por solo ocupar una*/
Scanner S = new Scanner(System.in);
char peli = S.next().charAt(0);

/*Se coloca el switch para que si el usuario ingrese la valoracion el programa busque el caso y muestre mensaje en pantalla*/
switch (peli)
{
case '1':
	System.out.println("Pesima");
	break;
case '2':
	System.out.println("Mala");
	break;
case '3':
	System.out.println("Buena");
	break;
case '4':
	System.out.println("Muy buena");
	break;
case '5':
	System.out.println("Excelente");
break;
	}


	
}
}