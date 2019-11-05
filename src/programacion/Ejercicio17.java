package programacion;
import java.util.Scanner;
public class Ejercicio17 {

	public static void main(String[] args) {
		System.out.println("De valores a X y Z");
		Scanner entrada=new Scanner(System.in);
		double x=entrada.nextDouble(), y=entrada.nextDouble() ,z=entrada.nextDouble();
		System.out.println((x<y && y<z) ? "ordenado":"no ordenado");

	}

}
