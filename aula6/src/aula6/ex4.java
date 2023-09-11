package aula6;

import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		// Crie um programa para ler 3 notas e mostrar a média delas.
Scanner ent = new Scanner(System.in);
int cont = 0;
for (int i = 1; i<4; i++) {
	System.out.println("escreva sua nota para fazer a media");
	double nota = ent.nextDouble();
	cont+= nota;
} System.out.println("sua media é " + cont  / 3);
	}

}
