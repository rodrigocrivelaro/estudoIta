package principal;
import java.util.HashMap;
import java.util.Map;

public class Pizza {
	Map<String,Integer> ingredientesPizza = new HashMap<String,Integer>();
	public static Map<String,Integer> ingredientesPizzaria = new HashMap<String,Integer>();
	double preco = 0.0;
	private int qtdIngrdPizza = 0;
	
	public int getQtdIngrdPizza() {
		return qtdIngrdPizza;
	}

	public void adicionaIngrediente(String ingrediente, int quantidade) {
		ingredientesPizza.put(ingrediente, quantidade);
		contabilizaIngrediente(ingrediente, quantidade);
		qtdIngrdPizza++;
	}
	
	static void contabilizaIngrediente(String ingrediente, int quantidade) {
		if(ingredientesPizzaria.containsKey(ingrediente)) {
			Integer qtd = ingredientesPizzaria.get(ingrediente);
			qtd += quantidade;
			ingredientesPizzaria.put(ingrediente, qtd);
			return;
		}
		ingredientesPizzaria.put(ingrediente, quantidade);
		
	}

	public double getPreco() {
		if(qtdIngrdPizza <= 2) {
			return preco = 15.0;
		} else if(qtdIngrdPizza <= 5) {
			return preco = 20.0;
		}
		
		return preco = 23.0;
	}

	public static void zeraIngredientesPizzaria() {
		ingredientesPizzaria = new HashMap<String,Integer>();
	}
}
