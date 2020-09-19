package chaimOfResponsibility;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestChainOfResponsibility {

	@Test
	void VendaMenor500EMenor5ItemsTest(){
		double value = 499;
		Orcamento o = new Orcamento(value);
		o.adicionaItems(new Item("item1", 499));
		double descontoAtual = new CalculadorDeDesconto().calcula(o);
		
		assertEquals(value * 0.0, descontoAtual);
	}
	
	@Test
	void VendaMaior500EMenor5ItemsTest(){
		double value = 501;
		Orcamento o = new Orcamento(value);
		o.adicionaItems(new Item("item1", 499));
		double descontoAtual = new CalculadorDeDesconto().calcula(o);
		
		assertEquals(value * 0.07, descontoAtual);
	}

	@Test
	void VendaMenor500EMaior5ItemsTest(){
		double value = 499; 
		Orcamento o = new Orcamento(value);
		o.adicionaItems(new Item("item1", 99));
		o.adicionaItems(new Item("item1", 99));
		o.adicionaItems(new Item("item1", 99));
		o.adicionaItems(new Item("item1", 99));
		o.adicionaItems(new Item("item1", 99));
		o.adicionaItems(new Item("item1", 99));
		double descontoAtual = new CalculadorDeDesconto().calcula(o);
		
		assertEquals(value * 0.1, descontoAtual);
	}
	
	@Test
	void VendaMaior500EMaior5ItemsTest(){
		double value = 501;
		Orcamento o = new Orcamento(value);
		o.adicionaItems(new Item("item1", 99));
		o.adicionaItems(new Item("item1", 99));
		o.adicionaItems(new Item("item1", 99));
		o.adicionaItems(new Item("item1", 99));
		o.adicionaItems(new Item("item1", 99));
		o.adicionaItems(new Item("item1", 99));
		double descontoAtual = new CalculadorDeDesconto().calcula(o);
		
		assertEquals(value * 0.1, descontoAtual);
	}

}
