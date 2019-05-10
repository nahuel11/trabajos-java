import java.util.Scanner;

public class Operaciones{}
 private Scanner teclado;
 private int num1;
 private int num2;
 teclado=new Scanner(System.in);
 System.out.println(" Ingrese el primer valor: ");
 num1=teclado.nextint();
 System.out.println(" Ingrese el segundo valor: ");
 num2=teclado.nextint();
}

public class calcular{
	private Scanner teclado2;
	private int total;
	teclado2=new Scanner(System.in);
	private int opcion;
	System.out.println("Por favor elija una opcion: ");
	System.out.println(" --- ");
	System.out.println("-----------");
	System.out.println("1- Sumar");
	System.out.println("2- Multiplicar");
	System.out.println("3- Restar");
	System.out.println("4- Dividir");
	System.out.println("-----------");
	System.out.println("");
	opcion=teclado2.nextint();
	if (opcion = 1)
	{
		total=num1+num2;
	    System.out.println("-----------");
		System.out.println(" El total de la suma "+num1+" y "+num2+" es "+total+" .");
        System.out.println("-----------");	
	}
	else if (opcion = 2)
	{
		total=num1*num2;
        System.out.println("-----------");
		System.out.println(" El total de la multiplicacion "+num1+" y "+num2+" es "+total+" .");
        System.out.println("-----------");
	}
	else if (opcion = 3)
	{
		total=num1-num2;
        System.out.println("-----------");
		System.out.println(" El total de la resta "+num1+" y "+num2+" es "+total+" .");
        System.out.println("-----------");
	}
	else if (opcion = 4)
	{
		total=num1/num2;
        System.out.println("-----------");		
		System.out.println(" El total de la division "+num1+" y "+num2+" es "+total+" .");
        System.out.println("-----------");	
	}
	else 
	{
        System.out.println("-----------");
		System.out.println(" La opcion que a elejido no exite, vuelva a elejir una de las opciones correspondientes.")
        System.out.println("-----------");
	}
}



