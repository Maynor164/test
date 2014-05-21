import java.util.Scanner;
public class metododo 
{
	
	static  int MayoMeno(int a1,int a2)
	{
		if(a1>a2)
			return a1;
		else
			return a2;
	}
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int b1,b2,b3;
		System.out.print("Ingrese valor 1: ");
		b1=s.nextInt();
		System.out.print("Ingrese valor 2: ");
		b2=s.nextInt();
		System.out.println("MAYOR: "+MayoMeno(b1,b2));
	}
	
	
	
	
	
	/*PROMEDIO*/
	/*static  int promedio(int a1,int a2, int a3)
	{
		int resultado = (a1+a2+a3)/3;
		return resultado;
	}
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int b1,b2,b3;
		System.out.print("Ingrese valor 1: ");
		b1=s.nextInt();
		System.out.print("Ingrese valor 2: ");
		b2=s.nextInt();
		System.out.print("Ingrese valor 3: ");
		b3=s.nextInt();
		System.out.println("Promedio: "+promedio(b1,b2,b3));
	}*/
	
	
	
	
	
	
	
	
	/*FUNCIONES*/
	/*public static int sumar(int a, int b)
	{
		return a+b;
	}
	
	public static int multiplicar(int a, int b)
	{
		return a*b;
	}
	public static int dividir(int a, int b)
	{
		return a/b;
	}
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in); 
		int a,b;
		System.out.print("Ingrese valor de a: ");
		a=s.nextInt();
		System.out.print("Ingrese valor de b: ");
		b=s.nextInt();
		System.out.println("a+b:"+ restar(a,b));
		System.out.println("a-b:"+ sumar(a,b));
		System.out.println("a-b:"+ multiplicar(a,b));
		System.out.println("a-b:"+ dividir(a,b));*/
	}


