package matr;

public class matrix {

	public static void main(String[] args) {
		
		
		int qntlin = 2;
		int qntcol = 5;
		
		int [][] matriz = new int [qntlin][qntcol];
		
		matriz[0][0] = 1;	matriz[1][0] = 6;
		matriz[0][1] = 2;	matriz[1][1] = 7;
		matriz[0][2] = 3;	matriz[1][2] = 8;
		matriz[0][3] = 4;	matriz[1][3] = 9;
		matriz[0][4] = 5;	matriz[1][4] = 10;
		
		for (int lin = 0; lin < qntlin; lin++) {
			for (int col = 0; col < qntcol; col++) {
				System.out.println(matriz [lin] [col]);
			}
		}

	}

}
