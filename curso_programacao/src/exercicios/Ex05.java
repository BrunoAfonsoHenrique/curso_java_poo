package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		int numFuncionario = leia.nextInt();
		int horas = leia.nextInt();
		float valor = leia.nextFloat();
		
		float salario = (float) horas * valor;
		
		System.out.println("Numero = " + numFuncionario);
		System.out.printf("Salario = R$%.2f", salario);
		
		leia.close();

	}

}
