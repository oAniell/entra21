package aula2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ex8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		DecimalFormat formatar = new DecimalFormat("0.00");

		//entrada
		System.out.println("insira o valor em dolar para troca:");
		double valor = entrada.nextDouble();
		final double valorDolar = 4.97;
		
		//processo
		double devolver = valor * valorDolar;
		
		//saida
		System.out.println("seu valor á receber em reais é de " + formatar.format(devolver) + "$");

	}

}
