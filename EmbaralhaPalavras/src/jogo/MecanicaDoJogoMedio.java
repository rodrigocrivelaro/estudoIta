package jogo;

import interfaces.MecanicaDoJogo;

public class MecanicaDoJogoMedio extends MecanicaDoJogoGenerica implements MecanicaDoJogo {
	
	private int pontos;
	
	@Override
	public String iniciaJogo(String dificuldade) {
		super.iniciaJogo(dificuldade);
		numPalavras = 10;
		pontos = 0;
		return palavraEmbaralhada;
	}

	@Override
	public int setNumTentativas() {
		return 3;
	}

	@Override
	protected void pontuar() {
		pontos += getNumTentativas() == 1 ?  1 : getNumTentativas() == 2 ? 3 : 10;
	}
	
	@Override
	public int getPontuacao() {
		return this.pontos;
	}
}
