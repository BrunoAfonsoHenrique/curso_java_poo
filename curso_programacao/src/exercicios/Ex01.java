package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		double largura = leia.nextDouble();
		double comprimento = leia.nextDouble();
		double metroQuadradoTerreno = leia.nextDouble();
		
		double area = largura * comprimento;
		
		double preco = area * metroQuadradoTerreno;;
		
		System.out.printf("AREA: %.2f",  area);
		System.out.printf("\nPREÇO: %.2f",  preco);
		
		leia.close();
	}
}