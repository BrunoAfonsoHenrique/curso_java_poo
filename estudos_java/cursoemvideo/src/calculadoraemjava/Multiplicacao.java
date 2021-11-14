package calculadoraemjava;

public class Multiplicacao {
	
	private float num1;
	private float num2;
	private float result;
	
	public Multiplicacao(float n1, float n2) {
		this.setNum1(n1);
		this.setNum2(n2);	
	}

	public float getNum1() {
		return num1;
	}

	public void setNum1(float num1) {
		this.num1 = num1;
	}

	public float getNum2() {
		return num2;
	}

	public void setNum2(float num2) {
		this.num2 = num2;
	}

	public float getResult() {
		return result;
	}

	public void setResult(float result) {
		this.result = result;
	}
	
	public void calcularMultiplicacao() {
		this.setResult(this.getNum1() * this.getNum2());
		System.out.println(this.getNum1() + " * " +
							this.getNum2() + " = " + this.getResult());
	}
}