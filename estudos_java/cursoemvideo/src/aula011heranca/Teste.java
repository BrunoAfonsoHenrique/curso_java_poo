package aula011heranca;

public class Teste {

	public static void main(String[] args) {
		
		Visitante v1 = new Visitante();
		v1.setNome("Isabele");
		v1.setIdade(25);
		v1.setSexo("F");
		System.out.println(v1.toString());
		v1.fazerAnive();
		
		Aluno a1 = new Aluno();
		a1.setNome("Caio");
		a1.setIdade(32);
		a1.setSexo("M");
		System.out.println(a1.toString());
		a1.fazerAnive();
		a1.pagarMensalidade();
		
		Bolsista b1 = new Bolsista();
		b1.setNome("Lucas");
		b1.setIdade(22);
		b1.setSexo("M");
		System.out.println(b1.toString());
		b1.fazerAnive();
		b1.pagarMensalidade();

	}

}
