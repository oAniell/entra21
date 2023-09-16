package matr;

import java.util.Scanner;

public class ex6 {

	public static void main(String[] args) {
		// Crie um programa onde o usuário define quantas linhas e
		// colunas deve ter uma matriz, e posteriormente imprima o total de
		// elementos(posições) que está matriz tem

		Scanner ent = new Scanner(System.in);
		System.out.println("Digite quantas linhas tem a sua matriz:");
		int lin = ent.nextInt();
		System.out.println("Digite quantas linhas tem a sua matriz:");
		int col = ent.nextInt();

		System.out.println("Sua matriz tem " + (lin * col) + " de elementos.");

	}

}
