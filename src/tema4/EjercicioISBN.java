package tema4;
import java.util.Scanner;
public class EjercicioISBN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner entrada=new Scanner(System.in);
int a=entrada.nextInt() , b=entrada.nextInt(), c=entrada.nextInt(), /*d, e, f, g, h, i,j;*/
d=entrada.nextInt(),e=entrada.nextInt(),f=entrada.nextInt(),
g=entrada.nextInt(),h=entrada.nextInt(),i=entrada.nextInt(),
j=entrada.nextInt();

String num=String.valueOf(a)+String.valueOf(b)+String.valueOf(c)
+String.valueOf(d)+String.valueOf(e)+String.valueOf(f)+
String.valueOf(g)+String.valueOf(h)+String.valueOf(i)+
String.valueOf(j);
int numerofinal= Integer.valueOf(num) ;
System.out.println(numerofinal);
	}

}
