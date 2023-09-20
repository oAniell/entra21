package objeto;

import java.util.Scanner;

public class exe1 {
	public static void verao(int num) {
		System.out.println("É verão e o tempo está quente");
	}

	public static void inverno(int num) {
		System.out.println("É inverno e está frio");

	}

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		/* Faça um programa em que o usuário entre com um número
		 Com o número 1 sendo verão, 2 sendo outono...
		 Dependendo de o que o usuário informa, printe:
		 É verão E o tempo está quente 
		 Ou É inverno E está frio*/
		
		System.out.println("Digite 1 ou 2:");
		int num = ent.nextInt();

		if (num == 1) {
			verao(num);

		} else if (num == 2) {
			inverno(num);

		} else {
			System.out.println("Numero invalido!");

		}
	}

}
