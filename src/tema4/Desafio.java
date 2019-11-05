package tema4;

public class Desafio {

	public static void main(String[] args) {
		int [] m1= {1,132,100,99};
		int [] m2= m1;
		metodo(m1,m2);
		System.out.print(m1[1]+ " "+m2[3]+"");

	}
public static void metodo(int[] a1, int[] a2) {
	a1[3]=98;
}
}
