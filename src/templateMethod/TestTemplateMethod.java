package templateMethod;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class TestTemplateMethod {

	@Test
	void testICPP_Menor500() {
		Orcamento orcamento = new Orcamento(499);
		orcamento.adicionaItems(new Item("Caneta", 1));

		double actual = new ICPP().calcula(orcamento);

		assertEquals(orcamento.getValor() * 0.05, actual);
	}

	@Test
	void testICPP_Maior500() {
		Orcamento orcamento = new Orcamento(501);
		orcamento.adicionaItems(new Item("Caneta", 1));

		double actual = new ICPP().calcula(orcamento);

		assertEquals(orcamento.getValor() * 0.07, actual);
	}

	@Test
	void testIKCV_Menor500EItemMenorQue100() {
		Orcamento orcamento = new Orcamento(499);
		orcamento.adicionaItems(new Item("Caneta", 100));

		double actual = new IKCV().calcula(orcamento);

		assertEquals(orcamento.getValor() * 0.06, actual);
	}

	@Test
	void testIKCV_Menor500EItemMaiorQue100() {
		Orcamento orcamento = new Orcamento(499);
		orcamento.adicionaItems(new Item("Caneta", 101));

		double actual = new IKCV().calcula(orcamento);

		assertEquals(orcamento.getValor() * 0.06, actual);
	}

	@Test
	void testIKCV_Maior500EItemMaiorQue100() {
		Orcamento orcamento = new Orcamento(501);
		orcamento.adicionaItems(new Item("Caneta", 1));
		orcamento.adicionaItems(new Item("Caneta", 101));

		double actual = new IKCV().calcula(orcamento);

		assertEquals(orcamento.getValor() * 0.1, actual);
	}

}
