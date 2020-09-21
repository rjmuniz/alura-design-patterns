package implementer;

public class Programa {

	public static void main(String[] args) {
		Expressao esquerda = new Subtracao(new Numero(10), new Numero(5));
		Expressao direita = new Divisao(new Numero(20), new Numero(10));
		Expressao soma = new Multiplicacao(esquerda, direita);

		int resultado = new RaizQuadrada(new Subtracao(soma,new Numero(1))).avalia();
		System.out.println(soma.toString());
		System.out.println(resultado);
	}

}
