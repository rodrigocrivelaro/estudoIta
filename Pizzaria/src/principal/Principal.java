package principal;

public class Principal {

	public static void main(String[] args) {
		Pizza p1 = new Pizza();
		p1.adicionaIngrediente("Tomate", 5);
		p1.adicionaIngrediente("Cebola", 2);
		p1.adicionaIngrediente("Mussarela", 10);
		
		Pizza p2 = new Pizza();
		p2.adicionaIngrediente("Mussarela", 5);
		p2.adicionaIngrediente("Cebola", 2);
		
		Pizza p3 = new Pizza();
		p3.adicionaIngrediente("Tomate", 5);
		p3.adicionaIngrediente("Calabreza", 10);
		p3.adicionaIngrediente("Cebola", 15);
		p3.adicionaIngrediente("Mussarela", 5);
		p3.adicionaIngrediente("Baycon", 15);
		p3.adicionaIngrediente("Orégano", 51);
		p3.adicionaIngrediente("Azeitona", 18);
		
		CarrinhoDeCompras c1 = new CarrinhoDeCompras();
		c1.adicionaPizza(p1);
		c1.adicionaPizza(p2);
		c1.adicionaPizza(p3);
		
		System.out.println("Total da Compra: "+ c1.getQtdPizzas() + " pizza(as) no valor de R$ "+ c1.getTotal());
		System.out.println("Ingredientes pizzaria: " + Pizza.ingredientesPizzaria);
	}

}
