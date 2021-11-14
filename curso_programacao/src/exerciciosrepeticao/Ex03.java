package exerciciosrepeticao;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		
		Scanner leia = new Scanner(System.in);
		int op = leia.nextInt();
		
		while(op != 4) {
			switch(op) {
			case 1:
				alcool += 1;
				break;
			case 2:
				gasolina += 1;
				break;
			case 3:
				diesel += 1;
				break;
			case 4: 
				System.out.println("Muito obrigado");
				break;
			}
			op = leia.nextInt();
		}
		
		System.out.println("Muito obrigado");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
		
		leia.close();
	}

}
