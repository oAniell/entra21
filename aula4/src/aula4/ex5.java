package aula4;

import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ent = new Scanner(System.in);
//Dada a idade de um nadador descreva um algoritmo que o classifique em uma das 
//seguintes categorias: pré-mirim 5 - 7 anos mirim 8 - 10 anos 
//infantil 11 - 13 anos infanto-juvenil 14 - 17 anos juvenil 18 - 20 anos adulto maiores de 21 anos

		System.out.println("digite sua idade para saber sua categoria:");
		int idade = ent.nextInt();

		if (idade > 4 && idade < 8) {
			System.out.println("pre mirim");

		} else if (idade > 7 && idade < 11) {
			System.out.println("mirim");

		} else if (idade > 10 && idade < 14) {
			System.out.println("infantil");
		} else if (idade > 13 && idade < 18) {
			System.out.println("infanto juvenil");

		} else if (idade > 17 && idade < 21) {
			System.out.println("juvenil");

		} else {
			System.out.println("adulto");

		}

	}

}
