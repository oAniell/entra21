package aula2;

import java.util.Scanner;

public class ex9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		final double pi = 3.14;
		System.out.println("insira o valor de A:");
		double a = entrada.nextDouble();
		System.out.println("insira o valor de B:");
		double b = entrada.nextDouble();
		System.out.println("insira o valor de C:");
		double c = entrada.nextDouble();
		
		System.out.println("A area do triangulo de base A e altura C é " + (a*c)/2);
		System.out.println("A area do circulo de raio C é " + c * c *pi);
		System.out.println("A area do trapezio com A e B por base e C de altura é "+((a+b)*c) / 2);
		System.out.println("A area do quadrado de base B é " + b*b);
		System.out.println("A area do retangulo de lado A e B é "+ a*b);
		
	}

}
