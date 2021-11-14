package exercicioscondicional;

import java.util.Locale;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		int min = leia.nextInt();
		
		double conta = 50.0;
		
		if(min > 100) {
			conta += (min - 100) * 2.0;
		}
		
		System.out.printf("Valor da conta = R$%.2f", conta);
		
		leia.close();

	}

}
