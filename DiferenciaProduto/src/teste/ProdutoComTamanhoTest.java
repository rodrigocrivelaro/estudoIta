package teste;

import static org.junit.Assert.*;

import org.junit.Test;

import producao.ProdutoComTamanho;

/*
 * Crie testes com Unit para a classe Produto, para a classe ProdutoComTamanho e para a classe CarrinhoDeCompras. Os testes de cada classe 
 * devem ser colocados em classes separadas e devem estar em um diretório de código diferente das classes de produção.
**/

public class ProdutoComTamanhoTest {

	@Test
	public void testSeProdCTamIguais() {
		ProdutoComTamanho p1 = new ProdutoComTamanho("Sapato masculino", 1, 125.00, 41);
		ProdutoComTamanho p2 = new ProdutoComTamanho("Sapato masculino", 1, 125.00, 40);
		ProdutoComTamanho p3 = new ProdutoComTamanho("Sapato masculino", 1, 125.00, 36);
		ProdutoComTamanho p4 = new ProdutoComTamanho("Sapato masculino", 1, 125.00, 41);
		ProdutoComTamanho p5 = new ProdutoComTamanho("Sapato feminino", 2, 150.00, 40);
		ProdutoComTamanho p6 = new ProdutoComTamanho("Sapato feminino", 2, 150.00, 36);
		ProdutoComTamanho p7 = new ProdutoComTamanho("Sapato 1", 42, 150.00, 40);
		ProdutoComTamanho p8 = new ProdutoComTamanho("Sapato 2", 40, 150.00, 42);
		
		assertEquals(p1.equals(p2),false);
		assertEquals(p1.equals(p4),true);
		assertEquals(p5.equals(p6),false);
		assertEquals(p6.equals(p3),false);
		assertEquals(p2.equals(p5),false);
		assertEquals(p2.equals(p5),false);
		assertEquals(p4.equals(p1),true);
		assertEquals(p7.equals(p8),false);
		assertEquals(p8.equals(p7),false);
	}
}
