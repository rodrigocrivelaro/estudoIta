package testes;

import static org.junit.Assert.*;

import org.junit.Test;

import excecoes.LeituraArquivoException;
import producao.ProcessadorArquivo;

public class TesteProcessadorArquivo {

	@Test
	public void testLerArquivoComSucesso() throws LeituraArquivoException {
		assertEquals("{idade=35, nome=Eduardo, sobrenome=Guerra}",ProcessadorArquivo.processar("arquivo.txt").toString());
	}
	
	@Test
	public void testLerArquivoErroIO() {
		try {
			ProcessadorArquivo.processar("arquivo1.txt");
			fail();
		} catch (LeituraArquivoException e) {
			assertEquals("Erro ao abrir o arquivo - arquivo1.txt (O sistema não pode encontrar o arquivo especificado)",e.getMessage());
		}
		
	}
	
	@Test
	public void testLerArquivoVazio() {
		try {
			ProcessadorArquivo.processar("arquivoVazio.txt");
			fail();
		} catch (LeituraArquivoException e) {
			assertEquals("Arquivo Vazio!",e.getMessage());
		}
		
	}
	
	@Test
	public void testLerArquivoMaisDeUmSeparador() {
		try {
			ProcessadorArquivo.processar("maisDeUmSeparador.txt");
			fail();
		} catch (LeituraArquivoException e) {
			assertEquals("Formato de arquivo inválido!",e.getMessage());
		}
		
	}

	@Test
	public void testLerArquivoSemSeparador() {
		try {
			ProcessadorArquivo.processar("semSeparador.txt");
			fail();
		} catch (LeituraArquivoException e) {
			assertEquals("Formato de arquivo inválido!",e.getMessage());
		}
		
	}

}
