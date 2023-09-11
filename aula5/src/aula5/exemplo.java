package aula5;

import java.util.Scanner;

public class exemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ent = new Scanner(System.in);
//Faça uma calculadora. 
		// O usuário entra com dois números e depois com a operaçao desejada.
		// Caso o número da operação seja 1: some os dois números.
		// Caso seja 2: subtraia os dois números.
		// Caso seja 3: multiplique os dois números.
		// Caso seja 4: divida os dois números.
		System.out.println("digite \n1- para somar \n2- para subtrair \n3- para multiplicar \n4- para dividir");
		int var = ent.nextInt();
		System.out.println("digite os dois numeros para a operacao");
		double n1 = ent.nextDouble();
		double n2 = ent.nextDouble();

		switch (var) {
		case 1:
			System.out.println(n1 + n2);
			break;
		case 2:
			System.out.println(n1 - n2);
			break;
		case 3:
			System.out.println(n1 * n2);
			break;
		case 4:
			System.out.println(n1 / n2);
			break;
		default:
			System.out.println("invalido");
			break;
		}

	}

}
