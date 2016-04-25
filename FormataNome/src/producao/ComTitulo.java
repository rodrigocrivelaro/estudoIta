package producao;

// ComTítulo: deve receber em seu construtor o título e retornar o título seguido de nome e sobrenome. Exemplo: "Magnífico Pedro Cabral"
public class ComTitulo implements FormatadorNome {
	
	private String titulo;
	
	
	public ComTitulo(String titulo) {
		super();
		this.titulo = titulo;
	}

	private String getTitulo() {
		return this.titulo;
	}
	
	@Override
	public String formatarNome(String nome, String sobrenome) {
		return getTitulo() + " " + nome + " " + sobrenome;
	}



}
