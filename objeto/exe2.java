package objeto;

import java.util.Scanner;

public class exe2 {
	public static void met1(int n1, int n2, int n3, int n4) {
		System.out.println("A soma dos numeros eh de " + (n1 + n2 + n3 + n4));
	}

	public static void main(String[] args) {
		//Faça um programa que some 4 números.
		//Passando esses 4 números como parâmetros para um método

		Scanner ent = new Scanner(System.in);
		
			System.out.println("Digite 4 numeros");
			int n1 = ent.nextInt();   int n2 = ent.nextInt();
			int n3 = ent.nextInt();   int n4 = ent.nextInt();
			
			met1(n1, n2, n3, n4);
		
		
		
	}

}
