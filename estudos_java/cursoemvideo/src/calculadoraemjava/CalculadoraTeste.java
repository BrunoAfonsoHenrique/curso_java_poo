package calculadoraemjava;

import java.util.Scanner;

public class CalculadoraTeste {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		String continuar = "S";
		while(continuar.equals("s") || continuar.equals("S")) {
			
			Menu menu = new Menu();
			menu.mostrarMenu();
			
			Numeros n = new Numeros();
			n.entrarComNumeros();
			
			switch(menu.getOpcao()){
			case 1:
				Soma soma = new Soma(n.getNum1(), n.getNum2());
				soma.calcularSoma();
				break;
			case 2:
				Subtracao subtracao = new Subtracao(n.getNum1(), n.getNum2());
				subtracao.calcularSubtracao();
				break;
			case 3:
				Divisao divisao = new Divisao(n.getNum1(), n.getNum2());
				divisao.calcularDivisao();
				break;
			case 4:
				Multiplicacao multiplicacao = new Multiplicacao(n.getNum1(), n.getNum2());
				multiplicacao.calcularMultiplicacao();
				break;
			default:
				System.out.println("Opção de operação é invalida. Favor, verificar o MENU !!!");
			}
			System.out.print("Deseja continuar? [S/N]: ");
			continuar = leia.nextLine();
		}
		
		System.out.println("Calculadora encerrada. Volte sempre :-)");
		
		leia.close();
	}

}
