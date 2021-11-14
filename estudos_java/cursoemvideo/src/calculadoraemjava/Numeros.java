package calculadoraemjava;

import java.util.Scanner;

public class Numeros {
	
	private float num1;
	private float num2;
	
	Scanner leia = new Scanner(System.in);
	
	public void entrarComNumeros() {
		
		System.out.print("Digite o primeiro numero: ");
		num1 = leia.nextFloat();
		System.out.print("Digite o segundo numero: ");
		num2 = leia.nextFloat();
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
	
	
}
