package builderAndFluentInterface;



public class MainDeBuilder {
	public static void main(String[] args) {
		
		NotaFiscalBuilder builder =  new NotaFiscalBuilder()
			.paraEmpresa("Xpto Empresa")
			.comCnpj("12.345.678/0001-23")
			.comItem(new ItemDaNota("Item 1", 200.0))
			.comItem(new ItemDaNota("Item 2", 300.0))
			.comItem(new ItemDaNota("Item 3", 400.0))
			.comObservacoes("observações");
		
		NotaFiscal nf = builder.build();
		
		System.out.println(nf.getValorBruto());
		
	}
	
}
