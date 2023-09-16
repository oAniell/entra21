package aula1;

public class exe2 {

	public static void main(String[] args) {
		// Crie uma array de 5 elementos e no momento de imprimir, 
		//comece pelo último elemento até o primeiro elemento.
		
		int valores[] = new int [5];
		valores [0] = 1;
		valores [1] = 2;
		valores [2] = 3;
		valores [3] = 4;
		valores [4] = 5;
		
		for( int i = 4; i >= 0; i--) {
			System.out.println(valores [i]);
		}

	}

}
