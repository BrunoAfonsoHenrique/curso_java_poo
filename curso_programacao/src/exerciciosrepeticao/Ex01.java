package exerciciosrepeticao;

import java.util.Locale;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		System.out.printf("Digite a senha: ");
		int senha = leia.nextInt();
		
		while(senha != 2002) {
			System.out.println("Senha Invalida");
			System.out.printf("Digite a senha: ");
			senha = leia.nextInt();
		}
		
		System.out.println("Acesso Permitido");
		
		leia.close();

	}

}
