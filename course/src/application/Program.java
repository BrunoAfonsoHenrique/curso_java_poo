package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Produto;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		Produto produto = new Produto();
		
		System.out.println("Entre com os dados do produto");
		System.out.print("Nome: ");
		produto.nome = leia.nextLine();
		
		System.out.print("Pre?o: ");
		produto.preco = leia.nextDouble();
		
		System.out.print("Quantidade em estoque: ");
		produto.quantidade = leia.nextInt();
		
		System.out.println("Dados do produto\n" + produto.dados());
		
		System.out.println();
		System.out.print("Entre com o numero de produtos para adicionar ao estoque: ");
		int quantidade = leia.nextInt();
		produto.adicionarProdutos(quantidade);
		
		System.out.println();
		System.out.println("Dados do produto\n" + produto.dados());
		
		System.out.print("Entre com o numero de produtos para remover do estoque: ");
		quantidade = leia.nextInt();
		produto.removerProdutos(quantidade);
		
		System.out.println();
		System.out.println("Dados atualizados\n" + produto.dados());
		
		leia.close();
	}

}
