package command;

import java.util.Calendar;

public class Pedido {
	private String cliente;
	@SuppressWarnings("unused")
	private double valor;
	@SuppressWarnings("unused")
	private Status status;
	@SuppressWarnings("unused")
	private Calendar dataFinalizacao;

	public Pedido(String cliente, double valor) {
		this.cliente = cliente;
		this.valor = valor;
		this.status = Status.NOVO;
	}

	public void paga() {
		this.status = Status.PAGO;
	}

	public void finaliza() {
		dataFinalizacao = Calendar.getInstance();
		status = Status.ENTREGUE;
	}
	
	public String getCliente() {
		return cliente;
	}

}
