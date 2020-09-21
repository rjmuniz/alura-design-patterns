package memento;

import java.util.Calendar;

public class Programa {
	public static void main(String[] args) {

		Historico historico = new Historico();
		Contrato c1 = new Contrato(Calendar.getInstance(), "Ricardo", TipoContrato.NOVO);

		System.out.println(c1.getTipo().ordinal() + " " + c1.getTipo());

		c1.avanca();
		historico.adiciona(c1.salvaEstado());
		System.out.println(c1.getTipo().ordinal() + " " + c1.getTipo());

		c1.avanca();
		historico.adiciona(c1.salvaEstado());
		System.out.println(c1.getTipo().ordinal() + " " + c1.getTipo());

		c1.avanca();
		historico.adiciona(c1.salvaEstado());
		System.out.println(c1.getTipo().ordinal() + " " + c1.getTipo());

		Estado estadoAnterior = historico.volta(-1);
		System.out.println(estadoAnterior.getEstado().getTipo());
		estadoAnterior = historico.volta(-2);
		System.out.println(estadoAnterior.getEstado().getTipo());

	}
}
