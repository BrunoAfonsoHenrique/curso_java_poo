package exercicio03;

import java.util.Locale;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		Aluno aluno = new Aluno();
		
		aluno.setNome(leia.nextLine());
		
		aluno.setNota1(leia.nextDouble());
		aluno.setNota2(leia.nextDouble());
		aluno.setNota3(leia.nextDouble());
		
		aluno.verificarStatusAluno();
		leia.close();

	}

}
