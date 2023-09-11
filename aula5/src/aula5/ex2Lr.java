package aula5;

public class ex2Lr {

	public static void main(String[] args) {
		// Descreva um algoritmo que leia 5 números inteiros e escreva, para cada 
		//número lido, se o mesmo é par ou ímpar.

		for (int i = 1; i<=5; i++) {
			if (i % 2 ==0) {System.out.println(i + " par");}
			else {System.out.println(i + " impar");}
		}
	}

}
