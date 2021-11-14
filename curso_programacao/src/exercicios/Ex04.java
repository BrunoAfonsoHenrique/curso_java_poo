package exercicios;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int a = leia.nextInt();
		int b = leia.nextInt();
		int c = leia.nextInt();
		int d = leia.nextInt();
		
		int diferenca = (a * b - c * d);
		System.out.println("Diferença = " + diferenca);
		
		System.out.println("\n-----------------------------------");
		
		a = leia.nextInt();
		b = leia.nextInt();
		c = leia.nextInt();
		d = leia.nextInt();
		
		diferenca = (a * b - c * d);
		System.out.println("Diferença = " + diferenca);
		
		leia.close();

	}

}
