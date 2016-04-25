package producao;

/*
 * Crie uma classe chamada Autoridade que possui atributos como nome, sobrenome e uma instância de FormatadorNome. Essa classe deve possuir 
 * um método getTratamento() que delega a formatação do nome para a instância de FormatadorNome.
 */

public class Autoridade {
	protected String nome;
	protected String sobreNome;
	protected FormatadorNome fN;
	
	public Autoridade(String nome, String sobreNome, FormatadorNome fN) {
		super();
		this.nome = nome;
		this.sobreNome = sobreNome;
		this.fN = fN;
	}

	public String getTratamento(){
		return fN.formatarNome(nome, sobreNome);
	}
	
}
