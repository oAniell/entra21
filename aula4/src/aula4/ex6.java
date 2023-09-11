package aula4;

import java.util.Scanner;

public class ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ent = new Scanner(System.in);
		// Escreva um algoritmo para ler o ano de nascimento de 3 irmãos, escrever uma 
		// mensagem que indique se eles são TRIGÊMEOS, GÊMEOS, APENAS IRMÃOS.
		// Considere que eles são GÊMEOS se dois deles possuem a mesma idade e o outro
		// diferente dos demais, e apenas irmãos se todas as idades forem diferentes.

		System.out.println("digite o ano de nascimento de 3 irmaos");
		int i1 = ent.nextInt();
		int i2 = ent.nextInt();
		int i3 = ent.nextInt();
		
		if (i1 == i2 && i2==i3) {System.out.println("sao trigemeos");
		} else if (i1 == i2 || i1 == i3 || i2 == i3) {System.out.println("dois gemeos");
			
		}else {System.out.println("sao apenas irmao");}
	}

}
