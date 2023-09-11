package aula5;

import java.util.Scanner;

public class exe10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ent = new Scanner(System.in);
/* Escreva um algoritmo em que o usuário entra com um número. 
		 Depois ele escolhe a operação que vai ser feita com esse número
		 Caso ele escolha a operação 1
		 Modifique a variável do número entrado e some 10 ao número original
		 Caso ele escolha a operação 2
		 Modifique a variável do número entrado e subtraia 10 do número original
		 Caso ele escolha a operação 3
		 Modifique a variável do número entrado e multiplique 10 ao número original
		 Caso ele escolha a operação 4
		 Modifique a variável do número entrado e divida 10 do número original*/
		
			System.out.println("digitem um numero:");
		double numero = ent.nextDouble();
			System.out.println("digite qual operacao quer usar:\n 1- soma \n 2- subtracao \n 3- multiplicacao \n 4- divisao");
		int op = ent.nextInt();

		switch (op) {
		case 1:
			System.out.println("o valor é de " + (numero + 10));
			break;
		case 2:
			System.out.println("o valor é de " + (numero - 10));
			break;
		case 3:
			System.out.println("o valor é de " + (numero * 10));
			break;
		case 4:
			System.out.println("o valor é de " + (numero / 10));
			break;

		default:
			System.out.println("invalido");
			break;
		}
	}

}
