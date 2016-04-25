package embaralhadores;

import interfaces.Embaralhador;

public class EmbaralhadorAoContrario implements Embaralhador {

	@Override
	public String embaralhar(String palavra) {
		StringBuffer sb = new StringBuffer(palavra);
		sb.reverse();
		palavra = sb.toString();
		return palavra;
	}

}
