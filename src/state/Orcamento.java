package state;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Orcamento {
	protected  double valor;
	private final List<Item> items;

	protected EstadoDeUmOrcamento estadoAtual;
	
	public static final int EM_APROVACAO = 1;
	public static final int APROVADO = 0;
	

	public List<Item> getItems() {
		return Collections.unmodifiableList(items);
	}	

	public double getValor() {
		return valor;
	}

	
	
	public Orcamento(double valor) {
		this.valor = valor;	
		this.items = new ArrayList<Item>();
		estadoAtual = new EmAprovacao();
	}
	
	public void adicionaItems( Item item) {
		items.add(item);
	}

	public void aplicaDescontoExtra() {
		estadoAtual.aplicaDescontoExtra(this);		
	}
	
	public void aprova() {
		estadoAtual.aprova(this);
	}
	public void reprova() {
		estadoAtual.reprova(this);
	}
	public void finaliza() {
		estadoAtual.finaliza(this);
	}
	
}
