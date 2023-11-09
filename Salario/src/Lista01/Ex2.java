package Lista01;

import java.util.Scanner;

public class Ex2 {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		float n1, n2, n3, n4, mediaFinal;
		System.out.println("Digite a nota1: ");
		n1 = scan.nextFloat();
		System.out.println("Digite a nota 2: ");
		n2 =scan.nextFloat();
		System.out.println("Digite a nota 3: ");
		n3 =scan.nextFloat();
		System.out.println("Digite a nota 4: ");
		n4 =scan.nextFloat();
		
		mediaFinal= (n1 + n2 + n3 + n4)/4;
		
		System.out.println("Media final: "+ mediaFinal);
	}
}
