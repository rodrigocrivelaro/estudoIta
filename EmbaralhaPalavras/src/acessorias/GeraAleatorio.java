package acessorias;

import java.util.Random;

public class GeraAleatorio {
	private int num;

	public GeraAleatorio(int num) {
		this.num = num;
	}
	
	public int getNumAleatorio() {
		return getNumeroAleatorio(num);
	}
	
	private Integer getNumeroAleatorio(int n) {
		Integer numAleatorio = new Random().nextInt(n);
		return numAleatorio;
	}
}