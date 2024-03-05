package operadores;

import java.util.Scanner;
public class OperadoresMatematicos {
	public static void main(String arg[]) {
		Scanner input= new Scanner(System.in);
		int a, b, soma, sub, multi, divi;
		System.out.print("Digite o valor de a: ");
		a= input.nextInt();
		System.out.print("Digite o valor de b: ");
		b= input.nextInt();
		soma= a + b;
		sub= a - b;
		multi = a * b;
		divi= a / b;
		System.out.println("Operações de adição: " + soma);
		System.out.println("Operações de subtração: " + sub);
		System.out.println("Operações de multiplicação: " + multi);
		System.out.println("Operações de divisão: " + divi);
	}
}
