package teste;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import producao.CarrinhoDeCompras;
import producao.ProdutoComTamanho;

/*
 * Crie testes com Unit para a classe Produto, para a classe ProdutoComTamanho e para a classe CarrinhoDeCompras. Os testes de cada classe 
 * devem ser colocados em classes separadas e devem estar em um diretório de código diferente das classes de produção.
**/

public class CarrinhoDeComprasTest {
	CarrinhoDeCompras car;
	ProdutoComTamanho p1,p2,p3, p4, p5, p6, p7, p8, p9, p10;
	
	@Before
	public void iniciaCarrinho() {
		car = new CarrinhoDeCompras();
		
		p1 = new ProdutoComTamanho("Sapato Masculino", 1, 125.0, 41); 
		p2 = new ProdutoComTamanho("Sapato Masculino", 1, 125.0, 41);
		p3 = new ProdutoComTamanho("Sapato Masculino", 1, 125.0, 41);
		p4 = new ProdutoComTamanho("Sapato Masculino", 1, 125.0, 40); 
		p5 = new ProdutoComTamanho("Sapato Masculino", 1, 125.0, 39);
		p6 = new ProdutoComTamanho("Sapato Feminino", 2, 150.0, 40); 
	}
	
	@Test
	public void testAdicionaProdutoIgual() {
		car.adicionaProduto(p1, 10);
		car.adicionaProduto(p1, 20);
		car.adicionaProduto(p2, 35);
		car.adicionaProduto(p3, 35);
		car.adicionaProduto(p4, 35);
		
		assertEquals(100,(int)car.getQtdPrd(p1));
		assertEquals(100,(int)car.getQtdPrd(p2));
		assertEquals(35,(int)car.getQtdPrd(p4));
	}
	
	@Test
	public void testAdicionaProduto() {
		car.adicionaProduto(p1, 10);
		car.adicionaProduto(p2, 35);
		car.adicionaProduto(p3, 40);
		car.adicionaProduto(p4, 50);
		car.adicionaProduto(p5, 5);
		
		assertEquals(85,(int)car.getQtdPrd(p1));
		assertEquals(85,(int)car.getQtdPrd(p2));
		assertEquals(50,(int)car.getQtdPrd(p4));
		assertEquals(5,(int)car.getQtdPrd(p5));
	}

	@Test
	public void testRemoverProduto() {
		car.adicionaProduto(p1, 100);
		car.adicionaProduto(p4, 50);
		car.adicionaProduto(p6, 90);
		
		// Removo parcialmente a quantidade do produto p1
		car.removeProduto(p1, 50);
		assertEquals(50, (int) car.getQtdPrd(p1));
		
		// Removo toda a quantidade adicionada do produto p7
		car.removeProduto(p6, 90);
		assertEquals(false, car.getCarrinho().containsKey(p7));
		
		// Removo mais que a quantidade adicionada do produto p4
		car.removeProduto(p4, 51);
		assertEquals(50, (int) car.getQtdPrd(p4));
	}

	@Test
	public void testTotalCarrinho() {
		car.adicionaProduto(p1, 100); //12500
		car.adicionaProduto(p4, 50); //6250
		car.adicionaProduto(p6, 90); //13500
		
		assertEquals(32250.0, car.getTotal(), 0);
	}
	
}
