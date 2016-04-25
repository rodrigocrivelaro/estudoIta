
public class Candidato implements Comparable<Candidato> {
	private int nota;
	private boolean deficiente;
	private int idade;
	
	

	public Candidato(int nota, boolean deficiente, int idade) {
		super();
		this.nota = nota;
		this.deficiente = deficiente;
		this.idade = idade;
	}
	
	public int getNota() {
		return nota;
	}

	public boolean isDeficiente() {
		return deficiente;
	}

	public int getIdade() {
		return idade;
	}
	
	@Override
	public int compareTo(Candidato outro) {
		if(this.nota == outro.nota) {
			if(this.isDeficiente() == outro.isDeficiente()){
				return this.getIdade() - outro.getIdade();
			} else{
				if(isDeficiente()) {
					return 1;
				}else {
					return -1;
				}
			}
		} else {
			return this.getNota() - outro.getNota();
		}
	}
	
	@Override
	public String toString() {
		return "Nota: " + getNota() + "; Portador De Deficiência?: " + isDeficiente() + "; Idade: " +getIdade();
	}
}
