package producao;

/*
 * Crie uma classe chamada Autoridade que possui atributos como nome, sobrenome e uma inst�ncia de FormatadorNome. Essa classe deve possuir 
 * um m�todo getTratamento() que delega a formata��o do nome para a inst�ncia de FormatadorNome.
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
