package flyweight;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

public class NotasMusicaisLazyLoading {
	private static Map<String, Nota> notas = new HashMap<String, Nota>();
	private static NotaFactory notaFactory;
	

	static {
		notaFactory = new NotaFactory();
		
	}
	public Nota pega(String nota) {
		if(notas.containsKey(nota)) {
			return notas.get(nota);
		} else {
			try {
				
				Nota notaMusical = notaFactory.getNota(nota);
				notas.put(nota, notaMusical);
				System.out.println("Criando nota: "+ nota);	
				return notaMusical;
			} catch (InstantiationException | IllegalAccessException | IllegalArgumentException
					| InvocationTargetException | NoSuchMethodException | SecurityException e) {
				return new Pausa();
			}
			
		}
			
	}
	
}