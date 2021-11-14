package polimorfismosobrecarga;

public class TestePolimorfismoSobrecarga {

	public static void main(String[] args) {
		
		Cachorro c = new Cachorro();
		
		c.reagir("Ol�"); // frase
		c.reagir("Toma comida"); // frase
		c.reagir(11, 45); // hora e min 
		c.reagir(21, 11); // hora e min
		c.reagir(false); // boolean
		c.reagir(23, 16f); // idade e peso
		c.emitirSom(); // m�todo
		
		Lobo l = new Lobo();
		l.emitirSom(); // m�todo

	}

}
