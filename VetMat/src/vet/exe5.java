package aula1;

import java.util.Scanner;

public class exe5 {

	public static void main(String[] args) {
		// Crie um array de 10 elementos e depois peça ao usuário para informar um índice, imprima o
		//valor que está no vetor conforme indice informado pelo usuario
		Scanner ent = new Scanner(System.in);
		
		int idades[] = new int[10];

		idades[0] = 19;   idades[1] = 17;
		idades[2] = 16;   idades[3] = 15;
		idades[4] = 18;   idades[5] = 14;
		idades[6] = 20;   idades[7] = 21;
		idades[8] = 22;   idades[9] = 23;

		System.out.println("Digite um indicie para saber o valor do vetor:");
		int i = ent.nextInt();
		System.out.println("O valor do vetor e de " + idades[i]);
	}

}
