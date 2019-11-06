package programacion;
import java.util.Scanner;
public class Ejercicio18condicional {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		int ages,precio,precio1,precio2;
		precio1=20;
		precio2=10;
		System.out.println("Introduzca edad");
		ages=entrada.nextInt();
		precio=(ages>=16)? precio1:precio2;
		System.out.println("El precio es "+ precio+ "€");
		
	

	}

}
