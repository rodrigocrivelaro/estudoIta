package fabricas;

import acessorias.GeraAleatorio;
import embaralhadores.EmbaralhadorAoContrario;
import embaralhadores.EmbaralhadorImparPar;
import embaralhadores.EmbaralhadorParImpar;
import interfaces.Embaralhador;

public class FabricaEmbaralhadores {

	public Embaralhador getEmbaralhador(String num) {

		int numAleatorio = new GeraAleatorio(11).getNumAleatorio();
		
		if(num.equals("0")) {
			return new EmbaralhadorAoContrario();
		} else if(num.equals("1")) {
			return numAleatorio < 3 ? new EmbaralhadorParImpar() : new EmbaralhadorAoContrario();
		} 
		
		return numAleatorio == 0 ? new EmbaralhadorAoContrario() : numAleatorio < 6 ? new EmbaralhadorParImpar() : new EmbaralhadorImparPar();
	}
}