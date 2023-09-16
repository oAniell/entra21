package matr;

public class exemplo {

	public static void main(String[] args) {

		String[][] matriz = new String[3][2];

		matriz [0][0] = "doritos";
		matriz [0][1] = "3";
		matriz [1][0] = "chocolate";
		matriz [1][1] = "9";
		matriz [2][0] = "sushi";
		matriz [2][1] = "7";
		
		System.out.println(matriz[1][0] + " " + matriz [1][1]);
		System.out.println("comida: " + matriz[2][0] + " votos: " + matriz[2][1]);
		
	}

}
