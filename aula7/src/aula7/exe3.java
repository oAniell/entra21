package aula7;

import java.util.Scanner;

public class exe3 {

	public static void main(String[] args) {
		/*
		 * Faça um programa que peça ao usuário um número entre 12 e 20. Se a pessoa
		 * digitar um número diferente, mostrar a mensagem "entrada inválida" e
		 * solicitar o número novamente. Se digitar correto mostrar o número digitado.
		 */
		Scanner ent = new Scanner(System.in);
		System.out.println("digite um numero entre 12 e 20:");
		double num = ent.nextDouble();
		while (num < 12 || num > 20) {
			System.out.println("Invalido, digite um numero entre 12 e 20:");
			num = ent.nextDouble();
		}
		System.out.println("numero correto");

	}
}
