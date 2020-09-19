package observer;

public class Impressora implements AcaoAposGerarNotaFiscal {
	public void executa(NotaFiscal nf) {		
		System.out.println("nota impressa");
	}

}
