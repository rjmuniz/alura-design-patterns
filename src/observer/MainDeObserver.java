package observer;



public class MainDeObserver {
	public static void main(String[] args) {
		
		
		
		
		NotaFiscalBuilder builder =  new NotaFiscalBuilder()
			.paraEmpresa("Xpto Empresa")
			.comCnpj("12.345.678/0001-23")
			.comItem(new ItemDaNota("Item 1", 200.0))
			.comItem(new ItemDaNota("Item 2", 300.0))
			.comItem(new ItemDaNota("Item 3", 400.0))
			.comObservacoes("observações");
		
		builder
		.AdicionaAcao(new NotaFiscalDao())
		.AdicionaAcao(new Impressora())
		.AdicionaAcao(new EnviadorDeEmail())
		.AdicionaAcao(new EnviadorDeSms());
		
		NotaFiscal nf = builder.build();
		
		
		
		
		
		System.out.println(nf.getValorBruto());
		
	}
	
}
