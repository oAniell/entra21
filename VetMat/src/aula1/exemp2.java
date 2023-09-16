package aula1;

public class exemp2 {

	public static void main(String[] args) {
		double mat[][] = new double [3][2];
		
		
		
		mat [0][0] = 1.86;   mat [0][1] = 7;
		mat [1][0] = 1.87;   mat [1][1] = 12;
		mat [2][0] = 1.93;   mat [2][1] = 18;
		
		
		double med = (mat [0][0] + mat [1][0] + mat [2][0]) / 3;
		System.out.println(med);
		
		
		
	}

}
