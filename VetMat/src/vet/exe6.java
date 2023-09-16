package aula1;

import java.util.Scanner;

public class exe6 {

	public static void main(String[] args) {
		// Crie um array de elementos e depois peça ao usuário para informar um valor,
		// verifique se este valor está presente no array e printe o índice.
		Scanner ent = new Scanner(System.in);

		int val[] = new int[3];
		val[0] = 19;
		val[1] = 17;
		val[2] = 16;

		System.out.println("informe um valor:");
		int inf = ent.nextInt();
		
		boolean possui = false;
		
		for (int i = 0; i < val.length; i++) {
			if (val[i] == inf) {
				possui = true;
				System.out.println("indice " + i);
			}
		}
		if (possui == false) {
			System.out.println("invalido");
		}
	}

}
