package producao;

/*
 * Crie uma classe chamada ProdutoComTamanho que estenda a classe Produto. Essa classe deve possuir uma informa��o adicional de tamanho. 
 * Um exemplo seria o tamanho de uma roupa ou a numera��o de um cal�ado. 
**/

public class ProdutoComTamanho extends Produto {
	private int tamanho;
	
	public ProdutoComTamanho(String nome, int codigo, double preco, int tamanho) {
		super(nome, codigo, preco);
		this.tamanho = tamanho;
	}

	/*
	 * M�todo equals() e hashCode() devem ser sobrescritos de forma que um produto com mesmo c�digo e tamanhos diferentes s�o considerados 
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
