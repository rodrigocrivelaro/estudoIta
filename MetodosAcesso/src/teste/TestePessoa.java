package teste;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import producao.Pessoa;

/*
 * Crie pelo menos 3 testes de unidade com pessoas com diferentes idades e signos. (sugestão: pegue datas de nascimento de amigos para fazer
 * os testes) 
 */
 
public class TestePessoa {
	Pessoa p1;
	Pessoa p2;
	Pessoa p3;
	Pessoa p4;
	String l;
	
	@Before
	public void iniciaPessoa() {
		l = "30/03/2016";
		
		p1 = new Pessoa("12/12/1926");
		p2 = new Pessoa("25/07/1999");
		p3 = new Pessoa("15/03/1965");
		p4 = new Pessoa("03/10/2010");
	}
	
	@Test
	public void testPessoaIdade() {
		assertEquals(89,p1.getIdade(l));
		assertEquals(16,p2.getIdade(l));
		assertEquals(51,p3.getIdade(l));
		assertEquals(5,p4.getIdade(l));
	}

	@Test
	public void testPessoaSigno() {
		assertEquals("Sagitário",p1.getSigno());
		assertEquals("Leão",p2.getSigno());
		assertEquals("Peixes",p3.getSigno());
		assertEquals("Libra",p4.getSigno());
	}
}
