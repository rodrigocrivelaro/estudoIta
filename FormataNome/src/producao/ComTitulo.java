package producao;

// ComT�tulo: deve receber em seu construtor o t�tulo e retornar o t�tulo seguido de nome e sobrenome. Exemplo: "Magn�fico Pedro Cabral"
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
