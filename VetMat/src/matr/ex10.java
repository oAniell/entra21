package matr;

import java.util.Random;

public class ex10 {

	public static void main(String[] args) {
		// Crie em Java uma matriz 3x5 de inteiros, preencha a matriz utilizando Randon
		// e depois:
		// a) Informe quantas vezes a matriz repete o número 0;
		// b) A quantidade de números pares;
		// c) A quantidade de números ímpares

		Random gen = new Random();
		int cont = 0;
		int par = 0;
		int imp = 0;
		int matriz[][] = new int[3][5];
		for (int lin = 0; lin < 3; lin++) {
			for (int col = 0; col < 5; col++) {
				matriz[lin][col] = gen.nextInt(10);
				if (matriz[lin][col] % 2 == 0) {
					par++;
				}
				if (matriz[lin][col] % 2 != 0) {
					imp++;
				}
				if (matriz[lin][col] == 0) {
					cont++;
				}
				System.out.print(matriz[lin][col] + " ");
			}
			System.out.println(" ");

		}
		System.out.println(" ");

		System.out.println("O numero 0 eh repetido " + cont + " vezes \nTem " + par + " numeros pares e " + imp
				+ " numeros impares.");

	}

}
