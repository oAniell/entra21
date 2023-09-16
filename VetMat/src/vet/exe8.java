package aula1;

import java.util.Scanner;

public class exe8 {

	public static void main(String[] args) {
		// Descreva um algoritmo que leia 12 valores reais e os coloque em um vetor de
		// 12 posições do tipo real. Imprima quais valores desses informados são maiores
		// que a média dos valores.
		Scanner ent = new Scanner(System.in);
		float soma = 0;
		
		float ahe[] = {1,2,3,4,5,6,7,8,9,10,11,12};
		for (int i = 0; i < ahe.length; i++) {
			soma += ahe[i];		
		}
		float md = soma/ahe.length;
		
		String valaux = " ";
		
		for (int i = 0; i < ahe.length; i++) {
			if (ahe[i] > md) {
				valaux += ahe[i] + " , ";
			} 
		}System.out.println("a media e: " + md);
		System.out.println("valores maior que a media: "+ valaux);
	}

}
