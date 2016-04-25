package producao;

/*
 * Instruções:
 * Crie uma classe chamada Produto que deve possuir um nome, um código e um preço. 
**/

public class Produto {
	
	private String nome;
	private int codigo;
	private double preco;
	
	public Produto(String nome, int codigo, double preco) {
		this.nome = nome;
		this.codigo = codigo;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public double getPreco() {
		return preco;
	}

	public int getCodigo() {
		return codigo;
	}
	
	/*
	 * Sobrescreva os métodos equals() e hashCode() de Object de forma a serem considerados iguais instancias de Produto que possuam o mesmo 
	 * código.
	**/
	
	@Override
	public int hashCode() {
		return codigo;
	}
	
	@Override
	public boolean equals(Object obj) {
		Produto prod = (Produto) obj;
		if(prod.hashCode() == this.codigo) 
			return true;
		return false;
	}

}