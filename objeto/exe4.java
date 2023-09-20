package objeto;

import java.util.Scanner;

public class exe4 {
	public static void met1(int n1, int n2) {
		if (n1 > n2) {
			System.out.println("O primeiro numero eh maior");
		} else if (n1 < n2) {
			System.out.println("O segundo numero eh maior");
		} else {
			System.out.println("Numeros iguais");
		}
	}

	public static void main(String[] args) {
		// Faça um programa que receba 2 números do usuário.
		// Faça um método que descubra qual dos números é maior
		// Se os dois números forem iguais, informe: número iguais
		Scanner ent = new Scanner(System.in);
		System.out.println("Digite dois numeros ");
		int n1 = ent.nextInt();
		int n2 = ent.nextInt();

		met1(n1, n2);

	}

}
