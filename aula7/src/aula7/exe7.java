package aula7;

import java.util.Scanner;

public class exe7 {

	public static void main(String[] args) {
		// Escreva um programa onde caso o usuário digite a letra 's' peça para informar
		// um número e caso digite 'n' encerre o programa e por fim
		// a) escreva o menor valor
		// b) escreva o maior valor
		Scanner ent = new Scanner(System.in);
		System.out.println("informe uma opcao");
		char opcao = ent.next().charAt(0);
		int num = 0;

		int menor = Integer.MAX_VALUE; // var aux --- valor
		int maior = Integer.MIN_VALUE;

		while (opcao == 's') {
			System.out.println("informe o numero");
			num = ent.nextInt();
			
			if (num < menor) {
				menor = num;
			}
			if (num > maior) {
				maior = num;

			}
			System.out.println("informe uma opcao");
			opcao = ent.next().charAt(0);
			while (opcao != 's' && opcao != 'n') {
				System.out.println("invalido");
				System.out.println("informe uma opcao");
				opcao = ent.next().charAt(0);
			}

		}
		System.out.println("menor " + menor);
		System.out.println("maior " + maior);
	}

}
