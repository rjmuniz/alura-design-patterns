package strategy;

public class CalculadorDeImposto {
	public void realizaCalculo(Orcamento orcamento, Imposto imposto ) {
			double calculo = imposto.calcula(orcamento);
			System.out.println(String.format("Imposto %s = %f", 
					imposto.getClass().getName() ,calculo));		
	}

}
