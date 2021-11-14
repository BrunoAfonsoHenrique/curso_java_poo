package entities;

public class Produto {
	
	public String nome;
	public double preco;
	public int quantidade;
	
	public double valorTotalEmEstoque() {
		
		return preco * quantidade;
	}
	
	
	public void adicionarProdutos(int quantidade) {
		this.quantidade += quantidade;
	}
	
	
	public void removerProdutos(int quantidade) {
		this.quantidade -= quantidade;
	}


	public String dados() {
		return "Produto [nome = " + nome + ", preco = " + String.format("%.2f", preco) + ", quantidade = " + String.format("%.2f", valorTotalEmEstoque()) + "]";
	}
	
	
}
