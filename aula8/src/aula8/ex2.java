package aula8;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		/*
		 * Faça um programa que leia um nome de usuário e a sua senha e não aceite a
		 * senha igual ao nome do usuário, mostrando uma mensagem de erro e voltando a
		 * pedir as informações, caso seja certo, de os parabéns e encerre o programa.
		 */
		Scanner ent = new Scanner(System.in);

		System.out.println("digite um nome de usuario:");
		String nome = ent.next();
		
		System.out.println("digite uma senha:");
		String senha = ent.next();
		
		while (nome.equals(senha)) {
			System.out.println("erro! O nome de ususario e senha nao podem ser iguais.");
			
			System.out.println("digite um nome de usuario:");
			nome = ent.next();
			
			System.out.println("digite uma senha:");
			senha = ent.next();
			
	}System.out.println("usuario criado, parabens!");
	}
}
