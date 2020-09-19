package observer;

public class NotaFiscalDao implements AcaoAposGerarNotaFiscal{

	public void executa(NotaFiscal nf) {
		System.out.println("salvei no banco de dados");
	}
}
