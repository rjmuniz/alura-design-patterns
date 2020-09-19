package decorator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Orcamento {
	private final double valor;
	private final List<Item> items;


	public List<Item> getItems() {
		return Collections.unmodifiableList(items);
	}	

	public double getValor() {
		return valor;
	}

	
	
	public Orcamento(double valor) {
		this.valor = valor;	
		this.items = new ArrayList<Item>();
	}
	
	public void adicionaItems( Item item) {
		items.add(item);
	}
	
	
}
