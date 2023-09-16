package aula1;

import java.util.Scanner;

public class exe4 {

	public static void main(String[] args) {
		// Crie uma array de 5 elementos e descubra:
		// a) Qual o maior elemento
		// b) Qual o menor elemento
		// c) A média dos elementos
		Scanner ent = new Scanner(System.in);
		int maior = Integer.MIN_VALUE;
		int menor = Integer.MAX_VALUE;
		int num = 0;
		int cont = 0;

		int val[] = new int[5];

		for (int i = 0; i < 5; i++) {
			System.out.println("digite o valor");
			val[i] = ent.nextInt();
		}
		for (int i = 0; i < 5; i++) {
			num = val[i];
			cont += num;
			if (num < menor) {
				menor = num;
			}
			if (num > maior) {
				maior = num;
			}
		}
		System.out.println("menor " + menor);
		System.out.println("maior " + maior);
		System.out.println("media e de " + cont / val.length);
	}

}
