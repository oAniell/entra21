package aula6;

import java.util.Scanner;

public class exe3 {

	public static void main(String[] args) {
		// Faça um programa, utilizando for, em que o usuário tenha a opção de 
		//inserir dois valores e ocorra a subtração deles, deve ocorrer por 3 vezes.
Scanner ent = new Scanner(System.in);
for (int i = 1; i<=3; i++) {
	
	System.out.println("digite dois valores:");
	double v1 = ent.nextDouble();
	double v2 = ent.nextDouble();
	double result = v1 - v2;
	System.out.println("a subtracao dos dois tem o resultado " + result);
}
	}

}
