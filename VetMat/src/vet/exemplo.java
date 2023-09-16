package aula1;

import java.util.Scanner;

public class exemplo {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		//int idades[] = new int[7];

		//idades[0] = 19;
		//idades[1] = 17;
		//idades[2] = 16;
		//idades[3] = 18;
		//idades[4] = 18;
		//idades[5] = 17;
		//idades[6] = 20;

		//int soma = idades[0] + idades[1] + idades[2] + idades[3] + idades[4] + idades[5] + idades[6];

		//int med = (idades[0] + idades[1] + idades[2] + idades[3] + idades[4] + idades[5] + idades[6]) / 7;

		//System.out.println(idades[0]);
		//System.out.println(idades[6]);
		//System.out.println(med);
		
		//for(int i = 0; i < 7; i++) {
			//System.out.println(idades[i]);}
			
			String nome[] = new String[21];
			for (int x = 0; x <21; x++) {
				System.out.println("nome");
			nome[x] = ent.next();
			}
			
			for (int x = 0; x <21; x++) {
				System.out.println(nome[x]);
			}
			
			
			
					
		}
	}

