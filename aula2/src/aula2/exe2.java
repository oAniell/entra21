package aula2;

import java.util.Scanner;

public class exe2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		// Dados dois valores inteiros, escreva um algoritmo que informe se eles são
		// múltiplos ou não.

		// Para se certificar que um número A é múltiplo de um número B, basta dividir A
		// por B. Se o resultado for exato, sem sobrar resto, a é múltiplo de b.

		System.out.println("Digite dois numeros para calcular se sao multiplos entre si:");
		int nA = entrada.nextInt();
		int nB = entrada.nextInt();

		if (nA % nB == 0) {
			System.out.println("Os numeros sao multiplos entre si");

		} else {
			System.out.println("Os numeros nao sao multiplos de si");

		}
	}

}
