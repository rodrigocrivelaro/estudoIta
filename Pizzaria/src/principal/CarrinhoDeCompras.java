package principal;
import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
	List<Pizza> pizzas = new ArrayList<Pizza>();
	private int qtdPizzas = 0;
	double totalCompra = 0;
	
	public int getQtdPizzas() {
		return qtdPizzas;
	}

	public void adicionaPizza(Pizza p) {
		if(p.getQtdIngrdPizza() > 0) {
			pizzas.add(p);
			qtdPizzas++;
		} else {
			System.out.println("Pizza sem ingrdientes não podem ser compradas!");
		}
	}

	public double getTotal() {
		for (Pizza pizza : pizzas) {
			totalCompra += pizza.getPreco();
		}
		return totalCompra;
	}

}
