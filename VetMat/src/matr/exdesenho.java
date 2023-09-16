package matr;

public class exdesenho {

	public static void main(String[] args) {
		
		
		int qntlin = 4;
		int qntcol = 4;
		
		String[][] matriz = new String[4][4];
		
		matriz[0][0] = "*";	matriz[2][0] = "*";
		matriz[0][1] = "*";	matriz[2][1] = " ";
		matriz[0][2] = "*";	matriz[2][2] = " ";
		matriz[0][3] = "*";	matriz[2][3] = "*";
		matriz[1][0] = "*";	matriz[3][0] ="*";
		matriz[1][1] = " ";	matriz[3][1] = "*";
		matriz[1][2] = " ";	matriz[3][2] ="*";
		matriz[1][3] = "*";	matriz[3][3] = "*";
		
		//A
		for (int lin = 0; lin < qntlin; lin++) {
			for (int col = 0; col < qntcol; col++) {
				matriz [lin] [col] = " * ";
				System.out.print(matriz [lin] [col]);
			}
			System.out.println(" ");
		}
		System.out.println( " ");
		//B
		for (int lin = 0; lin < qntlin; lin++) {
			for (int col = 0; col < qntcol; col++) {
				System.out.print(matriz [lin] [col]);
			}
			System.out.println(" ");
		}
		System.out.println( " ");
		//C
		for (int lin = 0; lin < qntlin; lin++) {
			for (int col = 0; col < qntcol; col++) {
				if (col>lin) {
					matriz [lin] [col] = "  ";
				}else {
					matriz [lin] [col] = " * ";
				}
				
				System.out.print(matriz [lin] [col]);
			}
			System.out.println(" ");
		}
		
		
		
		
		
		
		
	}

}
