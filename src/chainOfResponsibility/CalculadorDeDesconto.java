package chainOfResponsibility;

public class CalculadorDeDesconto {
	public double calcula(Orcamento orcamento) {
		Desconto desconto = 
				new DescontoPorCincoItens(
						new DescontoPorMaisDeQuinhentosReais(
								new SemDesconto()))				;
			
		
		return desconto.desconta(orcamento);
	}
}
