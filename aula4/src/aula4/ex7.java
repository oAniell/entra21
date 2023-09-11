package aula4;

import java.util.Scanner;

public class ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// . Escreva um algoritmo que obtém do usuário 3 valores inteiros representando
		// as três
		// cartas deste usuário em uma mão de jogo de truco (1= AS; 2=2; 3=3; 7=7;
		// 11=Valete; 12= Dama; 13= Rei).O algoritmo deve imprimir na tela a palavra
		// “TRUCO” (se APENAS UMA das três cartas for AS, 2 ou 3), “SEIS” (se APENAS
		// DUAS das três cartas for AS, 2 ou 3)
		// ou “NOVE” (se AS TRÊS cartas forem AS, 2 ou 3). Se não houver AS, 2 ou 3 nas
		// três cartas, não é impresso nada

		Scanner ent = new Scanner(System.in);
		System.out.println("Quais as cartas da mao?");
		int c1 = ent.nextInt();
		int c2 = ent.nextInt();
		int c3 = ent.nextInt();

		if ((c1 == 1 || c1 == 2 || c1 == 3) && (c2 == 1 || c2 == 2 || c2 == 3) && (c3 == 1 || c3 == 2 || c3 == 3)) {
			System.err.println("MENOS QUE NOVE EU NEM JOGO!!");

		} else if (((c1 == 1 || c1 == 2 || c1 == 3) && (c2 == 1 || c2 == 2 || c2 == 3))
				|| ((c1 == 1 || c1 == 2 || c1 == 3) && (c3 == 1 || c3 == 2 || c3 == 3))
				|| ((c2 == 1 || c2 == 2 || c2 == 3) && (c2 == 1 || c2 == 2 || c2 == 3))) {
			System.out.println("SEIS SE TU E BEM MACHO");

		} else if ((c1 == 1 || c1 == 2 || c1 == 3) || (c2 == 1 || c2 == 2 || c2 == 3)
				|| (c3 == 1 || c3 == 2 || c3 == 3)) {
			System.out.println("TRUCOOOOO");

		} else {
			System.out.println("Ja pede pra sair");

		}

	}

}
