package estruturasrepetitivas;

import java.util.Scanner;

public class Exemplo1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int x = leia.nextInt();
		
		int soma = 0;
		
		while(x != 0) {
			soma += x;
			x = leia.nextInt();
			
		}
		
		leia.close();
		System.out.println("SOMA = "+ soma);

	}

}
