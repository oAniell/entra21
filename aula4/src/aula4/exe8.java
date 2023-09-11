package aula4;

import java.util.Scanner;

public class exe8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Faça uma calculadora. 
		// O usuário entra com dois números e depois com a operaçao desejada.
		// Caso o número da operação seja 1: some os dois números.
		// Caso seja 2: subtraia os dois números.
		// Caso seja 3: multiplique os dois números.
		// Caso seja 4: divida os dois números.

		Scanner ent = new Scanner(System.in);
		System.out.println("digite \n1- para somar \n2- para subtrair \n3- para multiplicar \n4- para dividir");
		int op = ent.nextInt();

		if (op == 1) {
			System.out.println("Digite os dois numeros para a operacao.");
			double n1 = ent.nextInt();
			double n2 = ent.nextInt();
			System.out.println("a soma dos dois é igual a " + (n1 + n2));

		}if (op == 2) {
			System.out.println("Digite os dois numeros para a operacao.");
			double n1 = ent.nextInt();
			double n2 = ent.nextInt();
			System.out.println("a subtracao dos dois é igual a " + (n1 - n2));
			
		}if (op == 3) {
			System.out.println("Digite os dois numeros para a operacao.");
			double n1 = ent.nextInt();
			double n2 = ent.nextInt();
			System.out.println("a multiplicacao dos dois é igual a " + (n1 * n2));

	}if (op == 4) {
		System.out.println("Digite os dois numeros para a operacao.");
		double n1 = ent.nextInt();
		double n2 = ent.nextInt();
		System.out.println("a divisao dos dois é igual a " + (n1 / n2));}
	}
}

