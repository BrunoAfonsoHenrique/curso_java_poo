package estudopolimorfismo;

public class TesteAnimal {

	public static void main(String[] args) {
		
		Mamifero m = new Mamifero();
		Reptil r = new Reptil();
		Peixe p = new Peixe();
		Ave a = new Ave();
		Canguru c = new Canguru();
		Cachorro ca = new Cachorro();
		
		m.setPeso(85.3f);
		m.setIdade(2);
		m.setMembros(4);
		m.locomover(); // Correndo
		m.alimentar(); // Mamando
		m.emitirSom(); // Som de mamifero
		
		p.setPeso(85.3f);
		p.setIdade(2);
		p.setMembros(4);
		p.locomover(); // Nadando
		p.alimentar(); // Come substancias
		p.emitirSom(); // Peixe n?o faz som
		
		a.setPeso(0.35f);
		a.setIdade(1);
		a.setMembros(0);
		a.locomover(); // Voando
		a.alimentar(); // Comendo grutas e carnes
		a.emitirSom(); // Som de ave
		
		c.setPeso(10);
		c.setIdade(1);
		c.setMembros(0);
		c.locomover(); // Voando
		c.alimentar(); // Comendo grutas e carnes
		c.emitirSom(); // Som de ave
		
		ca.abanarRabo();
		ca.emitirSom();

	}
}
