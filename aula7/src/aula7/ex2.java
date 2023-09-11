package aula7;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		// Crie um programa que leia um número do teclado até que encontre um número
		// igual a zero. No final, mostre a soma dos números digitados.
		Scanner ent = new Scanner(System.in);
		int soma = 0;
		System.out.println("informe um numero para a soma:");
		int num = ent.nextInt();
		while (num != 0) {
			System.out.println("informe um numero para a soma:");
			num = ent.nextInt();
			soma += num;
		}System.out.println("a soma ficou " + soma);
	}
}
