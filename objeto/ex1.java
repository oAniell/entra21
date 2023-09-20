package objeto;

public class ex1 {
	public static void met1() {
		String nome = "gui";
		int idade = 20;
		String corfav = "azul";
		System.out.println(nome);
		System.out.println(idade);
		System.out.println(corfav);
	}

	public static void met2() {
		int v1 = 10;
		int v2 = 100;
		System.out.println((v1 * v2));
	}

	public static void met3() {
		int v1 = 10;
		int v2 = 100;
		System.out.println((v1 + v2));
	}

	public static void met4() {
		double alt1 = 1.86;
		double alt2 = 1.93;
		double med = (alt1 + alt2) / 2;
		System.out.println("Arthur tem " + alt1 + " e Pedro tem " + alt2);
		System.out.println("A media das alturas eh de " + med);
	}

	public static void main(String[] args) {
		met1();
		met2();
		met3();
		met4();
	}

}
