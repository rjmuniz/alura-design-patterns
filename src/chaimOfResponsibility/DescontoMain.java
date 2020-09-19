package chaimOfResponsibility;

public class DescontoMain {
	
	public static void main(String[] args) {
		CalculadorDeDesconto descontos = new CalculadorDeDesconto();
		
		Orcamento o = new Orcamento(600);
		o.adicionaItems(new Item("CANETA",250));
		o.adicionaItems(new Item("LAPÍS",250));
		
		double descontoFinal = descontos.calcula(o);
		
		System.out.println(descontoFinal);
	}
}
