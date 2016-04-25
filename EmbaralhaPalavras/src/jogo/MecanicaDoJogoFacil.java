package jogo;

import interfaces.MecanicaDoJogo;

public class MecanicaDoJogoFacil extends MecanicaDoJogoGenerica implements MecanicaDoJogo {
	private int pontos;
	
	@Override
	public String iniciaJogo(String dificuldade) {
		super.iniciaJogo(dificuldade);
		numPalavras = 3;
		pontos = 0;
		return palavraEmbaralhada;
	}

	@Override
	public int setNumTentativas() {
		return 5;
	}
	
	@Override
	protected void pontuar() {
		this.pontos += 10;
	}
	
	@Override
	public int getPontuacao() {
		return this.pontos;
	}
	
}
