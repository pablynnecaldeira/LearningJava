package operadores;

import java.util.Scanner
public class ParOuImpar {
	public static void main(String args[]) {
		int a, b, resto;
		Scanner input = new Scanner(System.in);
		System.out.print("Digite o valor de num1");
		num1 = input.nextInt();
		
		if(num1 % 2 ==0){
			System.out.println("O n�mero" + num1 + "� par!!");
		}
		else {
			System.out.println("O n�mero" + num1 + "� �mpar!!");
		}
		
		if(num1 % 3== 0) {
			System.out.println("O n�mero" + num1 + "� m�ltiplo de 3!!");
		}
		else {
			System.out.println("O n�mero " + num1 + "n�o � multiplo de 3!!");
		}
	}
}
