import java.util.Scanner;
public class Ej3
	{
	public static void main (String[]ar) 
		{
		Scanner teclado=new Scanner(System.in);
		int numero;
		System.out.print("Ingrese 10 numeros enteros positivos: ");
		numero=teclado.next int();
		for(num=1;num<=10;num++)
			{
			System.out.println("Numero:");
			numero=teclado.nextint();
			if(numero%2==0) 
				{
				System.out.println("El numero ingresado es par");
				}
			else if(numero%2==1) 
				{
				System.out.println("El numero ingresado es impar");
				}
			else 
				{		
				System.out.println("El numero que ha ingresado es incorrecto");
				}
			}
		}
	}	