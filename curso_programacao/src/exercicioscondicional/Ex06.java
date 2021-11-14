package exercicioscondicional;

import java.util.Locale;
import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		double intervalo = leia.nextDouble();
		
		if(intervalo >= 0 && intervalo <= 25) {
			System.out.println("Intervalo = (0, 25]");
		} else if(intervalo > 25 && intervalo <= 50) {
			System.out.println("Intervalo = (25, 50]");
		}else if(intervalo >= 75 && intervalo <= 100) {
			System.out.println("Intervalo = (75, 100]");
		} else {
			System.out.println("Fora do intervalo");
		}
		
		leia.close();

	}

}
