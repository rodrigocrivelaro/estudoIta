import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TesteCompra {

	@Test
	public void compraAVista() {
		Compra c = new Compra(500);
		assertEquals(1, c.getNumeroParcelas());
		assertEquals(500, c.getValorParcela());
		assertEquals(500, c.getValorTotal());
	}
	
	@Test
	public void compraParcelada() {
		Compra c = new Compra(4,250);
		assertEquals(4, c.getNumeroParcelas());
		assertEquals(250, c.getValorParcela());
		assertEquals(1000, c.getValorTotal());
	}

}
