package exercicio01;
import java.util.*;

class SomarDoisNum {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int num1, num2, soma;
		System.out.println("Insira um número:");
		num1 = sc.nextInt();
		System.out.println("Insira outro número:");
		num2 = sc.nextInt();
		soma = num1 + num2;
		System.out.println("Soma: "+soma);
	}
}
