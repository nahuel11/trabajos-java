import java.util.Scanner;

public class Ej2
{	
	public static void main (String args[])
	
	{
		Scanner teclado2=new Scanner(System.in);
		int numero;
        System.out.println("-----------");
		System.out.print("Por favor ingrese un numero positivo");
        System.out.println("-----------");
		num=teclado2.nextInt();
		if(numero<10 && numero>=0){
        System.out.println("-----------");	
		System.out.print("El numero contiene un solo digitos")
        System.out.println("-----------");	
		}
		if(numero>=10 && numero<100){
		System.out.println("-----------");	
		System.out.print("El numero contiene dos digitos");
        System.out.println("-----------");	
		}
		if (numero>=100 && numero<1000){
        System.out.println("-----------");	
		System.out.print("El numero tiene tres dos digitos");
        System.out.println("-----------");	
		}else{
        System.out.println("-----------");	
		System.out.print("El numero tiene mas de cuatro digitos");
        System.out.println("-----------");	
		}
	}
}