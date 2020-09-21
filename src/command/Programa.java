package command;

public class Programa {

	public static void main(String[] args) {
		Pedido pedido1 = new Pedido("Pedido 1", 150);
		Pedido pedido2 = new Pedido("Peiddo 2", 560);
		Pedido pedido3 = new Pedido("Peiddo 3", 560);
		
		FilaDeTrabalho fila = new FilaDeTrabalho();
		
		fila.adiciona(new PagaPedido(pedido1));
		fila.adiciona(new PagaPedido(pedido2));
		fila.adiciona(new PagaPedido(pedido3));
		fila.adiciona(new ConcluiPedido(pedido1));
		fila.adiciona(new ConcluiPedido(pedido2));
		
		fila.processa();
	}

}
