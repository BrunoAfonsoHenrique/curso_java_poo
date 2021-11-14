package execricio01;

import java.util.Locale;
import java.util.Scanner;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		
		Retangulo retangulo = new Retangulo();
		
		System.out.println("Entre com a largura e altura do retangulo: ");
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		retangulo.setLargura(leia.nextDouble());
		retangulo.setAltura(leia.nextDouble());
		System.out.println(retangulo.toString());
		
		leia.close();

	}

}
