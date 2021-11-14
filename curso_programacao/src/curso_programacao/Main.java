package curso_programacao;

import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("\n---------------------------------------------");
		double x = 10.35784;
		System.out.println(x);
		System.out.printf("%.2f", x);
		Locale.setDefault(Locale.US); // resolvendo o padrão de exibição do double
		System.out.printf("\nResultado = %.2f", x);
		
		System.out.println("\n---------------------------------------------");
		
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		System.out.printf("%s tem %d anos e ganha R$%.2f", nome, idade, renda);
	}

}
