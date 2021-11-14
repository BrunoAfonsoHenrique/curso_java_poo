package exercicios;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int n1 = leia.nextInt();
		int n2 = leia.nextInt();
		
		int soma = n1 + n2;
		System.out.println("Soma = "+ soma);
		
		System.out.println("----------------------");
		
		n1 = leia.nextInt();
		n2 = leia.nextInt();
		soma = n1 + n2;
		System.out.println("Soma = "+ soma);
		
		System.out.println("----------------------");
		
		n1 = leia.nextInt();
		n2 = leia.nextInt();
		soma = n1 + n2;
		System.out.println("Soma = "+ soma);
		
		System.out.println("----------------------");
		
		leia.close();

	}

}
