package memento;

import java.util.ArrayList;
import java.util.List;

public class Historico {
	private List<Estado> estadosSalvos = new ArrayList<Estado>();

	public Estado pega(int index) {
		return estadosSalvos.get(index);
	}

	public void adiciona(Estado estado) {
		estadosSalvos.add(estado);

	}

	public Estado volta(int index) {
		var i = totalByIndex() + index;
		return estadosSalvos.get(i);
	}

	private int totalByIndex() {
		return estadosSalvos.size() - 1;
	}
}
