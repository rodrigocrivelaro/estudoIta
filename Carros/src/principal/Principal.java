package principal;

import modelos.CarroMult;
import modelos.CarroSoma;

public class Principal {

	public static void main(String[] args) {
		Corrida corrida = new Corrida(2000);
		corrida.adicionaCarro(new CarroSoma("CarroA", 10, 130));
		corrida.adicionaCarro(new CarroSoma("CarroB", 8, 180));
		corrida.adicionaCarro(new CarroMult("CarroC", 1.7, 110));
		corrida.adicionaCarro(new CarroMult("CarroD", 1.4, 120));
		corrida.umDoisTresEJa();
	}

}
