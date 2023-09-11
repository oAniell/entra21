package aula7;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		// Escreva um algoritmo que leia um número do teclado até que encontre um número
		// menor ou igual a 1.

		Scanner ent = new Scanner(System.in);

		System.out.println("informe um numero do teclado");
		int entrada = ent.nextInt();
		while (entrada > 1) {
			System.out.println("informe um numero do teclado");
			entrada = ent.nextInt();}
		System.out.println("Fim do programa");
	}

}
