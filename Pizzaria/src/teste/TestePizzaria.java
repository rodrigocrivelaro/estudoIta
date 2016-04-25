package teste;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import principal.CarrinhoDeCompras;
import principal.Pizza;

public class TestePizzaria {

//	Procure criar os testes de forma que cada método de testes verifique um cenário e uma funcionalidade. 
//	Evite por exemplo, em um mesmo teste, verificar o preço da pizza e o registro de ingredientes ao mesmo tempo.
	
	@Before
	public void before() {
		Pizza.zeraIngredientesPizzaria();
	}
	
//	Verifique se o valor da Pizza está correto de acordo com a quantidade de ingredientes.
	@Test
	public void testValorPizzaIngredientes() {
		Pizza p1 = new Pizza();
		p1.adicionaIngrediente("mussarela", 5);
		assertEquals(15.0,p1.getPreco(),0);
		
		Pizza p2 = new Pizza();
		p2.adicionaIngrediente("mussarela", 5);
		p2.adicionaIngrediente("cebola", 1);
		p2.adicionaIngrediente("presunto", 5);
		assertEquals(20.0,p2.getPreco(),0);
		
		Pizza p3 = new Pizza();
		p3.adicionaIngrediente("mussarela", 5);
		p3.adicionaIngrediente("cebola", 1);
		p3.adicionaIngrediente("presunto", 5);
		p3.adicionaIngrediente("ovo", 2);
		p3.adicionaIngrediente("bacon", 3);
		p3.adicionaIngrediente("tomate", 3);
		assertEquals(23.0,p3.getPreco(),0);
		
	}

//	Verifique se o registro de ingredientes funcionou corretamente. Crie um método estático na classe Pizza que zera o registro de 
//	ingredientes e invoque ele em um método de inicialização ou finalização na classe de testes. Um método de teste deve ser 
//	independente do que aconteceu em outros métodos de teste!
	@Test
	public void testRegistroIngredientes() {
		Map<String,Integer> result = new HashMap<String, Integer>();
		result.put("bacon",3); 
		result.put("tomate",3); 
		result.put("mussarela",5); 
		result.put("cebola",2); 
		result.put("ovo",2); 
		result.put("presunto",5);
		result.put("parmesão", 5);
		result.put("requeijão", 5);
				
		Pizza p1 = new Pizza();
		p1.adicionaIngrediente("parmesão", 5);
		p1.adicionaIngrediente("cebola", 1);
		p1.adicionaIngrediente("requeijão", 5);
		
		Pizza p2 = new Pizza();
		p2.adicionaIngrediente("mussarela", 5);
		p2.adicionaIngrediente("cebola", 1);
		p2.adicionaIngrediente("presunto", 5);
		p2.adicionaIngrediente("ovo", 2);
		p2.adicionaIngrediente("bacon", 3);
		p2.adicionaIngrediente("tomate", 3);

		assertEquals(result,Pizza.ingredientesPizzaria);
	}
	
}
