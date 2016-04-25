package testes;

import static org.junit.Assert.*;

import org.junit.Test;

import embaralhadores.EmbaralhadorAoContrario;
import embaralhadores.EmbaralhadorImparPar;
import embaralhadores.EmbaralhadorParImpar;

public class TestEmbaralhadores {
	
	String palavra = "abracadabra";
	
	@Test
	public void testEmbaralharAoContrario() {
		EmbaralhadorAoContrario e = new EmbaralhadorAoContrario();
		assertEquals("arbadacarba",e.embaralhar(palavra));
	}

	@Test
	public void testEmbaralharParImpar() {
		EmbaralhadorParImpar e = new EmbaralhadorParImpar();
		assertEquals("baaracadrba",e.embaralhar(palavra));
	}
	
	@Test
	public void testEmbaralharImparPar() {
		EmbaralhadorImparPar e = new EmbaralhadorImparPar();
		assertEquals("arbcadabaar",e.embaralhar(palavra));
	}
}
