package implementer;

public class RaizQuadrada implements Expressao   {
	private Expressao esquerda;

	public RaizQuadrada(Expressao esquerda) {
		this.esquerda = esquerda;

	}

	@Override
	public int avalia() {
		return (int) Math.sqrt(esquerda.avalia());
	}

	@Override
	public String toString() {
		return String.format("sqrt(%s)", esquerda.toString());
	}
}
