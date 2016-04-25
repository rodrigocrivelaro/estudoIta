package teste;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import producao.CompraParcelada;

/*
 * Crie testes de unidade para 1, 2, 5 e 10 parcelas.
 */

public class TesteParcelarCompra {
	
	// Pagamento 1 parcela à vista
	@Test
	public void testPagUmaParcelaSemJuros() {
		CompraParcelada cp = new CompraParcelada(1000, 1, 0);
		
		assertEquals(1000.0, cp.getTotal(), 1);
	}

	// Pagamento 1 parcela 30 dias
	@Test
	public void testPagUmaParcelaComJuros() {
		CompraParcelada cp = new CompraParcelada(1000, 1, 1.5);
		
		assertEquals(1015.0, cp.getTotal(), 1);
	}
	
	@Test
	public void testPagDuasParcelas() {
		CompraParcelada cp = new CompraParcelada(1000, 2, 1.5);
		
		assertEquals(1030.2, cp.getTotal(), 1);
	}
	
	@Test
	public void testPagCincoParcelas() {
		CompraParcelada cp = new CompraParcelada(1000, 5, 1.5);
		
		assertEquals(1077.2, cp.getTotal(), 1);
	}
	
	@Test
	public void testPagDezParcelas() {
		CompraParcelada cp = new CompraParcelada(1000, 10, 1.5);
		
		assertEquals(1160.5, cp.getTotal(), 1);
	}

}
