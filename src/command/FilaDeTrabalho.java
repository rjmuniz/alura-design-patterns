package command;

import java.util.ArrayList;
import java.util.List;

public class FilaDeTrabalho {
	private List<Comando> comandos;
	
	public FilaDeTrabalho() {
		comandos = new ArrayList<Comando>();
	}
	
	public void adiciona(Comando comando) {
		comandos.add(comando);
	}
	
	
	public void processa() {
		System.out.println("iniciando processamento");
		for(Comando comando : comandos)
			comando.executa();
		
		System.out.println("processamento conluido com sucesso!");
	}

}
