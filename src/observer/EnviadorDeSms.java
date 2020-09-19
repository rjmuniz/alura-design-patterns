
package observer;

public class EnviadorDeSms implements AcaoAposGerarNotaFiscal{
	public void executa(NotaFiscal nf) {
		System.out.println("Enviei por sms");
	}


}
