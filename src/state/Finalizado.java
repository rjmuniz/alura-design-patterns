package state;

public class Finalizado implements EstadoDeUmOrcamento{

	@Override
	public void aplicaDescontoExtra(Orcamento orcamento) {
		throw new RuntimeException("Orçamentos finalizados nao recebem desconto extra");
	}
	
	@Override
	public void aprova(Orcamento orcamento) {
		throw new RuntimeException("Orçamentos já finalizado!");
	}

	@Override
	public void reprova(Orcamento orcamento) {
		throw new RuntimeException("Orçamentos já finalizado!");		
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		throw new RuntimeException("Orçamentos já finalizado!");
	}

}
