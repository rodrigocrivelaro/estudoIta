package teste;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import producao.Produto;

/*
 * Crie testes com Unit para a classe Produto, para a classe ProdutoComTamanho e para a classe CarrinhoDeCompras. Os testes de cada classe 
 * devem ser colocados em classes separadas e devem estar em um diretório de código diferente das classes de produção.
**/

public class ProdutoTest {

	@Test
	public void testSeProdutosIguais() {
		Produto p1 = new Produto("Sapato masculino", 1, 125.00);
		Produto p2 = new Produto("Sapato masculino", 1, 125.00);
		Produto p3 = new Produto("Sapato masculino", 1, 125.00);
		Produto p4 = new Produto("Sapato masculino", 1, 125.00);
		Produto p5 = new Produto("Sapato feminino", 2, 150.00);
		Produto p6 = new Produto("Sapato feminino", 2, 150.00);
		
		assertEquals(p1.equals(p2),true);
		assertEquals(p1.equals(p4),true);
		assertEquals(p5.equals(p6),true);
		assertEquals(p5.equals(p3),false);
		assertEquals(p3.equals(p6),false);
		assertEquals(p2.equals(p5),false);
		assertEquals(p5.equals(p2),false);
		assertEquals(p4.equals(p1),true);
	}
}
