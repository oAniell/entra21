package matr;

import java.util.Scanner;

public class ex7 {

	public static void main(String[] args) {
		// Crie uma matriz 3x3 do tipo String, onde o usuário irá preencher os
		// valores utilizando o scanner, ao fim imprima a matriz

		Scanner ent = new Scanner(System.in);

		String matriz[][] = new String[3][3];

		for (int lin = 0; lin < 3; lin++) {
			for (int col = 0; col < 3; col++) {
				System.out.println("informe os valores");
				matriz[lin][col] = ent.next();
			}
		}
		
		System.out.println(" ");
		
		System.out.println("Sua matriz ficou assim:");
		for (int lin = 0; lin < 3; lin++) {
			for (int col = 0; col < 3; col++) {
				System.out.print(matriz[lin][col] + " ");
			}
			System.out.println(" ");
		}

	}

}
