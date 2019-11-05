package tema4;
import java.util.Scanner;
public class IsbnNuevo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner entrada=new Scanner(System.in);
int numero, unidades, decenas;
numero=entrada.nextInt();
unidades=numero%10;
decenas=numero/10%10;
System.out.println("decenas "+decenas+"unidades "+unidades);
	}

}
