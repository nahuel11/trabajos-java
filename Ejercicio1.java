import java.util.Scanner;
public class Ej1
	{
	public static void main(String[]ar)
		{	
		Scanner teclado=new Scanner(System.in);
		//Declaracion de variables
		int cantidad;
		float precio;
		float importe;
		//Introdusccion de datos
		Sytem.out.println("Ingrese la cantidad de articulos que desee llevar:");
		cantidad=teclado.next float();
		System.out.println("Ingrese el precio unitario del producto:");
		precio=teclado.next float();
		importe=precio*cantidad;
		System.out.println("Usted debe abonar:");
		System.out.println(importe+"$");
		}
	}