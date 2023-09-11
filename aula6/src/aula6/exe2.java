package aula6;

import java.util.Scanner;

public class exe2 {

	public static void main(String[] args) {
		// Faça um programa, utilizando for, que permita o usuário fazer três contas de subtração.
		Scanner ent = new Scanner(System.in);

		for (int i = 1; i <= 3; i++) {
			System.out.println("conta " +i);
			System.out.println("digite o primeiro numero:");
			int n1 = ent.nextInt();
			System.out.println("digite o segundo numero:");
			int n2 = ent.nextInt();
			
			int result = n1 - n2;
			System.out.println("o resultado é " + result);

		}
	}

}
