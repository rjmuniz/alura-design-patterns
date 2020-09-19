
public class CalculadorDeImposto {
	public void realizaOrcamento(Orcamento orcamento) {
			double iss = new ISS().calculaISS(orcamento);
			System.out.println(iss);		
	}
	
	public void realizaOrcamentoISS(Orcamento orcamento) {
		
			double iss = new ISS().calculaISS(orcamento);
			System.out.println(iss);
		
	}
}
