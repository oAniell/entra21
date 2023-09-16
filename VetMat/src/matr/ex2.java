package matr;

public class ex2 {

	public static void main(String[] args) {
		// Criem uma matriz de 5 linhas e 1 coluna, somem todos os valores
		// Posteriormente verifique a média e imprima somente os valores que estão acima
		// dela

		double med = 0;
		int soma = 0;
		
		int[][] matriz = new int[5][1];

		matriz[0][0] = 1;
		matriz[1][0] = 2;
		matriz[2][0] = 3;
		matriz[3][0] = 4;
		matriz[4][0] = 5;

		for (int lin = 0; lin < matriz.length; lin++) {
			for (int col = 0; col < matriz[lin].length; col++) {

				soma += matriz[lin][col];
				med = soma / 5;
			}
		}
		System.out.println("A soma dos valores eh: " + soma);
		System.out.println("A media deles eh: " + (soma / 5));
		for (int i = 0; i < matriz.length; i++) {
			if (matriz[i][0] > med) {
				System.out.println("o valor " + matriz[i][0] + " eh maior que a media");
			}
		}
		

	}

}
