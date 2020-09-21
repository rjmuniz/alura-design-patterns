package memento;

import java.util.Calendar;

public class Contrato {
	
	private Calendar data;
	private String cliente;
	private TipoContrato tipo;

	public Contrato(Calendar cata, String cliente, TipoContrato tipo) {
		this.data = cata;
		this.cliente = cliente;
		this.tipo = tipo;
	}

	public Calendar getCata() {
		return data;
	}

	public String getCliente() {
		return cliente;
	}

	public TipoContrato getTipo() {
		return tipo;
	}
	
	public void avanca() {
		if(tipo == TipoContrato.NOVO)tipo = TipoContrato.EM_ANDAMENTO;
		else if(tipo == TipoContrato.EM_ANDAMENTO)tipo = TipoContrato.ACERTADO;
		else if(tipo == TipoContrato.ACERTADO)tipo = TipoContrato.CONCLUIDO;

	}
	
	public Estado salvaEstado() {
		return new Estado(new Contrato(this.data, this.cliente, this.tipo));
	}

	
}
