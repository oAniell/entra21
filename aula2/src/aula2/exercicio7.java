package aula2;

import java.util.Scanner;

public class exercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
				
		//entrada leia o nome do vendedor, salario fixo, total de vendas(em dinheiro)
		System.out.println("Nome do vendedor:");
		String nome=entrada.nextLine();
		System.out.println("Salario fixo:");
		double salarioFixo=entrada.nextDouble();
		System.out.println("Total de vendas no mes:");
		double tvendas=entrada.nextDouble();
		
		//processo - ganha 15% sobre as vendas efetuadas (o,15)
		final double comissao = 0.15 * tvendas;
		System.out.println("O funcionario " + nome + " e o salario total é " + comissao + salarioFixo);
		
		
				
	}

}
