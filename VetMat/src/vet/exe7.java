package aula1;

import java.util.Scanner;

public class exe7 {

	public static void main(String[] args) {
		//  Faça um algoritmo que coloque o número 0 no índice que o usuário escolheu e por fim printe o vetor.
		Scanner ent = new Scanner(System.in);
		
		int val[] = new int[3];
		val[0] = 1;
		val[1] = 2;
		val[2] = 3;

		System.out.println("digite um valor de indice");
		int ind = ent.nextInt();
		val [ind] = 0;
		
		for (int i = 0; i < val.length; i++) {
			System.out.println(val[i]);
		}
	}

}
