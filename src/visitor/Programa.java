package visitor;

public class Programa {

	public static void main(String[] args) {
		Expressao esquerda = new Subtracao(new Numero(10), new Numero(5));
		Expressao direita = new Soma(new Numero(20), new Numero(10));
		Expressao soma = new Subtracao(esquerda, direita);

		
		Expressao expressao = new Subtracao(new Subtracao(soma,new Numero(1)), new Numero (1));
		int resultado = expressao.avalia(); 
		System.out.println(resultado);
		
		
		Visitor impressora = new Visitor();
		expressao.aceita(impressora);		
	}
}
