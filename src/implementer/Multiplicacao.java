package implementer;

public class Multiplicacao implements Expressao   {
	private Expressao esquerda;
	private Expressao direita;

	public Multiplicacao(Expressao esquerda, Expressao direita) {
		this.esquerda = esquerda;
		this.direita = direita;

	}

	@Override
	public int avalia() {
		return esquerda.avalia() * direita.avalia();
	}

	@Override
	public String toString() {
		return String.format("(%s * %s)", esquerda.toString(), direita.toString());
	}
}

