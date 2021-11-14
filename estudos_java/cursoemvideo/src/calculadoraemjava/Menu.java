package calculadoraemjava;

import java.util.Scanner;

public class Menu {
	
	private int opcao;
	
	Scanner leia = new Scanner(System.in);
	
	public int getOpcao() {
		return opcao;
	}

	public void setOpcao(int opcao) {
		this.opcao = opcao;
	}

	public void mostrarMenu() {
		
		System.out.println("<<<< Calculadora simples - MENU >>>>");
		System.out.println("1 - Soma");
		System.out.println("2 - Subtração");
		System.out.println("3 - Divisão");
		System.out.println("4 - Multiplicação");
		System.out.println("------------------------------------------------------");
		System.out.print("Qual opção de operação voce deseja fazer? ");
		opcao = leia.nextInt();
	
		
	}
	
}
