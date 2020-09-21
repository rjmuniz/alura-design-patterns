package command;

public class ConcluiPedido implements Comando {

	private Pedido p;
	public ConcluiPedido(Pedido p) {
		this.p = p;
		
	}
	
	@Override
	public void executa() {
		System.out.println(String.format("concluido pedido: %s", p.getCliente()));
		p.finaliza();		
	}

}
