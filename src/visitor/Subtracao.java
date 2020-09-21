package visitor;

public class Subtracao implements Expressao {
	private Expressao esquerda;
	private Expressao direita;

	public Subtracao(Expressao esquerda, Expressao direita) {
		this.esquerda = esquerda;
		this.direita = direita;

	}

	@Override
	public int avalia() {
		return esquerda.avalia() - direita.avalia();
	}

	@Override
	public String toString() {
		return String.format("(%s - %s)", esquerda.toString(), direita.toString());
	}
	
	public Expressao getEsquerda() {
		return esquerda;
	}
	public Expressao getDireita() {
		return direita;
	}
	
	@Override
	public void aceita(Visitor impressora) {
			impressora.visitaSubtracao(this);	
	}
}
