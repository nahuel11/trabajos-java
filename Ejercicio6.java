import java.util.Scanner;
public class Empleado 
	{
 	private Scanner teclado;
 	private String nombre;
 	private String apellido;
	private float sueldo;
	public void cargar() 
		{
 		teclado=new Scanner(System.in);
 		System.out.println("");
	 	nombre=teclado.next String();
 		System.out.println("Ingrese apellido:");
	 	apellido=teclado.next String();
 		System.out.println("Ingrese sueldo:");
	 	sueldo=teclado.next float();
	 	}
	public void imprimir() 
		{
 		System.out.println("Nombre: "+nombre);
 		System.out.println("Apellido: "+apellido);
 		System.out.println("Sueldo: "+sueldo);
 		}
	public void losImpuestos() 
		{
	 	if (sueldo>=3000) 
 			{
 			System.out.print(nombre+""+apellido+" debe pagar impuestos.");
	 		} 
 		else 
 			{
		 	System.out.print(nombre+""+apellido+" No debe pagar impuestos");
		 	}
 		}
 	public static void main(String[] ar) 
 		{
 			Empleado empleado1;
 			empleado1=new Empleado();
 			empleado1.cargar();
 			empleado1.imprimir();
			empleado1.losImpuestos();
 		}
 	}	