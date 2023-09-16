package matr;

public class vddex1 {

	public static void main(String[] args) {
		// Criar uma matriz com 1 linha e 10 colunas, na mesma verifique quantos valores
		// são par e quantos valores são impar e calcule a média dos valores
		//Agora criem uma segunda linha e novamente somem todas as colunas, 
		//por fim somem os valores da linho 0 e da linha 1
		
		int contimpar = 0;
		int contpar = 0;
		double soma = 0;
		double soma2 = 0;
		double soma3 = 0;
		
		int[][] matriz = new int[2][10];

		matriz[0][0] = 1;	matriz[1][0] = 11;
		matriz[0][1] = 2;	matriz[1][1] = 12;
		matriz[0][2] = 3;	matriz[1][2] = 13;
		matriz[0][3] = 4;	matriz[1][3] = 14;
		matriz[0][4] = 5;	matriz[1][4] = 15;
		matriz[0][5] = 6;	matriz[1][5] = 16;
		matriz[0][6] = 7;	matriz[1][6] = 17;
		matriz[0][7] = 8;	matriz[1][7] = 18;
		matriz[0][8] = 9;	matriz[1][8] = 19;
		matriz[0][9] = 10;	matriz[1][9] = 20;

		for (int lin = 0; lin < matriz.length; lin++) {
			for (int col = 0; col < matriz[lin].length; col++) {
			soma += matriz[lin][col];

			if (matriz[lin][col] % 2 == 0) {
				contpar++;
			}
			if (matriz[lin][col] % 2 != 0) {
				contimpar++;
			}}}
		for (int i = 0; i < matriz[0].length; i++) {
			soma2 += matriz[0][i];	
		}
		
		for (int i2 = 0; i2 < matriz[1].length; i2++) {
			soma3 += matriz[1][i2];	
		}
		
		System.out.println("A soma da linha 0 eh: " + soma2);
		System.out.println("A soma da linha 1 eh: " + soma3);
		System.out.println("tem " + contpar + " numeros pares e " + contimpar
				+ " numeros impares. \nA media dos valores e: " + (soma / 20) + " e a soma de todas e: " + soma);

	}

}
