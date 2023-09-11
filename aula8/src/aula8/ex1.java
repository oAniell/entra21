package aula8;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		// Faça uma calculadora. O usuário entra com dois números e depois com a
		// operação desejada.
//Caso o número da operação seja 1: some os dois números.  
//Caso seja 2: subtraia os dois números.  
//Caso seja 3: multiplique os dois números. 
//Caso seja 4: divida os dois números. 
//Após realizada a operação, solicite ao usuário se deseja continuar realizando operações 
//(sempre com dois novos valores) digite qualquer tecla e caso queira encerrar informe a letra ‘n’.

		Scanner ent = new Scanner(System.in);
		double n1 = 0;
		double n2 = 0;
		
		System.out.println("Bem vindo a calculadora!\nDigite qualquer tecla para iniciar ou N para encerrar");
		char tecla = ent.next().charAt(0);

		while (tecla != 'n') {
			System.out.println("digite \n1- para somar \n2- para subtrair \n3- para multiplicar \n4- para dividir");
			int op = ent.nextInt();
			
				switch (op) {
				case 1:
					System.out.println("Digite os dois numeros para a operacao.");
					n1 = ent.nextInt();
					n2 = ent.nextInt();
					System.out.println("a soma dos dois é igual a " + (n1 + n2));
					break;
				case 2:
					System.out.println("Digite os dois numeros para a operacao.");
					n1 = ent.nextInt();
					n2 = ent.nextInt();
					System.out.println("a subtracao dos dois é igual a " + (n1 - n2));
					break;
				case 3:
					System.out.println("Digite os dois numeros para a operacao.");
					n1 = ent.nextInt();
					n2 = ent.nextInt();
					System.out.println("a multiplicacao dos dois é igual a " + (n1 * n2));
					break;
				case 4:
					System.out.println("Digite os dois numeros para a operacao.");
					n1 = ent.nextInt();
					n2 = ent.nextInt();
					System.out.println("a divisao dos dois é igual a " + (n1 / n2));
					break;

				default: System.out.println("operacao invalida");
					break;
				}
				System.out.println(
						"Caso desejar continuar com a operacao digite qualquer tecla \nCaso deseja encerrar digite N");
				tecla = ent.next().charAt(0);
		}
				System.out.println("Calculadora encerrada");
		}
	}
