package objeto;

public class metodo {

	public static void metparam(String nome) {
		System.out.println(nome);
	}
	public static void met2param(int idade1, int idade2, String texto) {
		System.out.println("a soma das idades: " + (idade1 + idade2));
		System.out.println("e o texto: " + texto );
	}

							// parametro
	public static void main(String[] args) {

		// nao podemos ter metodos dentro de metodos
		
		String nome = "is we";
		metparam(nome);
		metparam("gui");
		met2param(2, 3, nome);
	}

}
