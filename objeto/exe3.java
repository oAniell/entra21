package objeto;

import java.util.Scanner;

public class exe3 {
	public static void coleguinhas(String nome, int idade) {
		System.out.println("O nome dele(a) é " + nome);
		System.out.println("Ele(a) tem " + idade + " anos");
		System.out.println("Ele(a) é estudante do Entra 21");
	}

	public static void main(String[] args) {
		// Faça um método para cada um dos seus seus colegas
		// O método deve printar:
		// O nome dele(a) é [nome]
		// Ele(a) tem [idade] anos
		// Ele(a) é estudante do Entra 21
		// (Em prints separados)
		// O usuário deve entar com um valor que vai selecionar um dos métodos a ser
		// executado
		Scanner ent = new Scanner(System.in);

		System.out.println("Digite um numero para seu colega:");
		int num = ent.nextInt();
		if (num == 0) {
			coleguinhas("poffinho", 27);
		}
		else if (num == 1) {
			coleguinhas("prada", 18);

		}
		else if (num == 2) {
			coleguinhas("mclovin", 17);

		}
		else if (num == 3) {
			coleguinhas("admini", 16);
		}
		else if (num == 4) {
			coleguinhas("andressa", 20);
		} else {
			System.out.println("Infelizmente eh esses q ta tendo :)");
		}

	}

}
