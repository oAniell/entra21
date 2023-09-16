package aula1;

import java.util.Scanner;

public class exe3 {

	public static void main(String[] args) {
		// Faça um algoritmo em que quem preenche os valores do vetor é o usuário, por
		// fim printe o vetor (vetor de 5 posições).
		Scanner ent = new Scanner(System.in);
		String nomes[] = new String[5];
		System.out.println(nomes.length);
		for (int i = 0; i < nomes.length; i++) {
			System.out.println("Digite os nomes do vetor:");
			String val = ent.next();
			nomes[i] = val;

		}
		for (int i = 0; i < nomes.length; i++) {
			System.out.println("Os vetores tem nome de " + nomes[i]);
		}

	}

}
