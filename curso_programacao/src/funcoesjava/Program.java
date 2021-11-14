package funcoesjava;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter three numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int higher = maximo(a, b, c);
		
		showResult(higher);
		
		sc.close();

	}
	
	public static int maximo(int x, int y, int z) {
		int auxiliar;
		
		if(x > y && x > z) {
			auxiliar = y;
		} else if(y > z) {
			auxiliar = y;
		}
		else {
			auxiliar = z;
		}
		
		return auxiliar;
	}
	
	public static void showResult(int a) {
		System.out.println("Maior valor: " + a);
	}

}
