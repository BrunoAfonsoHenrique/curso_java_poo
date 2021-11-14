package exercicio03;

public class Aluno {
	
	private String nome;
	private double nota1;
	private double nota2;
	private double nota3;
	
	public Aluno() {
		this.nota1 = 0;
		this.nota2 = 0;
		this.nota3 = 0;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}

	public double getNota3() {
		return nota3;
	}

	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}
	
	public void verificarStatusAluno() {
		double notaFinalAluno = getNota1() + getNota2() + getNota3();
		System.out.printf("Nota final = %.2f", notaFinalAluno);
		if(notaFinalAluno > 60) {
			System.out.println("\nPassou !!!");
		}else {
			System.out.println("\nNão passou !!!");
			double pontosFaltantes = 60 - notaFinalAluno;
			System.out.println("\nPrecisa de " + pontosFaltantes + " pontos.");
		}
	}
}
