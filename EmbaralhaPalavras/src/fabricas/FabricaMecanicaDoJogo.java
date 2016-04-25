package fabricas;

import interfaces.MecanicaDoJogo;
import jogo.MecanicaDoJogoDificil;
import jogo.MecanicaDoJogoFacil;
import jogo.MecanicaDoJogoMedio;

public class FabricaMecanicaDoJogo {

	private String dificuldade;


	public FabricaMecanicaDoJogo(String dificuldade) {
		this.dificuldade = dificuldade;
	}

	public MecanicaDoJogo getMecanicaDoJogo() {
		if(this.dificuldade.equals("0")) {
			return new MecanicaDoJogoFacil();
		} else if(this.dificuldade.equals("1")) {
			return new MecanicaDoJogoMedio();
		}
		
		return new MecanicaDoJogoDificil();
	}
}