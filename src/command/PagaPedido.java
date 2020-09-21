package command;

public class PagaPedido implements Comando {

	private Pedido p;

	public PagaPedido(Pedido p) {
		this.p = p;

	}

	@Override
	public void executa() {
		System.out.println(String.format("pago pedido: %s", p.getCliente()));
		p.paga();
	}

}
