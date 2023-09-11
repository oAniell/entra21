package aula4;

import java.util.Scanner;

public class exe10 {

	public static void main(String[] args) {		
		//Escreva um algoritmo que leia a idade de 2 homens e 2 mulheres (considere que a idade entre homens e mulheres sempre serão 
		// diferentes). Calcule e escreva a soma das idades do homem mais velho com a
		// mulher mais nova, e o produto (x) das idades do homem mais novo com a mulher mais velha.
		
	Scanner ent = new Scanner(System.in);
	System.out.println(" digite a idade de dois homens e duas mulheres");
	int h1 = ent.nextInt();
	int h2 = ent.nextInt();
	int m1 = ent.nextInt();
	int m2 = ent.nextInt();
	
	if (h1 > h2 && m1 > m2) {
		System.out.println((h1 + m2) + " e "  + (h2 * m1));
		
	} else if (h2 > h1 && m2 > m1) {
		System.out.println((h2 + m1)+ " e " +(h1 * m2));
		
	} else if (h2 > h1 && m1 > m2) {
		System.out.println((h2 + m2) + " e " +(h1 * m1)); 
		
	} else if (h1 > h2 && m2 > m1) {
		System.out.println((h1 + m1) + " e " +(h2 * m2));
		
	}

	
	}

}
