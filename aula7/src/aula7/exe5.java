package aula7;

import java.util.Scanner;

public class exe5 {

	public static void main(String[] args) {
		// Faça um programa que peça ao usuário um número entre 12 e 20. Se a pessoa digitar um número diferente, 
		//mostrar a mensagem "entrada inválida" e solicitar o número novamente. 
		//Se digitar correto mostrar o número digitado.Conforme a questão 3, 
		//construa um contador que comece com 0 onde ele precisa chegar ao numero 10, para o contador contar precisa-se que o valor seja valido
		
		Scanner ent = new Scanner(System.in);
		int contador = 0;
		System.out.println("digite um numero entre 12 e 20:");
		double num = ent.nextDouble();
		while (contador != 10) {
			System.out.println("digite um numero entre 12 e 20:");
			num = ent.nextDouble();
			if (num <21 && num>11) {
				contador ++;
				
			} else {System.out.println("Invalido");

			}
		}
		System.out.println("numero correto");

	}

}
