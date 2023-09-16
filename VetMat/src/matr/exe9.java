package matr;

import java.util.Random;

public class exe9 {

	public static void main(String[] args) {
		// Crie uma matriz com 7 linhas e 8 colunas do tipo inteiro, para preencher a 
		//mesma utilize o Random de java.util.Random, posteriormente imprima esta matriz

		Random gen = new Random();
		
		int matriz [] [] = new int [7][8];
		
		for (int lin = 0; lin < 7; lin++) {
			for (int col = 0; col < 8; col++) {
				matriz [lin] [col] = gen.nextInt(10);
				System.out.print(matriz [lin] [col] + " ");
			}
			System.out.println(" ");
		}
	}

}
