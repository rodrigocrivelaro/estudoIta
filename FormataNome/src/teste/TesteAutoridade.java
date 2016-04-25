package teste;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import producao.Autoridade;
import producao.ComTitulo;
import producao.Informal;
import producao.Respeitoso;

public class TesteAutoridade {
	
	private Autoridade a;
	private Autoridade b;
		
	@Test
	public void testInformal() {
		a = new Autoridade("José", "da Silva", new Informal());
		b = new Autoridade("Fulana", "Pomposo", new Informal());
		
		assertEquals("José",a.getTratamento());
		assertEquals("Fulana",b.getTratamento());
	}
	
	@Test
	public void testRespeitoso() {
		a = new Autoridade("José", "da Silva", new Respeitoso("Masculino"));
		b = new Autoridade("Fulana", "Pomposa", new Respeitoso("Feminino"));
		
		assertEquals("Sr. da Silva",a.getTratamento());
		assertEquals("Sra. Pomposa",b.getTratamento());
	}
	
	@Test
	public void testComTitulo() {
		a = new Autoridade("José", "da Silva", new ComTitulo("Excelentíssimo"));
		b = new Autoridade("Fulana", "Pomposa", new ComTitulo("Mestra. das Correntes"));
		
		assertEquals("Excelentíssimo José da Silva",a.getTratamento());
		assertEquals("Mestra. das Correntes Fulana Pomposa",b.getTratamento());
	}

}
