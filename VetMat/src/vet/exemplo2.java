package aula1;

import java.util.Scanner;

public class exemplo2 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		int aux = 0;
		double med = 0;
		double notas[] = new double[3];
		for (int i = 0; i < 3; i++) {
			System.out.println("digite as notas");
			notas[i] = ent.nextInt();
			aux += notas[i];
			med = aux / 3;
		}
		System.out.println(med);

	}

}
