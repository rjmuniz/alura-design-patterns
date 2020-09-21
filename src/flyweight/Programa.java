package flyweight;

import java.util.Arrays;
import java.util.List;

public class Programa {
	public static void main(String[] args) {
		NotasMusicaisLazyLoading notas = new NotasMusicaisLazyLoading();
		
		List<Nota> musica = Arrays.asList(
				notas.pega("do"),
				notas.pega("do#"), 
				notas.pega("re"),
				notas.pega("mi"),
				notas.pega("fa"),
				notas.pega("fa"),
				notas.pega("fa"),
				notas.pega("pausa"),
				
				notas.pega("do"), 
				notas.pega("re"),
				notas.pega("do"), 
				notas.pega("re"),
				notas.pega("re"),
				notas.pega("re"),
				notas.pega("pausa"),
				
				notas.pega("do"),
				notas.pega("sol"),
				notas.pega("fa"),
				notas.pega("mi"),
				notas.pega("mi"),
				notas.pega("mi"),
				notas.pega("pausa"),
				
				notas.pega("do"), 
				notas.pega("re"),
				notas.pega("mi"),
				notas.pega("fa"),
				notas.pega("fa"),
				notas.pega("fa")
		);
		System.out.println(notas);
		System.out.println(musica);
		
		new Piano().toca(musica);
	}
}
