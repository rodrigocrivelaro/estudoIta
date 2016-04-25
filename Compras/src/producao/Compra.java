package producao;

/*
 * Crie uma classe chamada Compra que recebe o valor da compra no construtor e o armazena em um atributo.
 */

public class Compra {
	
	private double valor;
	private double total;
	
	public Compra(double val) {
		 this.valor = val;
	}
	
	/*
	 * Essa classe deve possuir o método total() que retorna o valor total da compra.
	 */
	
	public double getTotal() {
		total = this.valor;
		return total;
	}
}
