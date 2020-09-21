package flyweight;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

public class NotaFactory {
	private static Map<String, Class<? extends Nota>> notas = new HashMap<String, Class<? extends Nota>>();
	
	static {
		notas.put("do", Do.class);
		notas.put("do#", DoSustenido.class);
		notas.put("re", Re.class);
		notas.put("mi", Mi.class);
		notas.put("fa", Fa.class);
		notas.put("sol", Sol.class);
		notas.put("la", La.class);
		notas.put("si", Si.class);
		notas.put("pausa", Pausa.class);
	}
	
	public Nota getNota(String nota) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		return notas.get(nota).getConstructor().newInstance();
	}

}
