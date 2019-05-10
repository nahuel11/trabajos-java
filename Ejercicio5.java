import java.util.Scanner;
public class Ej5
{
public static void main(String args[])
    {
        Scanner teclado2=new Scanner(System.in);
        int suma=0; int numero=0;
        
        while(numero<=9999)
        {
        	System.out.print("Por favor ingrese un numero: ");
			num=teclado2.nextInt();
            System.out.println("-----------");
			suma = suma + numero;
            System.out.println("-----------");
        }
          if(numero==0)
        {
            System.out.println("-----------");
        	System.out.print(" El valor es: "+ numero + "\n");
            System.out.println("-----------");
        }
          if(numero>0)
        {
            System.out.println("-----------");
        	System.out.print(" El valor es: "+ numero + "y es mayor a 0");	
            System.out.println("-----------");
        }
          if(numero<0)
        {
            System.out.println("-----------");
        	System.out.print(" El valor es: "+ numero + "y es menor a 0");	
            System.out.println("-----------");
        }
    }
}