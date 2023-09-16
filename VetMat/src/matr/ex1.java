package matr;

public class ex1 {

	public static void main(String[] args) {
		//Crie uma matriz 3 linhas e 3 colunas,
		//preencha a mesma de A até I, posteriormente imprima a matriz.
		
		String mat[][] = new String [3][3];
		
		
		
		mat [0][0] = "A";   mat [0][1] ="B";  mat [0][2] ="C";
		mat [1][0] = "D";   mat [1][1] = "E"; mat [1][2] ="F";
		mat [2][0] = "G";   mat [2][1] = "H"; mat [2][2] ="I";
		
		
		for( int lin = 0; lin < mat.length; lin++) {
			
			for (int col = 0; col < mat[0].length; col++) {
				
				System.out.print(mat[lin][col] + "  ");
			}System.out.println("\n");
		}
		
		
		
	}

}
