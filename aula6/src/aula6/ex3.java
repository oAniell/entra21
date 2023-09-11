package aula6;

import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		// Crie 4 variáveis fora do For onde define se é m(mulher) e h(homem)
		// e faça dois contador que verifique quantas mulheres e homens são.
		Scanner ent = new Scanner(System.in);

		int h = 0;
		int m = 0;

		for (int i = 1; i <= 4; i++) {
			System.out.println("informe 1 para homem ou 2 para mulher:");
			int gen = ent.nextInt();
			if (gen == 1) {
				h++;} 
			else {m++;}
		}
		System.out.println(h + " homens e " + m + " mulheres");
	}

}
