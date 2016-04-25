package producao;

// Respeitoso: deve receber em seu construtor a informação se é masculino ou feminino, e retornar "Sr." ou "Sra." seguido do sobrenome
public class Respeitoso implements FormatadorNome {
	
	private String gen;
	
	public Respeitoso(String gen) {
		super();
		this.gen = gen;
	}
	
	public String getGen() {
		return gen;
	}

	@Override
	public String formatarNome(String nome, String sobrenome) {
		return getGen() == "Masculino" ? "Sr. " + sobrenome : "Sra. " + sobrenome;
	}

}
