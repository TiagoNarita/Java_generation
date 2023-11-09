package Lista01;

import java.util.Scanner;

public class Ex3 {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		float salarioBruto, adicionalNoturno, horasExtras, descontos, liquido;
		System.out.println("Digite o salario Bruto: ");
		salarioBruto = scan.nextFloat();
		System.out.println("Digite o adicional Noturno: ");
		adicionalNoturno =scan.nextFloat();
		System.out.println("Digite as horasExtras: ");
		horasExtras =scan.nextFloat();
		System.out.println("Digite os descontos: ");
		descontos =scan.nextFloat();
		
		liquido = salarioBruto + adicionalNoturno + (horasExtras*5) - descontos;
		
		System.out.println("Liquido: "+ liquido);
	}
}
