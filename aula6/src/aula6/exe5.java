package aula6;

import java.util.Scanner;

public class exe5 {

	public static void main(String[] args) {
		// Ler um valor inteiro (aceitar somente valores entre 1 e 10) e escrever a
		// tabuada de 1 a 10 do valor lido.
		Scanner ent = new Scanner(System.in);
		System.out.println("digite um valor para a tabuada (somente de 1 a 10)");
		int tab = ent.nextInt();
		int aux = 0;
		for (int i = 1; i < 11; i++) {

			System.out.println(tab * i);
		}
	}

}
