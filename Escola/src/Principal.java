
public class Principal {

	public static void main(String[] args) {
		Aluno a1 = new Aluno();
		a1.bim1 = 75;
		a1.bim2 = 45;
		a1.bim3 = 35;
		a1.bim4 = 40;
		
		String passou = (a1.passouDeAno()?"passou":"n�o passou");
		
		System.out.println("A m�dia do aluno �: " + a1.media());
		System.out.println("O aluno " + passou + " de ano.");
	}

}
