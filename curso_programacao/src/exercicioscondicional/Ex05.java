package exercicioscondicional;

import java.util.Locale;
import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		int op = leia.nextInt();
		int qtd = leia.nextInt();
		double valor = 0;
		
		switch(op) {
		case 1: 
			valor = 4.00;
			break;
		case 2: 
			valor = 4.50;
			break;
		case 3: 
			valor = 5.00;
			break;
		case 4: 
			valor = 2.00;
			break;
		case 5: 
			valor = 1.50;
			break;
		default:
			System.out.println("Opção incorreta digitada");
			break;
		}
		
		double preco = valor * qtd;
		
		System.out.printf("Total: R$ %.2f", preco);
		
		leia.close();

	}

}
