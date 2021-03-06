package exercicio02;

import java.util.Locale;
import java.util.Scanner;

public class FuncionarioTeste {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		Funcionario dadosFuncionario = new Funcionario();
		
		System.out.printf("Nome: ");
		dadosFuncionario.setNome(leia.nextLine());
		
		System.out.printf("Salario bruto: ");
		dadosFuncionario.setSalarioBruto(leia.nextDouble());
		
		System.out.printf("Taxa: ");
		dadosFuncionario.setTaxa(leia.nextDouble());
		
		dadosFuncionario.mostarSalarioLiquido();
		
		System.out.printf("\n\nEntre com a porcentagem de desconto no salario: ");
		double porcentagem = leia.nextDouble();
		dadosFuncionario.incrementarSalario(porcentagem);
		
	
		
		
		
		leia.close();
	}

}
