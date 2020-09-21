package bridgeAndAdapters;

import java.util.Calendar;

public class Programa {

	public static void main(String[] args)  {
		////////bridge
		MapaBridge mapa = (MapaBridge) new GoogleMaps();
		mapa.devolveMapa("rua vergueiro");
	
		////////////adapter
		RelogioDoSistema relogio =new RelogioDoSistema();
		Calendar dataAtual = relogio.Hoje();
		System.out.println(dataAtual);
	}
}
