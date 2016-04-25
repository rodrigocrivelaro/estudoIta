package teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import principal.CarrinhoDeCompras;
import principal.Pizza;

public class TestCarrinhoDeCompra {

	@Before
	public void before() {
		Pizza.zeraIngredientesPizzaria();
	}
	
//	Faça os testes da classe CarrinhoDeCompras, verificando se o preço das pizzas são somados corretamente e se ele impede a adição de uma 
//	pizza sem ingredientes.	
	
	@Test
	public void testPrecoCarrinhoDeCompras() {
		CarrinhoDeCompras c1 = new CarrinhoDeCompras();
		
		//Valor da Pizza R$ 20,00
		Pizza p1 = new Pizza();
		p1.adicionaIngrediente("parmesão", 5);
		p1.adicionaIngrediente("cebola", 1);
		p1.adicionaIngrediente("requeijão", 5);

		//Valor da Pizza R$ 23,00
		Pizza p2 = new Pizza();
		p2.adicionaIngrediente("mussarela", 5);
		p2.adicionaIngrediente("cebola", 1);
		p2.adicionaIngrediente("presunto", 5);
		p2.adicionaIngrediente("ovo", 2);
		p2.adicionaIngrediente("bacon", 3);
		p2.adicionaIngrediente("tomate", 3);
		
		//Não é adicionada pois não possui ingredientes
		Pizza p3 = new Pizza();
		
		c1.adicionaPizza(p1);
		c1.adicionaPizza(p2);
		c1.adicionaPizza(p3);
		assertEquals(43.0, c1.getTotal(),0);
	}
	
	@Test
	public void testAddPizzaSemIngredientes() {
		CarrinhoDeCompras c1 = new CarrinhoDeCompras();
		Pizza p1 = new Pizza();
		c1.adicionaPizza(p1);
		assertEquals(0, c1.getQtdPizzas());
	}
}
