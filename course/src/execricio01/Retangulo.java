package execricio01;

public class Retangulo {
	
	private double largura;
	private double altura;
	
	public Retangulo() {
		this.largura = 0.0;
		this.altura = 0.0;
	}
	
	public double getLargura() {
		return largura;
	}
	public void setLargura(double largura) {
		this.largura = largura;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public double calcularAreaRetangulo() {
		return this.getAltura() * this.getLargura();
	}
	
	public double calcularPerimetroRetangulo() {
		return 2.0 * (this.getAltura() + this.getLargura());
	}
	
	public double calcularDiagonalRetangulo() {
		return Math.sqrt(Math.pow(largura, 2.00) + Math.pow(altura, 2.00));
	}

	@Override
	public String toString() {
		return "Area ["+ calcularAreaRetangulo() +"]"
				+ "\nPerimetro ["+ calcularPerimetroRetangulo() +"]"
				+ "\nDiagonal [" + calcularDiagonalRetangulo() + "]";
	}
	
}
