package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangulo;

public class Principal {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		Triangulo x = new Triangulo();
		Triangulo y = new Triangulo();
		
		System.out.println("Entre com as medidas do triangulo X: ");
		x.a = leia.nextDouble();
		x.b = leia.nextDouble();
		x.c = leia.nextDouble();
		
		System.out.println("Entre com as medidas do triangulo Y: ");
		y.a = leia.nextDouble();
		y.b = leia.nextDouble();
		y.c = leia.nextDouble();
		
		double areaX = x.area();
		double areaY = y.area();
		
		System.out.printf("Triangulo X area: %.4f\n", areaX);
		System.out.printf("Triangulo Y area: %.4f\n", areaY);
		
		if(areaX > areaY) {
			System.out.println("Maior area ? X");
		}else {
			System.out.println("Maior area ? Y");
		}
		
		
		leia.close();

	}

}
