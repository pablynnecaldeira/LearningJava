package operadores;

import java.util.Scanner
public class ParOuImpar {
	public static void main(String args[]) {
		int a, b, resto;
		Scanner input = new Scanner(System.in);
		System.out.print("Digite o valor de num1");
		num1 = input.nextInt();
		
		if(num1 % 2 ==0){
			System.out.println("O número" + num1 + "é par!!");
		}
		else {
			System.out.println("O número" + num1 + "é ímpar!!");
		}
		
		if(num1 % 3== 0) {
			System.out.println("O número" + num1 + "é múltiplo de 3!!");
		}
		else {
			System.out.println("O número " + num1 + "não é multiplo de 3!!");
		}
	}
}
