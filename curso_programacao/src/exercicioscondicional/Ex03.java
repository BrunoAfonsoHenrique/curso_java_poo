package exercicioscondicional;

import java.util.Locale;
import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		int A = leia.nextInt();
		int B = leia.nextInt();
		
		if(A % B == 0 || B % A == 0) {
			System.out.println("S�o multiplos");
		} else {
			System.out.println("N�o s�o multiplos");
		}
		
		leia.close();

	}

}
