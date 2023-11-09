package aula_02;

import java.util.Scanner;

public class Calculadora {

	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		
		double n1, n2;
		
		System.out.println("Digite o primeiro número: ");
		
		n1 = scan.nextDouble();
		
		System.out.println("Digite o segundo número");
		
		n2 = scan.nextDouble();
		
		System.out.println("A soma dos dois numeros é: " + (n1 + n2));
		System.out.println("A subtração dos dois numeros é: " + (n1 - n2));
		System.out.println("A mult dos dois numeros é: " + (n1 * n2));
		System.out.println("A divião dos dois numeros é: " + (n1 / n2));
		System.out.println("O resto dos número 1 : " + (n1 % 1));
		
	}
}
