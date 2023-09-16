package aula1;

public class ex9 {

	public static void main(String[] args) {

		int tam = 3; //boas praticas
			int[] v1 = new int [tam];
			int[] v2 = new int [tam];
			int[] v3 = new int [tam];
		
		v1[0] = 1;
		v1[1] = 2;
		v1[2] = 3;
		
		v2[0] = 1;
		v2[1] = 5;
		v2[2] = 6;
			
		//v3[0]= v1[0] + v2[0];	
		//v3[1]= v1[1] + v2[1];	
		//v3[2]= v1[2] + v2[2];	
		
		for (int i = 0; i < tam; i++) {
			v3[i] = v1[i] + v2[i];
		}
		for (int i = 0; i < tam; i++) {	
		System.out.println(v3[i]);	
		}	
	}

}
