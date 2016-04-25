package testes;

import static org.junit.Assert.*;

import org.junit.Test;

import principal.Paciente;

public class TestePaciente {

	/*	Instruções
	Crie os testes de unidade para a classe que voce criou anteriormente para o cálculo do IMC. 
	Crie pelo menos um teste para cada cenário abaixo, verificando o valor do IMC e o resultado obtido do método diagnostico()
	*/
	
	@Test
	public void testIMCAbaixo16() {
		String result = "Baixo peso, muito grave";
		Paciente p = new Paciente(60, 2);
		
		assertEquals(15.0,p.calcularIMC(),0);
		assertEquals(result,p.diagnostico());
	}

	@Test
	public void testIMCEntre16e16_99() {
		String result = "Baixo peso, grave";
		Paciente p = new Paciente(65, 2);

		assertEquals(16.25,p.calcularIMC(),0);
		assertEquals(result,p.diagnostico());
	}

	@Test
	public void testIMCEntre17e18_49() {
		String result = "Baixo peso";
		Paciente p = new Paciente(70, 2);

		assertEquals(17.5,p.calcularIMC(),0);
		assertEquals(result,p.diagnostico());
	}

	@Test
	public void testIMCEntre18_50e24_99() {
		String result = "Peso normal";
		Paciente p = new Paciente(95, 2);

		assertEquals(23.75,p.calcularIMC(),0);
		assertEquals(result,p.diagnostico());
	}

	@Test
	public void testIMCEntre25e29_99() {
		String result = "Sobrepeso";
		Paciente p = new Paciente(110, 2);

		assertEquals(27.5,p.calcularIMC(),0);
		assertEquals(result,p.diagnostico());
	}

	@Test
	public void testIMCEntre30e34_99() {
		String result = "Obesidade grau I";
		Paciente p = new Paciente(130, 2);

		assertEquals(32.5,p.calcularIMC(),0);
		assertEquals(result,p.diagnostico());
	}

	@Test
	public void testIMCEntre35e39_99() {
		String result = "Obesidade grau II";
		Paciente p = new Paciente(150, 2);
		System.out.println("imc = " + p.calcularIMC());
		assertEquals(37.5,p.calcularIMC(),0);
		assertEquals(result,p.diagnostico());
	}

	@Test
	public void testIMCMaior40() {
		String result = "Obesidade grau III (obesidade mórbida)";
		Paciente p = new Paciente(200, 2);
		System.out.println("imc = " + p.calcularIMC());
		assertEquals(50.0,p.calcularIMC(),0);
		assertEquals(result,p.diagnostico());
	}
	
}
