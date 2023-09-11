package aula2;

import java.util.Scanner;

public class exe1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

// Dados dois números inteiros descreva um algoritmo para informar o maior valor entre eles.

		System.out.println("Digite o primeiro numero:");
		int n1 = entrada.nextInt();
		System.out.println("Digite o segundo numero:");
		int n2 = entrada.nextInt();

		if (n1 > n2) {
			System.out.println("O maior numero é " + n1);
		} else if (n1 == n2) {
			System.out.println("Os numeros sao iguais");
		}

		else {
			System.out.println("O maior numero é " + n2);
		}

	}

}
