package calculadoraemjava;

public class Divisao {
	
	private float num1;
	private float num2;
	private float result;
	
	public Divisao(float n1, float n2) {
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
	
	public void calcularDivisao() {
		if(this.getNum2() == 0) {
			System.out.println("Não existe divisão por ZERO");
		} else {
			this.setResult(this.getNum1() / this.getNum2());
			System.out.println(this.getNum1() + " / " +
								this.getNum2() + " = " + this.getResult());
		}
	}
}