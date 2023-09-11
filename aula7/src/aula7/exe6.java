package aula7;

import java.util.Scanner;

public class exe6 {

	public static void main(String[] args) {
		// Faça um programa que receba um nome de uma fruta como entrada. Faça vários
		// cases para as frutas que você conhece.
		// Por exemplo: Case "banana": Eu gosto dessa fruta Case "pera": Eu não gosto
		// dessa fruta
		// Caso o usuário entre um valor desconhecido, escreva: Eu não conheço essa
		// fruta e encerre o programa
		Scanner ent = new Scanner(System.in);
		System.out.println("digite um nome de uma fruta:");
		String fruta = ent.next();

		while (fruta.equals("banana") || fruta.equals("morango")) {

			switch (fruta) {
			case "morango":
				System.out.println("adoro essa fruta");
				break;
			case "banana":
				System.out.println("muito boa");
				break;

			default:

				break;
			}
			System.out.println("digite um nome de uma fruta:");
			fruta = ent.next();
		}
		System.out.println("nao conheço essa fruta \nFim do programa");

	}

}
