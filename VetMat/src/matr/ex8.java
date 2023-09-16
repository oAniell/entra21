package matr;

public class ex8 {

	public static void main(String[] args) {
		// Dada a seguinte matriz, calcule: 
		//1 2 3	4 
		//5	6 7	8 
		//9 10 11 12 
		//13 14	15 16 
		//a) A soma dos elementos de primeira coluna; 
		//b) O produto dos elementos da primeira linha; 
		//c) A soma de todos os elementos; 
		//d) O produto da diagonal principal.

		int matriz [][] = {
				{1, 2, 3, 4},
				{5, 6, 7, 8},
				{9, 10, 11, 12},
				{13, 14, 15, 16} };
		
		int soma = 0;
		int prod = 1;
		int somaele = 0;
		int prodd = 1;
		
		for (int lin = 0; lin < 4; lin++) {
			for (int col = 0; col < 4; col++) {
				    //A
				if (col == 0) {
					soma += matriz[lin][col];
					//B
				}if (lin == 0) {
					prod = prod * matriz[lin][col];
					//D
				}if (col == lin) {
					prodd = prodd * matriz[lin][col];
					//C
				}somaele += matriz[lin][col];
			}
		}System.out.println("A soma dos elementos de primeira coluna eh " + soma +
				"\nO produto dos elementos da primeira linha eh " + prod + "\nA soma de todos os elementos eh " +
				somaele + "\nO produto da diagonal principal eh " + prodd);
		
		
		
		
		
	}

}
