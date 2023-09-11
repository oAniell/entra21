package aula7;

import java.text.DecimalFormat;
import java.util.Scanner;

public class exe4 {

	public static void main(String[] args) {
		// Descreva um algoritmo que vá lendo a altura de pessoas até o usuário entrar
		// com o número 0 Calcule a média de altura das mesmas.
		DecimalFormat formatar = new DecimalFormat("0.00");

		Scanner ent = new Scanner(System.in);
		System.out.println("digite a altura de seu coleguinha:");
		double altura = ent.nextDouble();
		double aux = 0;
		int qnt = 0;
		double med = 0;

		while (altura != 0) {
			aux += altura;
			qnt++;
			med = aux / qnt;
			System.out.println("digite a altura de seu coleguinha:");
			altura = ent.nextDouble();
		}
		System.out.println("a media das alturas é de " + formatar.format(med));
	}

}
