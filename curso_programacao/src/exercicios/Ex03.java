package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		double raio = leia.nextDouble();
		double pi = 3.14159;
		double area = pi * Math.pow(raio, 2);
		
		System.out.printf("A = %.4f" , area );
		System.out.println("\n----------------------");
		
		raio = leia.nextDouble();
		pi = 3.14159;
		area = pi * Math.pow(raio, 2);
		
		System.out.printf("A = %.4f" , area );
		System.out.println("\n----------------------");
		
		raio = leia.nextDouble();
		pi = 3.14159;
		area = pi * Math.pow(raio, 2);
		
		System.out.printf("A = %.4f" , area );
		System.out.println("\n----------------------");
		
		leia.close();
	}

}
