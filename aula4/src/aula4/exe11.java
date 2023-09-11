package aula4;

import java.util.Scanner;

public class exe11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ent = new Scanner(System.in);

// Um casal possui três filhos: Marquinhos, Zezinho e Luluzinha. Faça um 
//algoritmo para ler as idades dos filhos e exibir quem é o mais velho, o 
//irmão do meio e o caçula da família. Suponha que não haja empates.

		System.out.println("digite a idade de Marquinhos, zezinho e luluzinha");
		int m = ent.nextInt();
		int z = ent.nextInt();
		int l = ent.nextInt();

		if (m > z && z > l) {
			System.out.println("Marquinhos e o maos velho, Zezinho o do meio e Luluzinha o mais novo");
		} else if (m > l && l > z) {
			System.out.println("Marquinhos e o maos velho, Luluzinha o do meio e Zezinho o mais novo");
		} else if (z > l && l > m) {
			System.out.println("Zezinho e o maos velho, Luluzinha o do meio e Marquinhos o mais novo");
		} else if (z > m && m > l) {
			System.out.println("Zezinho e o maos velho, Marquinhos o do meio e Luluzinha o mais novo");
		} else if (l > m && m > z) {
			System.out.println("Luluzinha e o maos velho, Marquinhos o do meio e Zezinho o mais novo");
		} else if (l > z && z > m) {
			System.out.println("Luluzinha e o maos velho, Zezinho o do meio e Marquinhos o mais novo");
		}
	}

}
