package Lista01;

import java.util.Scanner;

public class Ex4 {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		float n1, n2, n3, n4, calculo;
		System.out.println("Digite o 1 numero: ");
		n1 = scan.nextFloat();
		System.out.println("Digite o 2 numero: ");
		n2 =scan.nextFloat();
		System.out.println("Digite o 3 numero: ");
		n3 =scan.nextFloat();
		System.out.println("Digite o 4 numero: ");
		n4 =scan.nextFloat();
		
		calculo= ((n1 * n2) - (n3 * n4));
		
		System.out.println("Media final: "+ calculo);
	}
}