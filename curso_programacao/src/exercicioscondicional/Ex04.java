package exercicioscondicional;

import java.util.Locale;
import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		int hrInicial = leia.nextInt();
		int hrFinal = leia.nextInt();
		
		int duracao;
		
		if(hrInicial < hrFinal) {
			duracao = hrFinal - hrInicial;
		} else {
			duracao = 24 - hrInicial + hrFinal;
		}
		
		System.out.println("O jogo durou " + duracao + " hora(s)");
		
		leia.close();
	}

}
