package testes;
import static org.junit.Assert.*;

import javax.security.auth.login.LoginException;

import org.junit.Test;

import producao.Autenticador;
import producao.Usuario;

public class TesteAutenticador {

	@Test
	public void loginComSucesso() throws producao.LoginException {
		Autenticador a = new Autenticador();
		Usuario u = a.logar("guerra", "senhaDoGuerra");
		assertEquals("guerra", u.getLogin());
	}
	
	@Test(expected = producao.LoginException.class)
	public void loginFalho() throws producao.LoginException {
		Autenticador a = new Autenticador();
		Usuario u = a.logar("guerra", "senhaerradaDoGuerra");
	}
	
	@Test
	public void verificaInformacaoDoErro() {
		Autenticador a = new Autenticador();
		try {
			Usuario u = a.logar("guerra", "senhaerradaDoGuerra");
			fail();
		} catch (producao.LoginException e) {
			assertEquals("guerra", e.getLogin());
		}
	}

}
