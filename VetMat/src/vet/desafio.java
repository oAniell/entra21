package aula1;

import java.util.Arrays;

public class desafio {

	public static void main(String[] args) {
		//Faça um algoritmo que inverta a ordem de uma array
		//(o primeiro elemento vai se tornar o último elemento)
		
		int val[] = new int[4];
		val[0] = 1;
		val[1] = 5;
		val[2] = 9;
		val[3] = 3;
		int aux = val.length - 1;
		int temp = 0;
		System.out.println(Arrays.toString(val));
		for (int i = 0; i <aux; ) {
			temp = val [i];
			val[i] = val [aux];
			val [aux] = temp;
			aux--;   i++;
		}
		System.out.println(Arrays.toString(val));
		
		
	}

}
