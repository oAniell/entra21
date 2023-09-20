package objeto;

import java.util.Scanner;

public class exe5 {
	public static void ret(double base, double alt) {
		double perimetro = (base + base) + (alt + alt);
		double area = base * alt;

		System.out.println("A area do retangulo eh " + area + " e o perimetro eh " + perimetro);
	}

	public static void main(String[] args) {
		// Faça um programa que calcule o perímetro e a área de um retângulo
		Scanner ent = new Scanner(System.in);

		System.out.println("Digite a base do retangulo:");
		double base = ent.nextDouble();
		System.out.println("Digite a altura do retangulo:");
		double alt = ent.nextDouble();
		
		ret(base, alt);
	}

}
