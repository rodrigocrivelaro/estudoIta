import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import modelos.CarroDeCorrida;
import modelos.CarroMult;

public class TesteCarroMult {

CarroDeCorrida c;
	
	@Before
	public void inicializaCarro(){
		c = new CarroMult("Tesla", 1.8, 100);
	}
	
	@Test
	public void testCarroParado() {
		assertEquals(0, c.getVelocidade());
	}
	
	@Test
	public void testAcelerarUmaVez() {
		c.acelerar();
		assertEquals(10, c.getVelocidade());
	}
	
	@Test
	public void testAcelerarDuasVezes() {
		c.acelerar();
		c.acelerar();
		assertEquals(18, c.getVelocidade());
	}
	
	@Test
	public void testAcelerarAteVelocidadeMaxima() {
		for(int i = 0; i < 14; i++)
			c.acelerar();
		assertEquals(100, c.getVelocidade());
	}
	
	@Test
	public void testFrear() {
		c.acelerar();
		c.frear();
		assertEquals(5, c.getVelocidade());
	}
	
	@Test
	public void testFrearAteZero() {
		c.acelerar();
		c.frear();
		c.frear();
		c.frear();
		c.frear();
		assertEquals(0, c.getVelocidade());
	}


}
