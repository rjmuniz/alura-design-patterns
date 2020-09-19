package observer;

public class EnviadorDeEmail implements AcaoAposGerarNotaFiscal {

	public void executa(NotaFiscal nf) {		
		System.out.println("Enviei por email");
	}
}
