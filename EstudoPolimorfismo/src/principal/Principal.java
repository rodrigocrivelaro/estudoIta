package principal;

import classes.Bateria;
import classes.Cachorro;
import classes.Carro;
import classes.Vuvuzela;
import interfaces.Barulhento;

public class Principal {

	public static void main(String[] args) {
		Barulhento[] barulhentos = new Barulhento[10];
		
		barulhentos[0] = new Cachorro();
		barulhentos[1] = new Bateria();
		barulhentos[2] = new Carro();
		barulhentos[3] = new Cachorro();
		barulhentos[4] = new Cachorro();
		barulhentos[5] = new Bateria();
		barulhentos[6] = new Bateria();
		barulhentos[7] = new Vuvuzela();
		barulhentos[8] = new Carro();
		barulhentos[9] = new Cachorro();
		
		sons(barulhentos);
	}

	private static void sons(Barulhento[] barulhentos) {
		for (Barulhento b : barulhentos) {
			System.out.println(b.fazerBarulho());
		}
	}

}
