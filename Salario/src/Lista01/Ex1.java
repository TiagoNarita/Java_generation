package Lista01;

import java.util.Scanner;

public class Ex1 {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		double salario, abono, novo_salario;
		System.out.println("Digite seu salario: ");
		salario = scan.nextDouble();
		System.out.println("Digite o abono: ");
		abono =scan.nextDouble();
		novo_salario = salario + abono;
		
		System.out.println("Novo salário é: " + novo_salario);
		
	}
}
