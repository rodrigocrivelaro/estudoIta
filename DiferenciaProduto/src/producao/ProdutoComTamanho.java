package producao;

/*
 * Crie uma classe chamada ProdutoComTamanho que estenda a classe Produto. Essa classe deve possuir uma informação adicional de tamanho. 
 * Um exemplo seria o tamanho de uma roupa ou a numeração de um calçado. 
**/

public class ProdutoComTamanho extends Produto {
	private int tamanho;
	
	public ProdutoComTamanho(String nome, int codigo, double preco, int tamanho) {
		super(nome, codigo, preco);
		this.tamanho = tamanho;
	}

	/*
	 * Método equals() e hashCode() devem ser sobrescritos de forma que um produto com mesmo código e tamanhos diferentes são considerados 
	 * diferentes.
	**/
	
	@Override
	public int hashCode() {
		return tamanho;
	}
	
	@Override
	public boolean equals(Object obj) {
		ProdutoComTamanho prd = (ProdutoComTamanho) obj;
		if(prd.getCodigo() == this.getCodigo() && prd.hashCode() == this.tamanho)
			return true;
		return false;
	}
}
