package aula5;

public class ex3lr {

	public static void main(String[] args) {
		// Descreva um algoritmo que calcule e escreva a soma dos números
		// pares e a soma dos números ímpares entre 1 e 1000.

		int par = 0;
		int impar = 0;
		int aux = 0;

		for (int i = 1; i <= 1000; i++) {
			if (i % 2 == 0) {
				par = par + i;
			} else {
				impar = impar + i;

			}

		}
		System.out.println("a soma dos pares é " + par + " e a soma dos impares é " + impar);
	}

}
