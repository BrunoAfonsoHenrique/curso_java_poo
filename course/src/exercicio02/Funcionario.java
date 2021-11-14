package exercicio02;

public class Funcionario {
	
	private String nome;
	private double salarioBruto;
	private double taxa;
	
	public Funcionario() {
		this.salarioBruto = 0;
		this.taxa = 0;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalarioBruto() {
		return salarioBruto;
	}

	public void setSalarioBruto(double salarioBruto) {
		this.salarioBruto = salarioBruto;
	}

	public double getTaxa() {
		return taxa;
	}

	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}
	
	public double calcularSalarioTaxa() {
		double liquido = getSalarioBruto() - getTaxa();
		return liquido;
	
	}
	
	public void incrementarSalario(double porcentagem) {
		double novoSalario = calcularSalarioTaxa() + (getSalarioBruto() * (porcentagem  / 100));
		System.out.printf("\nDados atualizados: %s, R$ %.2f" , getNome() , novoSalario);
	}
	
	public void mostarSalarioLiquido() {
		System.out.printf("\nDados: %s, %.2f", getNome(), calcularSalarioTaxa());
	}
}
