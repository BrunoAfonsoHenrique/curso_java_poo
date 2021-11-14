package exerciciosrepeticao;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int x = leia.nextInt();
		int y = leia.nextInt();
		
		while(x != 0 && y != 0) {
			if(x > 0 && y > 0) {
				System.out.println("Primeiro quadrante");
			} else if(x < 0 && y > 0) {
				System.out.println("Segundo quadrante");
			} else if(x < 0 && y < 0) {
				System.out.println("Terceiro quadrante");
			} else {
				System.out.println("Quarto quadrante");
			}
			
			x = leia.nextInt();
			y = leia.nextInt();
		}
		
		leia.close();

	}

}
