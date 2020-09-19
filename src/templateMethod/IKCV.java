package templateMethod;

public class IKCV extends TemplateDeImpostoCondicional {

	private boolean temItemMaiorQue100Reaiso(Orcamento orcamento) {
		for (Item item : orcamento.getItems())
			if (item.getValor() > 100)
				return true;

		return false;
	}

	@Override
	public boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() > 500 && temItemMaiorQue100Reaiso(orcamento);
	}

	@Override
	public double maximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.1;
	}

	@Override
	public double minimaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.06;
	}
}
