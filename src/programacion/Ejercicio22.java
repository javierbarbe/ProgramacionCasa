package programacion;
import java.util.Scanner;
public class Ejercicio22 {

	public static void main(String[] args) {
	// si pesa 0-2 2-4 10-4  10-20
		//  2.5  4.5  7.5  10.5

	Scanner entrada=new Scanner(System.in);
	float peso; 
	System.out.println("introduzca peso");
	peso=entrada.nextFloat();
	if (peso<2) {
		System.out.printf("El coste es 2,5$");
		
	}else if(peso<4){
		System.out.println("el coste es de 4.5$");
		
	}else if (peso<10) {
		System.out.println("el coste es 7.5$");
	}
	else if (peso>10 && peso<=20) {
		System.out.println(" el coste es 10.5$");
	}else {
		System.out.println("El envio no puede hacerse");
	}
	
	}
}
