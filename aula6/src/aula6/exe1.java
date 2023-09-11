package aula6;

import java.util.Scanner;

public class exe1 {

	public static void main(String[] args) {
		// Faça um programa, utilizando for, que peça para o usuário inserir um número N
		// e mostre na tela todos os números ímpares até N.
		Scanner ent = new Scanner(System.in);
		System.out.println("digite um numero");
		int n = ent.nextInt();

		for (int i = 1; i <= n;) {

			System.out.println(i);
			i = i + 2;
		}
	}
}
